package FileExample;

import java.io.File;
import java.io.IOException;

public class FileDemo  {

	public static void main(String[] args) throws IOException {
		
		//File f1 = new File("ListOfCources.txt");
		
		//File f1 = new File("F:/Pranali.pdf");
		File f2 = new File("F:/oops/");
		String [] list = f2.list();
		System.out.println("List of Files"+list.length);
		
		//System.out.println("Absolute Path:"+f1.getAbsolutePath());
		
		//System.out.println("Relative Path:"+f1.getCanonicalPath());
		
		if(f2.createNewFile())
		{
			System.out.println("File Created.");
		}
		else
		{
			 System.out.println("File Exist");
		}
	}

}
