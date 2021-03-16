/**
 * 
 */
package account;

import java.util.ArrayList;
import java.util.List;

import cmc.School;

/**
 * CMC User Class
 * 
 * @author fireWallFive
 *
 */
public class User extends Person{

	/**
	 * list of user's saved schools
	 */
	private List<School> savedSchools, reachSchools, safeSchools, compareSchools;
	
	/**
	 * Creates user
	 * @param u the user username
	 * @param p the password
	 * @param f the first name
	 * @param l the last name
	 * @param t the type
	 */
	public User(String f, String l, String u, String p) {
		this.un = u;
		this.pass = p;
		this.fn = f;
		this.ln = l;
		this.status = "Y";
		this.type = "u";
		this.savedSchools = new ArrayList<School>();
		
		
	}
	
	/**
	 * Constructs a User
	 */
	public User() {
		this.un = "";
		this.pass = "";
		this.fn = "";
		this.ln = "";
		this.status = "Y";
		this.type = "u";
		this.savedSchools = new ArrayList<School>();
	}


	public List<School> getSavedSchools() {
		return this.savedSchools;
	}


	public void setSavedSchools(List<School> savedSchools) {
		this.savedSchools = savedSchools;
	}



	public List<School> getReachSchools() {
		return reachSchools;
	}



	public void setReachSchools(List<School> reachSchools) {
		this.reachSchools = reachSchools;
	}



	public List<School> getSafeSchools() {
		return safeSchools;
	}



	public void setSafeSchools(List<School> safeSchools) {
		this.safeSchools = safeSchools;
	}



	public List<School> getCompareSchools() {
		return compareSchools;
	}



	public void setCompareSchools(List<School> compareSchools) {
		this.compareSchools = compareSchools;
	}
	
	
	
	

}
