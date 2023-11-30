package ThreadExamples;

public class ThreadDemo1 implements Runnable {

	@Override
	public void run() {
		
		System.out.println("Thread");
		
	}

	public static void main(String[] args) {

		ThreadDemo1 d = new ThreadDemo1();
		Thread t = new Thread(d);
		t.start();
		
	}

}
