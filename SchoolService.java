package JdbcProject.SchoolManagement;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
public class SchoolService {

	public void ViewStudent() throws ClassNotFoundException, SQLException
	{
		List<Student> list= new SchoolDao().ViewStudentDetails();
		for(Student s:list)
		{
			System.out.println(s);
		}
	}
	
	public void ViewTeacher() throws ClassNotFoundException, SQLException
	{
		Set<Teacher> set = new SchoolDao().ViewTeacherDetails();
		for(Teacher t: set)
		{
			System.out.println(t);
		}
	}
	
	public void ViewStaff() throws ClassNotFoundException, SQLException
	{
		Set<Staff> set = new SchoolDao().ViewStaffDetails();
		for(Staff s: set)
		{
			System.out.println(s);
		}
	}
	
	public void AddStudent() throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student ID:");
		int sId=sc.nextInt();
		System.out.println("Enter Student Name:");
		String sName=sc.next();
		System.out.println("Enter Student Roll No:");
		Long sRollno=sc.nextLong();
		System.out.println("Enter Student Address:");
		String sAddress=sc.next();
		
		Student s = new Student();
		s.setsId(sId);
		s.setsName(sName);
		s.setsRollno(sId);
		s.setsAddress(sAddress);
	
		new SchoolDao().AddNewStudent(s);
	}
	
	public void EditStudent() throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student ID:");
		int sId=sc.nextInt();
		System.out.println("Enter Student Name:");
		String sName=sc.next();
		System.out.println("Enter Student Roll No:");
		Long sRollno=sc.nextLong();
		System.out.println("Enter Student Address:");
		String sAddress=sc.next();
		
		Student s = new Student();
		s.setsId(sId);
		s.setsName(sName);
		s.setsRollno(sId);
		s.setsAddress(sAddress);
	
		new SchoolDao().EditStudent(s);
		
	}
	
	public void RemoveStudent() throws ClassNotFoundException, SQLException
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student id to remove:");
		int sId=sc.nextInt();
		new SchoolDao().RemoveStudent(sId);;
	}
	
	public void AddTeacher() throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Teacher ID:");
		int tId=sc.nextInt();
		System.out.println("Enter Teacher Name:");
		String tName=sc.next();
		System.out.println("Enter Teacher Subject:");
		String tSubject=sc.next();
		
		Teacher t = new Teacher();
		t.settId(tId);
		t.settName(tName);
		t.settSubject(tSubject);
	    new SchoolDao().AddNewTeacher(t);
	}
	
	public void EditTeacher() throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Teacher ID:");
		int tId=sc.nextInt();
		System.out.println("Enter Teacher Name:");
		String tName=sc.next();
		System.out.println("Enter Teacher Subject:");
		String tSubject=sc.next();
		
		Teacher t = new Teacher();
		t.settId(tId);
		t.settName(tName);
		t.settSubject(tSubject);
	    new SchoolDao().EditTeacher(t);
		
	}
	
	public void RemoveTeacher() throws ClassNotFoundException, SQLException
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Teacher id to remove:");
		int tId=sc.nextInt();
		new SchoolDao().RemoveTeacher(tId);;
		
	}
	
	public void AddStaff() throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Staff ID:");
		int sId=sc.nextInt();
		System.out.println("Enter Staff Duty:");
		String duty=sc.next();
		
		
		Staff s = new Staff();
		s.setsId(sId);
		s.setDuty(duty);
	
		new SchoolDao().AddNewStaff(s);;
	}
	
	public void EditStaff() throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Staff ID:");
		int sId=sc.nextInt();
		System.out.println("Enter Staff Duty:");
		String duty=sc.next();
		
		
		Staff s = new Staff();
		s.setsId(sId);
		s.setDuty(duty);
	
		new SchoolDao().EditStaff(s);
		
	}
	
	public void RemoveStaff() throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the staff id to remove:");
		int sId=sc.nextInt();
		new SchoolDao().RemoveStaff(sId);;
		
	}
}
