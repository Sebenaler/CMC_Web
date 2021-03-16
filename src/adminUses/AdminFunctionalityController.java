/**
 * 
 */
package adminUses;

import java.util.List;

import account.Person;
import cmc.DBController;
import cmc.School;

/**
 * CMC AdminFunctionalityController Class
 * 
 * @author fireWallFive
 *
 */
public class AdminFunctionalityController {
	/**
	 * shows list of schools in database
	 * @return String list of schools formatted as a string
	 */
	public static String viewSchools(){
		List<School> list = DBController.getSchoolList();
		String schools = "Schools: \n";
		for(int i = 0; i < list.size(); i++) {
			School currentSchool = list.get(i);
			schools += "Name: " + currentSchool.getName() + "\nState: " +
			currentSchool.getState() + "\nNumber Of Students: " + currentSchool.getNumStudents() + "\n\n";
			
	}
		
		return schools;
	}
	
	/**
	 * shows list of accounts in database
	 * @return String list of accounts formatted as a string
	 */
	public static String viewPersons() {
		List<Person> list = DBController.getPersonList();
		String persons = "Accounts: \n";
		for(int i = 0; i < list.size(); i++) {
			Person currentPerson = list.get(i);
			persons += "First Name: " + currentPerson.getFn() + "\nLast Name: " +
					currentPerson.getLn() + "\nUsername " + currentPerson.getUn() 
					+ "\nPassword: " + currentPerson.getPass() + "\nType: " + 
					currentPerson.getType() + "\nStatus: " + currentPerson.getStatus() + "\n\n";
		}
		return persons;
	}
	
	

}
