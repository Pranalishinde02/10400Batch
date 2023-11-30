package Abstraction;

public class BankofMaharashtra extends Bank{

	private double amount;

	public BankofMaharashtra(double amount) {
		super();
		this.amount = amount;
		
	}
	
	

	public double getAmount() {
		return amount;
	}



	public void setAmount(double amount) {
		this.amount = amount;
	}



	@Override
	public double deposite() {
		// TODO Auto-generated method stub
		return amount+7000;
	}

	@Override
	public double withdraw() {
		// TODO Auto-generated method stub
		return amount-5000;
	}
	
	
	
}
