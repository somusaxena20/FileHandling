package com.io.assignments;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Practice1 {

	public static void main(String[] args) throws IOException {
		
//		WAP TO MATCH DATA FROM TWO FILE AND WRITE IN 3RD FILE
		
		PrintWriter pw = new PrintWriter("file/file3.txt");
		
		BufferedReader bw1 = new BufferedReader(new FileReader("file/file1.txt"));
		
		BufferedReader bw2 = new BufferedReader(new FileReader("file/file2.txt"));
		
		String s = bw1.readLine();
		
		while(s != null)
		{
			pw.println(s);
			System.out.println(s);
			s = bw1.readLine();
		}
		
		s = bw2.readLine();
		
		while(s != null)
		{
			pw.println(s);
			System.out.println(s);
			s = bw2.readLine();
		}
		
		pw.flush();
		
		bw2.close();
		bw1.close();
		
		pw.close();
		
	}

}
