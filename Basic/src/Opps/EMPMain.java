package Opps;

public class EMPMain {

	public static void main(String[] args) {
		EMP emp1 = new EMP(1,"Pranali",80000,"Pune");
		EMP emp2 = new EMP(2,"Neha",70000,"Mumbai");
		
		System.out.println("Employee ID:"+emp1.getEmpId());
		System.out.println("Employee Name:"+emp1.getEmpName());
		System.out.println("Employee Salary:"+emp1.getSalary());
		System.out.println("Employee Address:"+emp1.getAddress());
		

	}

}
