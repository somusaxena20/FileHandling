package com.io.printWriter;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterConstructor {

	public static void main(String[] args) throws IOException {
		
//		CONTRUCTOR WITH FILE PATH ARGU.
		PrintWriter pw1 = new PrintWriter("file/abc.txt");
		
//		CONSTRUCTOR WITH FILE REF ARGU
		PrintWriter pw2 = new PrintWriter(new File("file/abc.txt"));
		
//		CONSTRUCTOR WITH WRITER ARGU
		PrintWriter pw3 = new PrintWriter(new BufferedWriter(new FileWriter("file/abc.txt")));
	}

}
