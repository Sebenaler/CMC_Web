/**
 * 
 */
package adminUses;

import java.util.List;

import account.Person;
import cmc.School;
import cmc.SearchController;
/**
 * CMC AdminInteraction Class
 * 
 * @author fireWallFive
 *
 */
public class AdminInteraction {
	
	/**
	 * Constructs an AdminInteraction
	 */
	public AdminInteraction(){
		
	}
	
	/**
	 * admin can add a school to the database 
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
	 */
	public void addSchool(String n, String s, String loc, String contr,
			int numSt1, int numSt2, int percFem1, int percFem2, int satVerb1,
			int satVerb2, int satMath1, int satMath2, int exp1, int exp2,
			int percFin1, int percFin2, int numApp1, int numApp2, int percAdd1,
			int percAdd2, int percEnr1, int percEnr2, int acScale1, int acScale2,
			int socScale1, int socScale2, int qualLife1, int qualLife2, String emp1,
			String emp2, String emp3, String emp4, String emp5) {
		
	}
	
	/**
	 * admin can edit a school in the database 
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
	 */
	public void editSchool(String n, String s, String loc, String contr,
			int numSt1, int numSt2, int percFem1, int percFem2, int satVerb1,
			int satVerb2, int satMath1, int satMath2, int exp1, int exp2,
			int percFin1, int percFin2, int numApp1, int numApp2, int percAdd1,
			int percAdd2, int percEnr1, int percEnr2, int acScale1, int acScale2,
			int socScale1, int socScale2, int qualLife1, int qualLife2, String emp1,
			String emp2, String emp3, String emp4, String emp5) {
		
	}
	
	/**
	 * admin can remove a school from the database
	 * @param n name of school they want to remove
	 */
	public void removeSchool(String n) {
		
	}
	
	/**
	 * admin can add a user to the system
	 * @param u username
	 * @param p password
	 * @param f first name
	 * @param l last name
	 * @param t type of person
	 */
	public void addAccount(String f, String l, String u, String p, String t) {
		
	}
	
	/**
	 * admin can edit user in the system
	 * @param p password
	 * @param f first name
	 * @param l last name
	 * @param t type of person
	 * @param s status of person
	 */
	public void editAccount(String f, String l, String p, String t, String s) {
		
	}
	
	/**
	 * admin can deactivate an account
	 * @param un username
	 */
	public void deactivateAccount(String un) {
		
	}
	
	/**
	 * admin can view accounts
	 * @return String list of all accounts formatted as a string
	 */
	public static String viewPersons(){
		String persons = AdminFunctionalityController.viewPersons();
		return persons;
		
	}
	
	/**
	 * admin can view schools in the database
	 * @return String list of schools in database formatted as a string
	 */
	public static String viewSchools(){
		String schools = AdminFunctionalityController.viewSchools();
		return schools;
		
	}
	
	/**
	 * admin can add a school to the user's saved school list
	 * @param n
	 * @parm un username
	 */
	public void addSchoolToUsersSavedSchoolList(String n, String un) {
		
	}
	
	

}
