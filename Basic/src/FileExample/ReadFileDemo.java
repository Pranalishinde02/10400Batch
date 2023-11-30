package FileExample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileDemo {

	public static void main(String[] args) throws IOException  {
		
		    File q = new File("F://TechCources.txt");
	        FileReader fr;
			fr = new FileReader(q);
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			while(line!=null)
			{
				System.out.println(line);
				line=br.readLine();
			}
	}

}
