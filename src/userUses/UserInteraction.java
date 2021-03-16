/**
 * 
 */
package userUses;


import java.util.List;

import account.AccountController;
import account.Person;
import account.User;
import cmc.DBController;
import cmc.School;
import cmc.SearchController;

/**
 * CMC UserInteraction Class
 * 
 * @author fireWallFive
 *
 */
public class UserInteraction {
	
	//private User loginUser;
	
	/**
	 * Constructs a UserInteraction
	 */
	public UserInteraction() {
		
		
	}
	/**
	 * Tells account controller to check user credentials
	 * @param un username
	 * @param pass password
	 * @return boolean result, true if credentials are valid otherwise false
	 */
	public static boolean login(String un, String pass) {
		boolean result = AccountController.login(un, pass);
		//loginUser = AccountController.loggedIn();
		return(result);
	}
	
	/**
	 * user can edit profile
	 * @param fn first name
	 * @param ln last name
	 * @param pass password
	 */
	public static void editProfile(String fn, String ln, String pass) {
		User user = AccountController.editProfile(fn, ln, pass);
		if(fn == "" || ln == "" || pass== "") {
			System.out.println("Error: All parameters must be filled.");
		}			
	}
	
	/**
	 * user can view a school
	 * @param n name of school
	 * @return School
	 */
	public School viewSchool(String n) {
		return null;
		
	}
	
	/**
	 * user can view their profile
	 * @param un username
	 * @return User user's profile
	 */
	public static User viewProfile() {
		User user = AccountController.viewProfile();
		return user;
		
	}
	
	/**
	 * user can view their search results
	 * @param schoolList list of schools
	 * @return String list of schools formatted as a string
	 */
	public static String viewSearchResults(List<School> schoolList) {
		String list = SearchController.viewSearchResults(schoolList);
		return list;	
	}
	
	/**
	 * user can save a school
	 * @param n username, n2 name of school
	 */
	public static void saveSchool(String n, String n2) {
		//School savedSchool = 
	    AccountController.saveSchool(n, n2);
		//loginUser.getSavedSchools().add(savedSchool);
		
	}
	
	/**
	 * allows users to search for school by combination of state and number of students
	 * @param s state
	 * @param numSt1 number of students lower bound
	 * @param numSt2 number of students upper bound
	 * @return List<School> list of schools that match search criteria
	 */
	public static List<School> search(String s, int numSt1, int numSt2) {
		List<School> schools = SearchController.search(s, numSt1, numSt2);
		
		if(schools.isEmpty()) {
			System.out.println("No schools found.");
		}
		
		 return schools;
		
	}
	
	/**
	 * user can search for schools by many categories 
	 * @param n
	 * @param s
	 * @param loc
	 * @param contr
	 * @param numSt1
	 * @param numSt2
	 * @param percFem1
	 * @param percFem2
	 * @param satVerb1
	 * @param satVerb2
	 * @param satMath1
	 * @param satMath2
	 * @param exp1
	 * @param exp2
	 * @param percFin1
	 * @param percFin2
	 * @param numApp1
	 * @param numApp2
	 * @param percAdd1
	 * @param percAdd2
	 * @param percEnr1
	 * @param percEnr2
	 * @param acScale1
	 * @param acScale2
	 * @param socScale1
	 * @param socScale2
	 * @param qualLife1
	 * @param qualLife2
	 * @param emp1
	 * @param emp2
	 * @param emp3
	 * @param emp4
	 * @param emp5
	 * @return List<School>
	 */
	
	public List<School> search(String n, String s, String loc, String contr,
			int numSt1, int numSt2, int percFem1, int percFem2, int satVerb1,
			int satVerb2, int satMath1, int satMath2, int exp1, int exp2,
			int percFin1, int percFin2, int numApp1, int numApp2, int percAdd1,
			int percAdd2, int percEnr1, int percEnr2, int acScale1, int acScale2,
			int socScale1, int socScale2, int qualLife1, int qualLife2, String emp1,
			String emp2, String emp3, String emp4, String emp5){
		return null;
		
	}
	
	/**
	 * user can view list of saved schools 
	 * @param n username
	 * @return String list of saved schools formatted as a string
	 */
	public static List<School> viewSavedSchools(){
		List<School> list = AccountController.viewSavedSchools();
		return list;
		
	}
	
	/**
	 *  user can remove schools from their saved schools list
	 * @param n name of school they want to remove
	 */
	public void removeSavedSchool(String n) {
		
	}
	
	/**
	 * user can add a school to their reach school list
	 * @param n name of school
	 */
	public void addToReachSchoolList(String n) {
		
	}
	
	/**
	 * user can add a school to their safe school list
	 * @param n name of school
	 */
	public void addToSafeSchoolList(String n) {
		
	}
	
	/**
	 * user can view their reach schools list
	 * @return List<School> a list of their reach schools
	 */
	public List<School> viewReachSchools(){
		return null;
		
	}
	
	/**
	 * user can view their safe schools list
	 * @return List<School> a list of their safe schools
	 */
	public List<School> viewSafeSchools(){
		
		return null;
		
	}
	
	/**
	 * compare schools
	 * @param n1 name of first school
	 * @param n2 name of second school
	 * @return List<School> list of the two schools
	 */
	public List<School> compareSchools(String n1, String n2){
		
		return null;
		
	}
	
	/**
	 * View recommended schools for a given school
	 * @param n name of school
	 * @return String list of the recommended schools formatted as a string
	 */
	public static String viewRecommendedSchools(String n) {
		String recSchools = SearchController.viewRecommendedSchools(n);
		return recSchools;
	}

}
