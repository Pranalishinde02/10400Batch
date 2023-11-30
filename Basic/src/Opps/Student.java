package Opps;

import java.util.Scanner;

public class Student {
	
	private int sId;
	private String sName;
	private int m1,m2,m3,m4,m5;
	
	Student(int i,String j,int k,int l,int n,int o,int p)
	{
		sId=i;
		setsName(j);
		m1=k;
		m2=l;
		m3=n;
		m4=o;
		m5=p;
		
	}
	
	
	
	public int getsId() {
		return sId;
	}



	public void setsId(int sId) {
		this.sId = sId;
	}



	public int getM1() {
		return m1;
	}



	public void setM1(int m1) {
		this.m1 = m1;
	}



	public int getM2() {
		return m2;
	}



	public void setM2(int m2) {
		this.m2 = m2;
	}



	public int getM3() {
		return m3;
	}



	public void setM3(int m3) {
		this.m3 = m3;
	}



	public int getM4() {
		return m4;
	}



	public void setM4(int m4) {
		this.m4 = m4;
	}



	public int getM5() {
		return m5;
	}



	public void setM5(int m5) {
		this.m5 = m5;
	}



	void percentage()
	{
	    
	    int total=m1+m2+m3+m4+m5;
	    System.out.println("Total is:"+total);
	    
	    double percentage=total/5*100;
	    System.out.println("Pecentage is:"+percentage);
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

}
