/**
 * 
 */
package cmc;
import java.util.ArrayList;
import java.util.List;

import account.Admin;
import account.Person;
import account.User;
import dblibrary.project.csci230.UniversityDBLibrary;

/**
 * CMC DBController Class
 * 
 * @author fireWallFive
 *
 */
public class DBController {
	//Creates an object for our DBLibrary
	static UniversityDBLibrary myLib = new UniversityDBLibrary("firewall", "csci230");
	
	//dummy data of user and schools
	
	//schools in SJU's recommended schools list
	static School gustavus = new School("Gustavus", "Minnesota", "2400");
	static School carleton = new School("Carleton", "Minnesota", "2000");
	//SJU's recommended schools list
	static List<School> sjuRecSchools = new ArrayList<School>() {{
	add(gustavus);
	add(carleton);
	}};	
	
	//Users & admins in database
	static User luke = new User("Luke","McElroy", "lmcelroy", "pass123");
	static User owen = new User("Owen", "Dauk", "odauk", "password");
	static Admin joe = new Admin("Joe", "Mama", "jmama", "urmamma");
	
	//Schools in database
    static School byu = new School("BYU", "Utah", "32000");
	static School utahState = new School("Utah State", "Utah", "30000");
	static School sju = new School("SJU", "Minnesota", "2500", sjuRecSchools);
	static School utahSchool = new School("Utah School", "Utah", "15000");
	
	//List of all schools in database
	static List<School> schoolList = new ArrayList<School>() {{
	add(byu);
	add(utahState);
	add(sju);
	add(utahSchool);
	add(gustavus);
	add(carleton);
	}};
	
	//List of all users in database
	static List<User> userList = new ArrayList<User>() {{
		add(luke);
		add(owen);
	}};
	
	//List of all accounts in database
	static List<Person> personList = new ArrayList<Person>() {{
		add(luke);
		add(owen);
		add(joe);
		}};
		
		/**
		 * returns list of all schools in the database
		 * 
		 * @return List<School> list of all schools
		 *
		 */
	public static List<School> getSchoolList(){
		String[][] schools = myLib.university_getUniversities();
		List<School> schoolList = new ArrayList<School>();
		for(int i = 0; i < schools.length;i++)
		{
			String name = schools[i][0];
			String state = schools[i][1];
			String numStudents = schools[i][4];
			School school = new School(name, state, numStudents);
			schoolList.add(school);
		}
		return schoolList;
	}

	/**
	 * returns user by their username
	 * 
	 * @param userName username
	 * @return User user that corresponds with param userName
	 *
	 */
	public static Person getUserByUsername(String userName) {
		String[][] users = myLib.user_getUsers();
		for(int i = 0; i < users.length; i++)
		{
			if(users[i][2].equals(userName))
			{
				String firstName = users[i][0];
				String lastName = users[i][1];
				String userN = users[i][2];
				String pass = users[i][3];
				if(users[i][4].equals("a"))
				{
					Admin admin = new Admin(firstName, lastName, userN, pass);
					return admin;
				}
				else
				{
					User user = new User(firstName, lastName, userN, pass);
					return user;
				}
			}
		}	
		User user = new User();
		return user;
	}
	
	/**
	 * returns list of accounts in the database
	 * 
	 * @return List<Person> list of accounts
	 */
	public static List<Person> getPersonList(){
		String[][] users = myLib.user_getUsers();
		List<Person> persons = new ArrayList<Person>();
		for(int i = 0; i < users.length; i++)
		{
			String firstName = users[i][0];
			String lastName = users[i][1];
			String userN = users[i][2];
			String pass = users[i][3];
			if(users[i][4].equals("a"))
			{
				Admin admin = new Admin(firstName, lastName, userN, pass);
				persons.add(admin);
			}
			else
			{
				User user = new User(firstName, lastName, userN, pass);
				persons.add(user);
			}

		}	
		return persons;
	}
	
