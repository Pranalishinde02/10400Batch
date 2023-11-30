package CollectionList;

import java.util.Vector;

public class VectorFruitMain {

	public static void main(String[] args) {
		
		VectorFruitExample f1 = new VectorFruitExample("Apple",300.0);
		Vector<VectorFruitExample> v1= new Vector<VectorFruitExample>();
		VectorFruitExample f2 = new VectorFruitExample();
		
		v1.add(f1);
		System.out.println(v1);
		v1.add(new VectorFruitExample("Grapes",45.60));
		System.out.println(v1);
	}

}
