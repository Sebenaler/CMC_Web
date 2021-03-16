/**
 * 
 */
package cmc;

import java.util.List;

/**
 * CMC School Class
 * 
 * @author fireWallFive
 *
 */
public class School {
	
	//School instance variables
	private String name, state, location, control,
	emphasis1, emphasis2, emphasis3, emphasis4, emphasis5;
	private String numStudents, percentFemale, satVerbal, satMath, expenses,
	percentAid, numApplicants, percentAdmitted, percentEnrolled, academicScale,
	socialScale, qualityOfLife;
	private List<School> recommendedSchools;
	
	/**
	 * Constructs a School
	 */
	public School() {
		this.name="";
		this.state = "";
		this.location = "";
		this.control = "";
		this.numStudents = "";
		this.percentFemale = "";
		this.satVerbal = "";
		this.satMath = "";
		this.expenses = "";
		this.percentAid = "";
		this.numApplicants = "";
		this.percentAdmitted = "";
		this.percentEnrolled = "";
		this.academicScale = "";
		this.socialScale = "";
		this.qualityOfLife = "";
	}
	
	public School(String n, String s, String l, String c, String ns, String pf,
			String sv, String sm, String exp, String pfa, String na, String pa, String pe, String as,
			String ss, String qs) {
		this.name = n;
		this.state = s;
		this.location = l;
		this.control = c;
		this.numStudents = ns;
		this.percentFemale = pf;
		this.satVerbal = sv;
		this.satMath = sm;
		this.expenses = exp;
		this.percentAid = pfa;
		this.numApplicants = na;
		this.percentAdmitted = pa;
		this.percentEnrolled = pe;
		this.academicScale = as;
		this.socialScale = ss;
		this.qualityOfLife = qs;
	}
	
	/**
	 * Constructs a School
	 * 
	 * @param n name
	 * @param s state
	 * @param ns number of students
	 */
	public School(String n, String s, String ns)
	{
		this.name=n;
		this.state = s;
		this.location = "";
		this.control = "";
		this.numStudents = ns;
		this.percentFemale = "";
		this.satVerbal = "";
		this.satMath = "";
		this.expenses = "";
		this.percentAid = "";
		this.numApplicants = "";
		this.percentAdmitted = "";
		this.percentEnrolled = "";
		this.academicScale = "";
		this.socialScale = "";
		this.qualityOfLife = "";
	}
	
	/**
	 * Constructs a School
	 * 
	 * @param n name
	 * @param s state
	 * @param ns number of students
	 * @param recSchools list of school's recommended schools
	 */
	public School(String n, String s, String ns, List<School> recSchools)
	{
		this.name=n;
		this.state = s;
		this.numStudents = ns;
		this.recommendedSchools = recSchools;
	}
	/**
	 * Constructs a School
	 * 
	 */
	public School(String n, String s, String l, String c, String ns, String pf,
			String sv, String sm, String exp, String pfa, String na, String pa, String pe, String as,
			String ss, String qs, String e1, String e2, String e3, String e4, String e5) {
		this.name = n;
		this.state = s;
		this.location = l;
		this.control = c;
		this.numStudents = ns;
		this.percentFemale = pf;
		this.satVerbal = sv;
		this.satMath = sm;
		this.expenses = exp;
		this.percentAid = pfa;
		this.numApplicants = na;
		this.percentAdmitted = pa;
		this.percentEnrolled = pe;
		this.academicScale = as;
		this.socialScale = ss;
		this.qualityOfLife = qs;
		this.emphasis1 = e1;
		this.emphasis2 = e2;
		this.emphasis3 = e3;
		this.emphasis4 = e4;
		this.emphasis5 = e5;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getControl() {
		return control;
	}
	public void setControl(String control) {
		this.control = control;
	}
	public String getEmphasis1() {
		return emphasis1;
	}
	public void setEmphasis1(String emphasis1) {
		this.emphasis1 = emphasis1;
	}
	public String getEmphasis2() {
		return emphasis2;
	}
	public void setEmphasis2(String emphasis2) {
		this.emphasis2 = emphasis2;
	}
	public String getEmphasis3() {
		return emphasis3;
	}
	public void setEmphasis3(String emphasis3) {
		this.emphasis3 = emphasis3;
	}
	public String getEmphasis4() {
		return emphasis4;
	}
	public void setEmphasis4(String emphasis4) {
		this.emphasis4 = emphasis4;
	}
	public String getEmphasis5() {
		return emphasis5;
	}
	public void setEmphasis5(String emphasis5) {
		this.emphasis5 = emphasis5;
	}
	public String getNumStudents() {
		return numStudents;
	}
	public void setNumStudents(String numStudents) {
		this.numStudents = numStudents;
	}
	public String getPercentFemale() {
		return percentFemale;
	}
	public void setPercentFemale(String percentFemale) {
		this.percentFemale = percentFemale;
	}
	public String getSatVerbal() {
		return satVerbal;
	}
	public void setSatVerbal(String satVerbal) {
		this.satVerbal = satVerbal;
	}
	public String getSatMath() {
		return satMath;
	}
	public void setSatMath(String satMath) {
		this.satMath = satMath;
	}
	public String getExpenses() {
		return expenses;
	}
	public void setExpenses(String expenses) {
		this.expenses = expenses;
	}
	public String getPercentAid() {
		return percentAid;
	}
	public void setPercentAid(String percentAid) {
		this.percentAid = percentAid;
	}
	public String getNumApplicants() {
		return numApplicants;
	}
	public void setNumApplicants(String numApplicants) {
		this.numApplicants = numApplicants;
	}
	public String getPercentAdmitted() {
		return percentAdmitted;
	}
	public void setPercentAdmitted(String percentAdmitted) {
		this.percentAdmitted = percentAdmitted;
	}
	public String getPercentEnrolled() {
		return percentEnrolled;
	}
	public void setPercentEnrolled(String percentEnrolled) {
		this.percentEnrolled = percentEnrolled;
	}
	public String getAcademicScale() {
		return academicScale;
	}
	public void setAcademicScale(String academicScale) {
		this.academicScale = academicScale;
	}
	public String getSocialScale() {
		return socialScale;
	}
	public void setSocialScale(String socialScale) {
		this.socialScale = socialScale;
	}
	public String getQualityOfLife() {
		return qualityOfLife;
	}
	public void setQualityOfLife(String qualityOfLife) {
		this.qualityOfLife = qualityOfLife;
	}
	public List<School> getRecommendedSchools() {
		return recommendedSchools;
	}
	public void setRecommendedSchools(List<School> recommendedSchools) {
		this.recommendedSchools = recommendedSchools;
	}
	
	

}
