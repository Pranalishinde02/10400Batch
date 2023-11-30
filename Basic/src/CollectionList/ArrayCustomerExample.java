package CollectionList;

public class ArrayCustomerExample {
	
	private int cId;
	private String cName;
	private int cbalance;
	private static int idgen=1;
	
	ArrayCustomerExample()
	{
		cId=idgen;
	}

	public ArrayCustomerExample(String cName, int cbalance) {
		this();
		this.cName = cName;
		this.cbalance = cbalance;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public int getCbalance() {
		return cbalance;
	}

	public void setCbalance(int cbalance) {
		this.cbalance = cbalance;
	}

	@Override
	public String toString() {
		return "ArrayCustomerExample [cName=" + cName + ", cbalance=" + cbalance + "]";
	}
	
	

}
