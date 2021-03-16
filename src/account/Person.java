/**
 * 
 */
package account;

/**
 * CMC Person Abstract Class
 * 
 * @author fireWallFive
 *
 */
public abstract class Person {
	
	/*instance variables that describe a person*/
    String un, pass, fn, ln;
    String type;
	String status;


	public String getUn() {
		return un;
	}

	public void setUn(String un) {
		this.un = un;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFn() {
		return fn;
	}

	public void setFn(String fn) {
		this.fn = fn;
	}

	public String getLn() {
		return ln;
	}

	public void setLn(String ln) {
		this.ln = ln;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Profile: \nFirst Name: " + fn + "\nLast Name: " + ln + "\nUsername: " + un
				+ "\nPassword: " + pass + "\nType: " + type;
	}
	
	
	
	
	
     

	
	


}
