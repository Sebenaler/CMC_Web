/**
 * 
 */
package account;
import java.util.List;

import cmc.DBController;
import cmc.School;
/**
 * CMC AccountController Class
 * 
 * @author fireWallFive
 *
 */
public class AccountController {
	
	
    //private static User currentAccount;
    
	public static User currentLoggedInU = new User();
	public static Admin currentLoggedInA = new Admin();
	public static Person currentLoggedIn = currentLoggedInU;
	/**
	 * Constructs an AccountController
	 */
	public AccountController() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * retrieves user by username and checks user's credentials
	 * @param un username
	 * @param pass password
	 * @return boolean true if user's credentials are valid otherwise false
	 */
	public static boolean login(String un, String pass) {
		Person currentUser = DBController.getUserByUsername(un);
		//currentAccount = (User) DBController.getUserByUsername(un);
		if(currentUser.getUn().equals(un) && currentUser.getPass().equals(pass)) {
			if(currentUser.getType().equals("a"))
			{
				currentLoggedInA = (Admin) currentUser;
				currentLoggedIn = currentLoggedInA;
			}
			else
			{
				currentLoggedInU = (User) currentUser;
				currentLoggedIn = currentLoggedInU;
			}
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * keeps track of current person
	 * @return
	 */

	
	/**
	 * user can view profile
	 * @param un username
	 * @return User the user of the profile being viewed
	 */
	public static User viewProfile() {
		User currentUser = (User) DBController.getUserByUsername(currentLoggedIn.getUn());
		return currentUser;
	}
	
	/**
	 * user can edit profile
	 * @param fn first name
	 * @param ln last name
	 * @param pass password
	 * @return User the user of the profile being edited
	 */
	public static User editProfile(String fn, String ln, String pass) {
		User currentUser = (User) DBController.getUserByUsername(currentLoggedIn.getUn());
		if(fn != "" && ln != "" && pass!= "") {
			currentUser.setFn(fn);
			currentUser.setLn(ln);
			currentUser.setPass(pass);
			DBController.updateUserData(fn, ln, pass, currentLoggedIn);
			return currentUser;
			
		}
		
		else {
			//System.out.println("Error: All parameters must be filled");
			return currentUser;
		}
			
		
	}
	
	/**
	 * adds school to saved school list
	 * @param name username
	 * @param schName name of school
	 */
	public static void saveSchool(String name, String schName) {
		/*List<School> list = DBController.getSchoolList();
		for(int i = 0; i < list.size(); i++) {
			School currentSchool = list.get(i);
			if(currentSchool.getName().equals(schName)) {
			DBController.getUserByUsername(name).getSavedSchools().add(currentSchool);
			}*/
		DBController.saveSchool(name, schName);
	}
		
	

	/**
	 * user can view saved schools
	 * @param un username
	 * @return String list of user's saved schools formatted as a string
	 */
	public static List<School> viewSavedSchools() {
		List<School> list = DBController.viewSavedSchools(currentLoggedIn.getUn());
		return list;
		/*String schools = currentLoggedIn.getUn() + "'s Saved schools: \n";
		for(int i = 0; i < list.size(); i++) {
			School currentSchool = list.get(i);
			schools += "Name: " + currentSchool.getName() + "\nState: " +
			currentSchool.getState() + "\nNumber Of Students: " + currentSchool.getNumStudents() + "\n\n";
	    }
		return schools;*/
    }
}
