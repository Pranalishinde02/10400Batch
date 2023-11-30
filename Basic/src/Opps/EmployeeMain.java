package Opps;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1=new Employee(1,"Pranali",90000,"pune");
		//e1.eId=1001;
		//e1.eName="jack";
		//e1.salary=34000;
		//e1.address="kknagar";
		System.out.println("...........................................");
		System.out.println("Employee ID:"+e1.eId);
		System.out.println("Employee Name:"+e1.eName);
		System.out.println("Employee Address:"+e1.address);
		System.out.println("Employee Salary:"+e1.salary);
		System.out.println("Employee Annual Salary:"+e1.annualSalary());
		System.out.println("Employee PF:"+e1.Pf());
		System.out.println("............................................");
		
		Employee e2=new Employee(2,"Neha",870000,"mumbai");
		//e2.eId=1002;
		//e2.eName="Pranali";
		//e2.salary=90000;
		//e2.address="Pune";
		System.out.println("...........................................");
		System.out.println("Employee ID:"+e1.eId);
		System.out.println("Employee Name:"+e1.eName);
		System.out.println("Employee Address:"+e1.address);
		System.out.println("Employee Salary:"+e1.salary);
		System.out.println("Employee Annual Salary:"+e1.annualSalary());
		System.out.println("Employee PF:"+e1.Pf());
		System.out.println("............................................");
		


	}

}
