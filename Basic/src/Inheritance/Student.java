package Inheritance;

public class Student extends Person {
	
	private Double Attendance;
	private int Std;
	private double Per;
	
	Student()
	{
		
	}

	public Student(int Id,String Name,String Address, Double i, int std, double per) {
		super(Id,Name,Address);
		Attendance = i;
		Std = std;
		Per = per;
	}

	public Double getAttendance() {
		return Attendance;
	}

	public void setAttendance(Double attendance) {
		Attendance = attendance;
	}

	public int getStd() {
		return Std;
	}

	public void setStd(int std) {
		Std = std;
	}

	public double getPer() {
		return Per;
	}

	public void setPer(double per) {
		Per = per;
	}

	@Override
	public String toString() {
		return super.toString()+"Student Attendance=" + Attendance + ", \nStd=" + Std + ", Per=" + Per + "";
	}
	
	

}
