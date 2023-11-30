package ThreadExamples;

public class ThreadDemo extends Thread{

	
	public void run()
	{
		for(int i=0;i<5;i++)
		{
		System.out.println("Hello there");
		try
		{
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
	public static void main(String[] args) {

     ThreadDemo d = new ThreadDemo();
     d.setName("First");
     System.out.println(d.getName());
     d.start();
     try
     {
    	 d.join();
     }
     catch(Exception e)
     {
    	 System.out.println(e);
     }
     ThreadDemo d1 = new ThreadDemo();
     d1.setName("Second");
     System.out.println(d1.getName());
     d1.start();
     

	}

}
