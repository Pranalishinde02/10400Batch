package FileExample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessing {

	public static void main(String[] args) throws IOException {

		String lines,words,chars;
		File q = new File("F://TechCources.txt");
        FileReader fr;
		fr = new FileReader(q);
		BufferedReader br = new BufferedReader(fr);
		String line =br.readLine();
		while(line!=null)

		{
			String[] tokens=line.split(" ");
			for(String eachWord: tokens)
			{
				char[] c = eachWord.toCharArray();
				chars += c.length;
				words++
			}
			lines++;
			line=br.readLine();
		}
		System.out.println("Lines:"+lines);
		System.out.println("Words:"+words);
		System.out.println("Chars:"+chars);
		
		}
	

}
