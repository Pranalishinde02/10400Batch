package JdbcProject.SchoolManagement;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;



public interface SchoolInterface {

	List<Student> ViewStudentDetails() throws ClassNotFoundException, SQLException;
	public void AddNewStudent(Student s) throws ClassNotFoundException, SQLException;
	public void EditStudent(Student s)throws ClassNotFoundException, SQLException;
	public void RemoveStudent(int sId)throws ClassNotFoundException, SQLException;
	Set<Teacher> ViewTeacherDetails() throws ClassNotFoundException, SQLException;
	public void AddNewTeacher(Teacher t) throws ClassNotFoundException, SQLException;
	public void EditTeacher(Teacher t) throws ClassNotFoundException, SQLException;
	public void RemoveTeacher(int tId) throws ClassNotFoundException, SQLException;
	Set<Staff> ViewStaffDetails() throws ClassNotFoundException, SQLException;
	public void AddNewStaff(Staff s) throws ClassNotFoundException, SQLException;
	public void EditStaff(Staff s) throws ClassNotFoundException, SQLException;
	public void RemoveStaff(int sId) throws ClassNotFoundException, SQLException;
	
}
