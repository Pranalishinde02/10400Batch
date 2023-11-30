package CollectionList;

public class LinkedSportExample {

	private String sName;
	
	LinkedSportExample()
	{
		
	}

	public LinkedSportExample(String sName) {
		super();
		this.sName = sName;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	@Override
	public String toString() {
		return "LinkedSportExample [sName=" + sName + "]";
	}
	
	
	
}
