package CollectionList;

public class VectorFruitExample {
	
	private String Name;
	private Double price;
	 
	VectorFruitExample()
	{
		
	}

	public VectorFruitExample(String name, Double price) {
		super();
		Name = name;
		this.price = price;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "VectorFruitExample [Name=" + Name + ", price=" + price + "]";
	}
	
	
}
