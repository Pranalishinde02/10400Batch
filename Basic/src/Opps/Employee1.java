package Opps;

public class Employee1 {
	
	int sId;
	String sName;
	int m1,m2,m3,m4,m5;
	
	Employee1(int a,String b,int c,int d,int e,int f,int g)
	{
		sId=a;
		sName=b;
		m1=c;
		m2=d;
		m3=e;
		m4=f;
		m5=g;
		
	}
	double percentage()
	{
		int total=m1+m2+m3+m4+m5;
		double percentage=(total*100)/500.0;
		return percentage;
	}

	public String toString()
	{
		return "Id=:"+sId+" \nSname=:"+sName+"\nm1=:"+m1+"\nM2=:"+m2
				+"\nM3=:"+m3+"\nm4=:"+m4+"\nm5=:"+m5+"Percentage=:"+percentage();

}
}
