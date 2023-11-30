package Inheritance;

public class IndianBank extends Bank {
	
	int dp;

	public IndianBank()
	{
		
	}

	public IndianBank(int accno,int amount ,int dp) {
	    setAccno(accno);
	    setAmmount(amount);
		this.dp = dp;
	}

	public int getDp() {
		return dp;
	}

	public void setDp(int dp) {
		this.dp = dp;
	}
	public int deposit()
	{
		 dp=this.getAmmount()+3000;
		return dp;
	}

	@Override
	public String toString() {
		return super.toString()+"IndianBank , deposit()=" + deposit() + "]";
	}



	}


