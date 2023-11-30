package Inheritance;

public class Staff extends Person{

	private String Expe;
	private String subject;
	
	public Staff(int Id,String Name,String Address,String expe, String subject) {
		super(Id,Name,Address);
		Expe = expe;
		this.subject = subject;
	}

	public Staff(int i, String string, int j, String string2) {
		// TODO Auto-generated constructor stub
	}

	public String getExpe() {
		return Expe;
	}

	public void setExpe(String expe) {
		Expe = expe;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return super.toString()+ "\nStaff Expe=" + Expe + ", \nsubject=" + subject + "";
	}
	
	
	
}
