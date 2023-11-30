package ProductManagementSystem;

import java.util.Scanner;

public class ProductMain {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("============================================================");
		String ch;
		ProductApp app = new ProductApp();
		do
		{
			System.out.println("\t1)ViewAll\n"+"\t2)InsertData\n"+"\t3)ViewDataById\n"+"\t4)UpdateDataById\n"+
		    "\t5)DeleteDataById\n"+"\t6)DeleteAllData");
			System.out.println("========================================================");
			System.out.println("\nEnter Your Choice:");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			
			case 1:app.ViewAllData();
			break;
			case 2:app.InsertData();
			break;
			case 3:app.ViewDataById();
			break;
			case 4:app.UpdateData();
			break;
			case 5:app.DeleteDataById();
			break;
			case 6:app.DeleteAllData();
			break;
			default:System.out.println("Wrong choice:");
			}
			System.out.println("DO You Want To Continue ?");
			ch=sc.next();
		}while(ch.equals("Y")||ch.equals("y"));
		System.out.println("====================================================================");

		System.out.println("Bye....");
	
		System.out.println("====================================================================");

	}

}
