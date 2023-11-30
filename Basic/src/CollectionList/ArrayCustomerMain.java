package CollectionList;

import java.util.ArrayList;

public class ArrayCustomerMain {

	public static void main(String[] args) {
		
		ArrayList<ArrayCustomerExample> list = new ArrayList<ArrayCustomerExample>();
		ArrayCustomerExample cust1 = new ArrayCustomerExample("Pranali",1000);
		ArrayCustomerExample cust2 = new ArrayCustomerExample("Priyanka",2000);
		ArrayCustomerExample cust3 = new ArrayCustomerExample("Pratiksha",3000);
		ArrayCustomerExample cust4 = new ArrayCustomerExample("Pranita",4000);
		ArrayCustomerExample cust5 = new ArrayCustomerExample("Pranjal",3000);
		
		list.add(cust1);
		list.add(cust2);
		list.add(cust3);
		list.add(cust4);
		list.add(cust5);
		
		for(ArrayCustomerExample c:list)
		{
			System.out.println(c);
		}
	}

}
