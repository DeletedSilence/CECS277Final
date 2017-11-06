
public class SalariedEmployee extends Employee{

	private double salary;
	/**
	 * Default constructor
	 */
	public SalariedEmployee(){
		salary = 0;
	}
	/**
	 * overloaded Constructor
	 */
	public SalariedEmployee(String f, String l,String s, double sal){
		super(f,l,s);
		salary  = sal;
	}
	
	//getters and setters
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public double getPaymentAmount() {
		return salary;
	}
	
	@Override
	public String toString(){
		return super.toString()+"Salary: "+salary+"\n";
	}
}
