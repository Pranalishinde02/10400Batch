package Inheritance;

public class Person {
	
	private int Id;
	private String Name;
	private String Address;
	
	Person()
	{
		
	}

	public Person(int id, String name, String address) {
		super();
		Id = id;
		Name = name;
		Address = address;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Person [Id=" + Id + ", Name=" + Name + ", Address=" + Address + "]";
	}
	
	

}
