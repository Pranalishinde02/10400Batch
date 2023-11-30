package ThreadExamples;

public class FirstThread extends Thread {

	Table t;
	public FirstThread(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(5);
		
	}

}

 class SecondThread extends Thread
{
	Table t;
	public SecondThread(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(2);
		
	}
}
