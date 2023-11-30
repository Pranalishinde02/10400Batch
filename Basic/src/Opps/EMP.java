package Opps;

public class EMP {
	
	private int empId;   //private
	private String empName;
	private double salary;
	private String address;
	
	public EMP(int empId, String empName, double salary, String address) { //constructor
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.address = address;
	}
	public int getEmpId() {  // getter and setter
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	double annualSalary()
	{
		double annualSal=salary*12;
		return annualSal;
	}
	double Pf()
	{
		double pf=(salary*18)/100.0;
		return pf;
	}
	
	public String toString() // tostring method
	{
		return "ID:"+empId+"\nNAME:"+empName+"\nSALARY:"+salary+"\nADDRESS:"+address+"AnnualSalary:"+annualSalary();
		
	}
	
	

}
