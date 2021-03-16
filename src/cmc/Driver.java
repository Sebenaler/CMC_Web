/**
 * 
 */
package cmc;

import account.User;
import adminUses.AdminInteraction;
import userUses.UserInteraction;

/**
 * CMC Driver Class
 * 
 * @author fireWallFive
 *
 */
public class Driver {
	
	/**Test scenarios for the viewSchools use case
	 * 
	 *
	 */
	public static void runViewSchools(AdminInteraction ai) {
		//test viewschools main scenario: (admin view schools)
		System.out.println("Testing viewSchools main scenario...");
		System.out.println(ai.viewSchools());
		
	}
	
	/**Test scenarios for the viewPersons use case
	 * 
	 *
	 */
	public static void runViewPersons(AdminInteraction ai) {
		//test viewPersons main scenario: (admin views accounts)
		System.out.println("Testing viewPersons main scenario...");
		System.out.println(ai.viewPersons());
	}
	
	/**Test scenarios for the viewRecommendedSchools use case
	 * 
	 *
	 */
	public static void runViewRecommendedSchools(UserInteraction ui){
		//test viewRecommendedSchools main scenario
		System.out.println("Testing viewRecommendedSchools main scenario...");
		System.out.println("Showing Recommended Schools for UNIVERSITY OF ALABAMA...");
		System.out.println(ui.viewRecommendedSchools("UNIVERSITY OF ALABAMA"));
	}
	
	//Entry point for the Driver
	
	public static void main(String[] args) {
		UserInteraction ui = new UserInteraction();
		AdminInteraction ai = new AdminInteraction();
		runViewSchools(ai);
		runViewPersons(ai);
		runViewRecommendedSchools(ui);
		
		
	}

}
