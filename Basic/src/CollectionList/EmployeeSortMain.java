package CollectionList;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeSortMain {

	public static void main(String[] args) {

		EmployeeSortExample e1=new EmployeeSortExample("gayathri",56000,"pune");
		EmployeeSortExample e2=new EmployeeSortExample("sreeja",70000,"banglore");

		EmployeeSortExample e3=new EmployeeSortExample("mohana",66000,"mumbai");

		ArrayList<EmployeeSortExample>emplist=new ArrayList<EmployeeSortExample>();
		emplist.add(e1);
		emplist.add(e2);

		emplist.add(e3);
		 for(EmployeeSortExample e:emplist)
	       {
	    	   System.out.println(e);
	       }
		System.out.println("=================Sorting==================");
		Collections.sort(emplist);
       for(EmployeeSortExample e:emplist)
       {
    	   System.out.println(e);
       }
		
	}
}
