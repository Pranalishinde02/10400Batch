package Interface;

public class WBill implements Bill {
	
	private double nooflitre;
	private double costperlitre;
	
	WBill()
	{
		
	}
	public WBill(double nooflitre, double costperlitre) {
		super();
		this.nooflitre = nooflitre;
		this.costperlitre = costperlitre;
	}
	public double getNooflitre() {
		return nooflitre;
	}
	public void setNooflitre(double nooflitre) {
		this.nooflitre = nooflitre;
	}
	public double getCostperlitre() {
		return costperlitre;
	}
	public void setCostperlitre(double costperlitre) {
		this.costperlitre = costperlitre;
	}
	@Override
	public double calculateBil() {
		return nooflitre*costperlitre;
	}
	@Override
	public void displayBill() {
		System.out.println("The WterBill:"+calculateBil());
	}
	@Override
	public String toString() {
		return "WBill [nooflitre=" + nooflitre + ", costperlitre=" + costperlitre + "]";
	}
	
	
	
	}
	
	
	


