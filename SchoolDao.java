package JdbcProject.SchoolManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SchoolDao implements SchoolInterface{

	@Override
	public List<Student> ViewStudentDetails() throws ClassNotFoundException, SQLException {
		ArrayList<Student>list = new ArrayList<Student>();
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/School","root","root");
        PreparedStatement ps=con.prepareStatement("select * from Student");
        ResultSet rs=ps.executeQuery();
        while(rs.next())
	    {
	    	Student s = new Student();
	    	s.setsId(rs.getInt(1));
	    	s.setsName(rs.getString(2));
	    	s.setsRollno(rs.getLong(3));
	    	s.setsAddress(rs.getString(4));
	    	list.add(s);
	     }
		return list;
	}

	@Override
	public Set<Teacher> ViewTeacherDetails() throws ClassNotFoundException, SQLException {
		
		HashSet<Teacher> hash = new HashSet<Teacher>();
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/School","root","root");
        PreparedStatement ps=con.prepareStatement("select * from Teacher");
        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
        	Teacher t = new Teacher();
        	t.settId(rs.getInt(1));
        	t.settName(rs.getString(2));
        	t.settSubject(rs.getString(3));
        	hash.add(t);
        }
		
		return hash;
	}
	
	public Set<Staff> ViewStaffDetails() throws ClassNotFoundException, SQLException
	{
		HashSet<Staff> set = new HashSet<Staff>();
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/School","root","root");
        PreparedStatement ps=con.prepareStatement("select * from Staff");
        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
        	Staff s = new Staff();
        	s.setsId(rs.getInt(1));
        	s.setDuty(rs.getString(2));
        	set.add(s);
        }
		return set;
		
	}

	@Override
	public void AddNewStudent(Student s) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/School","root","root");
        PreparedStatement ps=con.prepareStatement("insert into student values (?,?,?,?);");
        ps.setInt(1, s.getsId());
        ps.setString(2, s.getsName());
        ps.setLong(3, s.getsRollno());
        ps.setString(4, s.getsAddress());
        ps.executeUpdate();
        con.close();
        System.out.println("New Student Records Addedd....");
		
	}

	@Override
	public void EditStudent(Student s) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/School","root","root");
        PreparedStatement ps=con.prepareStatement("update Student set sName=?,sRollno=?,sAddress=? where sId=?");
		ps.setString(1, s.getsName());
		ps.setLong(2, s.getsRollno());
		ps.setString(3, s.getsAddress());
		ps.setInt(4, s.getsId());
		ps.executeUpdate();
		con.close();
		System.out.println("Student Record Edited Successfully...");
		
	}

	@Override
	public void RemoveStudent(int sId) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/School","root","root");
        PreparedStatement ps=con.prepareStatement("delete from student where sId=?");
        ps.setInt(1,sId);
		ps.executeUpdate();
		con.close();
		System.out.println("Student got removed from records..");	
		
		
	}

	@Override
	public void AddNewTeacher(Teacher t) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/School","root","root");
        PreparedStatement ps=con.prepareStatement("insert into Teacher values (?,?,?);");
        ps.setInt(1, t.gettId());
        ps.setString(2, t.gettName());
       ps.setString(3, t.gettSubject());
        ps.executeUpdate();
        con.close();
        System.out.println("New Teacher Records Addedd....");
		
	}

	@Override
	public void EditTeacher(Teacher t) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/School","root","root");
        PreparedStatement ps=con.prepareStatement("update Teacher set tName=?,tSubject=? where tId=?");
		ps.setString(1, t.gettName());
		ps.setString(2, t.gettSubject());
		ps.setInt(3, t.gettId());
		ps.executeUpdate();
		con.close();
		System.out.println("Teacher Record Edited Successfully...");
	}

	@Override
	public void RemoveTeacher(int tId) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/School","root","root");
        PreparedStatement ps=con.prepareStatement("delete from Teacher where tId=?");
        ps.setInt(1,tId);
		ps.executeUpdate();
		con.close();
		System.out.println("Teacher got removed from records..");	
		
	}

	@Override
	public void AddNewStaff(Staff s) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/School","root","root");
        PreparedStatement ps=con.prepareStatement("insert into Staff values (?,?);");
        ps.setInt(1, s.getsId());
        ps.setString(2, s.getDuty());
        ps.executeUpdate();
        con.close();
        System.out.println("New Staff Records Addedd....");
		
	}

	@Override
	public void EditStaff(Staff s) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/School","root","root");
        PreparedStatement ps=con.prepareStatement("update Staff set duty=? where sId=?");
        ps.setString(1, s.getDuty());
        ps.setInt(2, s.getsId());
		
		ps.executeUpdate();
		con.close();
		System.out.println("Staff Record Edited Successfully...");
		
	}

	@Override
	public void RemoveStaff(int sId) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/School","root","root");
        PreparedStatement ps=con.prepareStatement("delete from Staff where sId=?");
        ps.setInt(1,sId);
		ps.executeUpdate();
		con.close();
		System.out.println("Staff got removed from records..");	
		
	}

}
