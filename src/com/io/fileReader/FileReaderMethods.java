package com.io.fileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderMethods {
	public static void main(String[] args) throws IOException {
//		1st Method
		
		FileReader fr1 = new FileReader("file/abc.txt");
		
		int i = fr1.read();
		
		while(i != -1)
		{
			System.out.print((char)i);
			i = fr1.read();
		}
		System.out.println("\n*******************************************");
//		2nd Method
		
		File f = new File("file/abc.txt");
		
		char[] ch = new char[(int)f.length()];
		
		FileReader fr2 = new FileReader(f);
		
		fr2.read(ch);
		
		for(char x : ch)
		{
			System.out.print(x);
		}
	}
}
