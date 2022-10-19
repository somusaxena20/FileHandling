package com.io.assignments;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Practice2 {
	public static void main(String[] args) throws IOException {
//		WAP TO PERFROM MATCH OPERATION WHERE MATCHING SHOULD BE DONE LINE BY LINE ALTERNATIVELY
		
		PrintWriter pw = new PrintWriter("file/file3.txt");
		BufferedReader br1 = new BufferedReader(new FileReader("file/file1.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("file/file2.txt"));
		
		String s1,s2;
		
		s1 = br1.readLine();
		s2 = br2.readLine();
		
		while(s1 != null && s2 != null)
		{
			pw.println(s1);
			System.out.println(s1);
			pw.println(s2);
			System.out.println(s2);
			
			s1 = br1.readLine();
			s2 = br2.readLine();
		}
		
		while(s1 != null)
		{
			pw.println(s1);
			s1 = br1.readLine();
		}
		
		while(s2 != null)
		{
			pw.println(s2);
			s2 = br2.readLine();
		}
		
		pw.flush();
		
		br2.close();
		br1.close();
		pw.close();
	}
}
