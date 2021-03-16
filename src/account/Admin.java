/**
 * 
 */
package account;

/**
 * CMC Admin Class
 * 
 * @author fireWallFive
 *
 */
public class Admin extends Person{

	/**
	 * Creates admin
	 * @param u the admin's username
	 * @param p the password
	 * @param f the first name
	 * @param l the last name
	 * @param t the type
	 */
	public Admin(String f, String l, String u, String p) {
		this.un = u;
		this.pass = p;
		this.fn = f;
		this.ln = l;
		this.status = "Y";
		this.type = "a";
		
	}
	/**
	 * Creates admin
	 */
	public Admin()
	{
		this.un = "";
		this.pass = "";
		this.fn = "";
		this.ln = "";
		this.status = "Y";
		this.type = "a";
	}

}
