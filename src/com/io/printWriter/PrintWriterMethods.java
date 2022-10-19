package com.io.printWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterMethods {

	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("file/abc.txt");
		
		pw.println("GYAN GANGA");
		pw.append("JABALPUR");

		pw.println("INDIA");
		
		pw.flush();
	}

}
