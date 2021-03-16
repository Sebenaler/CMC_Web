/**
 * 
 */
package cmc;

import java.util.ArrayList;
import java.util.List;

/**
 * CMC SearchController Class
 * 
 * @author fireWallFive
 *
 */
public class SearchController {
	

	/**
	 * searches for schools based on state and number of students
	 * 
	 * @param s school's state
	 * @param numSt1 lower boundary 
	 * @param numSt2 upper boundary
	 * @return List<School> list of schools that meet search criteria
	 *
	 */
	public static List<School> search(String s, int numSt1, int numSt2) {
		List<School> schoolList = DBController.getSchoolList();
		List<School> returnList = new ArrayList<School>();
		for(int i = 0; i < schoolList.size(); i++) {
			School currentSchool = schoolList.get(i);
			int numStudents = Integer.parseInt(currentSchool.getNumStudents());
			if(numSt1 == -1 && numSt2 == -1)
			{
				if(s == "" || s == null)
				{
					returnList.add(currentSchool);
				}
				
				if(currentSchool.getState().equals(s)) {
					returnList.add(currentSchool);
				}
			}
			
			if (s == "" || s == null)
			{
				if(numStudents>=numSt1 && numStudents<=numSt2)
				{
					returnList.add(currentSchool);
				}
			}
			
			if (currentSchool.getState().equals(s) && numStudents>=numSt1 && numStudents<=numSt2) {
				returnList.add(currentSchool);
				
			}
		}
		return returnList;
		
	}
	
	/**
	 * displays search results for schools in the form of a string based on state and number of students
	 * 
	 * @param List<School> list of schools that meet search criteria
	 * @return String list of schools that meet search criteria in the form of a string
	 *
	 */
	public static String viewSearchResults(List<School>schoolList) {
		
	    String schools = "Search Results: \n";
		for(int i = 0; i < schoolList.size(); i++) {
			School currentSchool = schoolList.get(i);
			schools += "Name: " + currentSchool.getName() + "\nState: " +
			currentSchool.getState() + "\nNumber Of Students: " + currentSchool.getNumStudents() + "\n\n";
			
	}
		return schools;

}
	
	/**
	 * displays list of recommended schools for a given school 
	 * 
	 * @param n name of school
	 * @return String list of recommended schools for a given school in the form of a string
	 *
	 */
	public static String viewRecommendedSchools(String n) {
		List<School> schools = DBController.getSchoolList();
		for(int i = 0; i < schools.size(); i++) {
			School currentSchool = schools.get(i);
			if(currentSchool.getName().equals(n)) {
				List<School> recSchools = DBController.viewRecommendedSchools(n);
				String recSchoolsString = currentSchool.getName() + "'s Recommended Schools: \n";
				for(int j = 0; j<recSchools.size(); j++) {
					School currentRecSchool = recSchools.get(j);
					recSchoolsString += "Name: " + currentRecSchool.getName() + "\nState: " +
					currentRecSchool.getState() + "\nNumber Of Students: " + currentRecSchool.getNumStudents() + "\n\n";
				}
				return recSchoolsString;
			}
		}
		return "";
	}
}
