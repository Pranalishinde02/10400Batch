package FileExample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeMain {

	public static void main(String[] args) throws IOException {

		SerializationEmployee e1=new SerializationEmployee("gayathri",56000,"pune");
        SerializationEmployee e2=new SerializationEmployee("sreeja",70000,"banglore");

        SerializationEmployee e3=new SerializationEmployee("mohana",66000,"mumbai");

        FileOutputStream fout=new FileOutputStream("input.txt");
        ObjectOutputStream out=new ObjectOutputStream(fout);
        out.writeObject(e1);
        out.writeObject(e2);
        out.writeObject(e3);
        out.close();
        System.out.println("write sucess");

	}

}
