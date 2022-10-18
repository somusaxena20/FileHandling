package com.io.filePractice;

import java.io.File;

public class FileMethods {

	public static void main(String[] args) {
		File f = new File("file/");

//		DISPLAYING ALL THE FILE FROM DIRECTORY

//		String[] l = f.list(); // for getting all files name present in specific directory
//		int count = 0;
//		for (String x : l) {
//			count++;
//			System.out.println(x);
//		}
//		System.out.println(count);

		String[] l = f.list();
		int count = 0;
		
//		FOR ONLY FILE
		
		for (String s : l) {
			if (new File(f, s).isFile()) {
				count++;
				System.out.println(s);
			}

//			FOR ONLY DIRECTORY
			
//			if(new File(f,s).isDirectory())
//			{
//				count++;
//				System.out.println(s);
//			}
		}
		System.out.println(count);

	}

}
