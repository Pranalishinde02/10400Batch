package JdbcProject.SchoolManagement;

public class Staff {

	private int sId;
	private String duty;
	
	public Staff()
	{
		
	}

	public Staff(int sId, String duty) {
		super();
		this.sId = sId;
		this.duty = duty;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getDuty() {
		return duty;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}

	@Override
	public String toString() {
		return "Staff [sId=" + sId + ", duty=" + duty + "]";
	}
	
	
}
