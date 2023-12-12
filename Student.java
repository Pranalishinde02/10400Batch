package JdbcProject.SchoolManagement;

public class Student{

	private int sId;
	private String sName;
	private long sRollno;
	private String sAddress;
	
	public Student()
	{
		
	}

	public Student(int sId, String sName, long sRollno, String sAddress) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sRollno = sRollno;
		this.sAddress = sAddress;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public long getsRollno() {
		return sRollno;
	}

	public void setsRollno(long sRollno) {
		this.sRollno = sRollno;
	}

	public String getsAddress() {
		return sAddress;
	}

	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sRollno=" + sRollno + ", sAddress=" + sAddress + "]";
	}
	
	
}
