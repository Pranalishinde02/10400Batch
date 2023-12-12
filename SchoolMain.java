package JdbcProject.SchoolManagement;

import java.sql.SQLException;
import java.util.Scanner;



public class SchoolMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
        System.out.println("====================================================================");
        System.out.println("============= School Management System =============================");
        System.out.println("====================================================================");
        String ch;
       
        SchoolService app=new SchoolService();
        do
        {
        System.out.println("============Students Records=============================================");
        System.out.println("========================================================================");
        System.out.println("\t\t 1)View Students Records.\n" +
                           "\t\t 2)Add New Student Record.\n"+
                           "\t\t 3)Edit Student Records.\n"+
                           "\t\t 4)Remove Student Records.");
        System.out.println("====================================================================");
        System.out.println("============Teachers Records============================================");
        System.out.println("========================================================================");
        System.out.println("\t\t 5)View Teachers Records.\n"+
                           "\t\t 6)Add New Teacher Record.\n"+
                           "\t\t 7)Edit Teacher Records.\n"+
                           "\t\t 8)Remove Teacher Records.");
        System.out.println("====================================================================");
        System.out.println("============Staff Records===============================================");
        System.out.println("========================================================================");
        System.out.println("\t\t 9)View Staff Records.\n"+
                           "\t\t 10)Add New Staff Record.\n"+
                           "\t\t 11)Edit Staff Records.\n"+
                           "\t\t 12)Remove Staff Records.\n");
        System.out.println("===================================================================");
        
        System.out.println("Enter your choice:");
        int choice=sc.nextInt();
        
        switch(choice)
        {
        
        case 1: app.ViewStudent();
                break;
        case 2: app.AddStudent();
                break;
        case 3: app.EditStudent();
                break;
        case 4:app.RemoveStudent();
                break;
        case 5:app.ViewTeacher();
                break;
        case 6:app.AddTeacher();
                break;
        case 7:app.EditTeacher();
                break;
        case 8:app.RemoveTeacher();
                break;
        case 9:app.ViewStaff();  
                break;
        case 10:app.AddStaff();
                break;
        case 11:app.EditStaff();
                break;
        case 12:app.RemoveStaff();
                break;
        default:System.out.println("Wrong choice!!");          
        
        
        
        }
        
        System.out.println("Do you want to continue? (Y-Yes / N-No)");
         ch=sc.next();
        }
        while(ch.equals("Y")||ch.equals("y"));
        System.out.println("====================================================================");

        System.out.println("Bye....");
    
        System.out.println("====================================================================");


	}
}