	/**
	 * updates user data in the database
	 * 
	 * @param fn first name
	 * @param ln last name
	 * @param pass password
	 */
	public static void updateUserData(String fn, String ln, String pass, Person loggedIn) {
		char type, status;
		type = loggedIn.getType().charAt(0);
		status = loggedIn.getStatus().charAt(0);
		myLib.user_editUser(loggedIn.getUn(), fn, ln, pass, type, status);
	}
	/**
	 * adds a person to the database
	 * 
	 * @param String fn is a first name
	 * @param Strin ln is a last name
	 * @param String un is a user name
	 * @param String pass is a password
	 * @param char ty is a person type
	 */
	public static void addPerson(String fn, String ln, String un, String pass, char ty)
	{
		myLib.user_addUser(fn, ln, un, pass, ty);
	}
	/**
	 * removes a person from the database
	 * 
	 * @param String un is a user name of person being removed
	 */
	public static void removePerson(String un)
	{
		myLib.user_deleteUser(un);
	}
	/**
	 * add school to the database
	 * 
	 * @param String school is a school name
	 * @param String state is a state where school is located
	 * @param String loc is location of campus(urban, suburban...)
	 * @param String con is a control which means its private or state school
	 * @param int numStuds is the number of students 
	 * @param double percentFem is the percentage of females
	 * @param double satV is the average verbal sat score
	 * @param double satM is the average math sat score
	 * @param double expenses is the cost to attend
	 * @param double pFa is the percent of those who receive financial aid
	 * @param int numApps is the number of applicants
	 * @param double percAdmit is the percent of admitted students
	 * @param double percEnroll is the percent of enrolled students
	 * @param int scale is the academic scale
	 * @param int social is the social scale
	 * @param int qOLS is the quality of life
	 */
	public static void addSchool(String school, String state, String loc, String con, int numStuds,
			double percentFem, double satV, double satM, double expenses, double pFa, int numApps,
			double percAdmit, double percEnroll, int scale, int social, int qOLS)
	{
		myLib.university_addUniversity(school, state, loc, con, numStuds, percentFem, satV, satM, expenses, pFa,
				numApps, percAdmit, percEnroll, scale, social, qOLS);
		String numS = String.valueOf(numStuds);
		School s = new School(school, state, numS);
	}
	/**
	 * removes a school from the database
	 * 
	 * @param String schName is the name of school we want to remove
	 */
	public static void removeSchool(String schName)
	{
		myLib.university_deleteUniversity(schName);
	}
	/**
	 * saves a school to users save school list
	 * 
	 * @param String user name is the users user name
	 * @param String schName is the name of the school being saved
	 */
	public static void saveSchool(String username, String schName)
	{
		myLib.user_saveSchool(username, schName);
		
	}
	
	/**
	 * returns a school from the database when given a name
	 * @param String name is the name of the school being looked for in database
	 * @return School sch in database
	 */
	public static School getSchoolByName(String name) {
		String[][] schools = myLib.university_getUniversities();
		for(int i = 0; i < schools.length; i++)
		{
			if(schools[i][0].equals(name))
			{
				String nameSchool = schools[i][0];
				String state = schools[i][1];
				String loc = schools[i][2];
				String con = schools[i][3];
				String numStudents = schools[i][4];
				String percF = schools[i][5];
				String satV = schools[i][6];
				String satM = schools[i][7];
				String expen = schools[i][8];
				String percAid = schools[i][9];
				String numApps = schools[i][10];
				String percAdmit = schools[i][11];
				String percEnroll = schools[i][12];
				String aceScale = schools[i][13];
				String socScale = schools[i][14];
				String qOLS = schools[i][15];
				School school = new School(nameSchool, state,loc, con, numStudents, percF, satV, satM, expen, percAid, numApps, percAdmit, percEnroll,
						aceScale, socScale, qOLS);
				return school;
			}
		}	
		School sch = new School();
		return sch;
	}
	/**
	 * returns list of saved schools from the database when given a user
	 * @param String un is a user name of the user
	 * @return List<School> schools all the schools in users savedSchoolList
	 */
	public static List<School> viewSavedSchools(String un)
	{
		String[][] school = myLib.user_getUsernamesWithSavedSchools();
		List<School> schools = new ArrayList<School>();
		for(int i = 0; i < school.length; i++)
		{
			String username = school[i][0];
			String schoolName = school[i][1];
			if(un.equals(username))
			{
				School s = DBController.getSchoolByName(schoolName);
				schools.add(s);
			}
		
		}
		return schools;
	}
	/**
	 * returns list of recommended schools from the database when given a school
	 * @param String n is the name of school
	 * @return List<School> recSchools recommended schools for a given school
	 */
	public static List<School> viewRecommendedSchools(String n)
	{
		School s = DBController.getSchoolByName(n);
		String state = s.getState();
		String[][] schools = myLib.university_getUniversities();
		List<School> recSchools = new ArrayList<School>();
		for(int i = 0; i < schools.length; i++)
		{
			String name = schools[i][0];
			String st = schools[i][1];
			if(st.equals(state) && !(name.equals(n)))
			{
				School sch = DBController.getSchoolByName(name);
				recSchools.add(sch);
			}
		}
		return recSchools;
	}
}
