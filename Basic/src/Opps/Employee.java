package Opps;

public class Employee {
	
	int eId;
	String eName;
	int salary;
	String address;
	
	Employee(int i,String j,int k,String l)
	{
		eId=i;
		eName=j;
		salary=k;
		address=l;
	}
	
	double annualSalary()
	{
		int annualSal=salary*12;
		return annualSal;
	}
	double Pf()
	{
		double pf=(salary*18)/100.0;
		return pf;
	}
	
	public String toString()
	{
		return "ID:"+eId+"\nNAME:"+eName+"\nSALARY:"+salary+"\nADDRESS:"+address+"AnnualSalary:"+annualSalary();
		
	}

}
