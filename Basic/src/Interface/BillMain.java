package Interface;

public class BillMain {

	public static void main(String[] args) {
		EBill e = new EBill(24.9,89.6);
		System.out.println(e);
		e.displayBill();
		
		WBill w = new WBill(30.5,60.0);
		System.out.println(w);
		w.displayBill();

	}

}
