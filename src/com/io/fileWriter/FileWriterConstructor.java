package com.io.fileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterConstructor {

	public static void main(String[] args)throws IOException {
		
//		USING OVERRIDING
		
//		FileWriter fw = new FileWriter("file/abc.txt");
//		
//		fw.write(100); // write using single char
//		fw.write("\n");
//		fw.write(new char[]{'S','O','M','U'}); // write using char array
//		fw.write("\nSOMU SAXENA"); // write using string 
//		
//		
//		fw.flush(); // flusing
		
//		FILE WRITER WITH APPENDING IN FILE
		
		FileWriter fw = new FileWriter("file/abc.txt",true);
		
		fw.write(100); // write using single char
		fw.write("\n");
		fw.write(new char[]{'S','O','M','U'}); // write using char array
		fw.write("\nSOMU SAXENA"); // write using string 
		
		fw.close();
	}

}
