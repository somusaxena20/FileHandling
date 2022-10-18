package com.io.fileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderConstructor {

	public static void main(String[] args) throws FileNotFoundException {
		
//		CONSTRUCTOR WITH STRING
		
		FileReader fr = new FileReader("file/abc.txt");

//		CONOSTRUCTOR WITH FILE REFRENCE
		
		FileReader fr1 = new FileReader(new File("file/abc.txt"));
		
	}

}
