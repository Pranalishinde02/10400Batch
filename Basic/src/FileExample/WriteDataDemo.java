package FileExample;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataDemo {

	public static void main(String[] args) throws IOException {
		
		File t = new File("F://TechCources.txt");
		FileWriter w = new FileWriter(t);
		BufferedWriter b = new BufferedWriter(w);
		b.write("Java Full Stack.");
		b.newLine();
		b.write("Python Full Stack.");
		b.newLine();
		b.flush();
		b.close();
		System.out.println("File is Written.");
	}

}
