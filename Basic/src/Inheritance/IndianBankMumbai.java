package Inheritance;

public class IndianBankMumbai extends IndianBank {

	int wd;
	public IndianBankMumbai()
	{
		
	}
	public IndianBankMumbai(int accno,int amount)
	 {
		setAccno(accno);
		setAmmount(amount);
	}
	public int getWd() {
		return wd;
	}
	public void setWd(int wd) {
		this.wd = wd;
	}
public int withDraw()
{
	wd=this.dp-2000;
	return wd;
}
@Override
public String toString() {
	return super.toString()+"IndianBankMumbai , withDraw()=" + withDraw() + "]";
}

}
