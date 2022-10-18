package com.io.filePractice;

import java.io.File;
import java.io.IOException;

public class FilePractice {
	public static void main(String []args)throws IOException {
		File f = new File("file/abc.txt"); // HERE ONLY FILE OBJECT IS CREATED
		System.out.println(f.exists());
		f.createNewFile(); //AT THIS LINE FILE IS CREATED
		System.out.println(f.exists());
		System.out.println(f.getPath());
		
		
	}
}
