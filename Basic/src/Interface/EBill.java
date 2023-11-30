package Interface;

public class EBill implements Bill {
	
	private double noofunit;
	private double costperunit;
	
	EBill()
	{
		
	}
	
	public EBill(double noofunit, double costperunit) {
		super();
		this.noofunit = noofunit;
		this.costperunit = costperunit;
	}

	public double getNoofunit() {
		return noofunit;
	}

	public void setNoofunit(double noofunit) {
		this.noofunit = noofunit;
	}

	public double getCostperunit() {
		return costperunit;
	}

	public void setCostperunit(double costperunit) {
		this.costperunit = costperunit;
	}

	@Override
	public double calculateBil() {
		return noofunit*costperunit;
	}

	@Override
	public void displayBill() {
		
		System.out.println("The Bill:"+calculateBil());
		
	}

	@Override
	public String toString() {
		return "EBill [noofunit=" + noofunit + ", costperunit=" + costperunit + "]";
	}

	
	}
	
	


