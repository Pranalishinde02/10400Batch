package JdbcProject.SchoolManagement;

public class Teacher {
	
	private int tId;
	private String tName;
	private String tSubject;
	
	public Teacher()
	{
		
	}

	public Teacher(int tId, String tName, String tSubject) {
		super();
		this.tId = tId;
		this.tName = tName;
		this.tSubject = tSubject;
	}

	public int gettId() {
		return tId;
	}

	public void settId(int tId) {
		this.tId = tId;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public String gettSubject() {
		return tSubject;
	}

	public void settSubject(String tSubject) {
		this.tSubject = tSubject;
	}

	@Override
	public String toString() {
		return "Teacher [tId=" + tId + ", tName=" + tName + ", tSubject=" + tSubject + "]";
	}
	
	

}
