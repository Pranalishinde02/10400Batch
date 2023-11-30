package FileExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fin=new FileInputStream("input.txt");
		ObjectInputStream oin=new ObjectInputStream(fin);
		SerializationEmployee e=(SerializationEmployee) oin.readObject();
		System.out.println(e.geteId());
		System.out.println(e.geteName());
		System.out.println(e.getSalary());
		SerializationEmployee e1=(SerializationEmployee) oin.readObject();
		System.out.println(e1.geteId());
		System.out.println(e1.geteName());
		System.out.println(e1.getSalary());
		SerializationEmployee e2=(SerializationEmployee) oin.readObject();
		System.out.println(e2.geteId());
		System.out.println(e2.geteName());
		System.out.println(e2.getSalary());
		

	}
	
}


