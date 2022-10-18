package com.io.filePractice;

import java.io.File;
import java.io.IOException;

public class FileConstructorPractice {

	public static void main(String[] args)throws IOException {
//		File f = new File("FileContructor.txt"); // CREATING IN CURRENT WORKING DIRECTORY

		File f = new File("file","FileConstructor.txt"); // CREATING A FILE OBJECT WITH SPECIFIED DIRECTORY

//		File f = new File(new File("file"),"FileConstructor.txt"); // CREATING FILE OBJECT IN FILE REFRENCE SPECIFIED PATH
		
		f.createNewFile(); // CREATING A FILE WITH THE FILE REFERENCE
	}

}
