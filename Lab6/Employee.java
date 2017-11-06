
public abstract class Employee implements Payable{
	private String firstname;
	private String lastname;
	private String ssn;
	public Employee(){
		firstname = "Jane";
		lastname = "Doe";
		ssn = "000-00-000";
	}
	public Employee(String f, String l, String s){
		firstname=  f;
		lastname = l;
		ssn = s;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	@Override
	public abstract double getPaymentAmount();
	@Override
	public String toString() {
		return "Employee: \nFirstname= " + firstname + " \nLastname= " + lastname + " SSN= " + ssn + "\n";
	}

}
