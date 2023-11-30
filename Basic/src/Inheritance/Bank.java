package Inheritance;

public class Bank {
	
	 private int accno;
	  private int  ammount;
	  public Bank()
	  {
		  
	  }

	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public int getAmmount() {
		return ammount;
	}
	public void setAmmount(int ammount) {
		this.ammount = ammount;
	}
	public Bank(int accno, int ammount) {
		super();
		this.accno = accno;
		this.ammount = ammount;
	}
	@Override
	public String toString() {
		return "Bank [accno=" + accno + ", ammount=" + ammount + "]";
	}

}
