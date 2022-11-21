package com.io.assignments;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Practice3 {
	public static void main(String[] args) throws IOException {
//		WAP TO PERFORM EXTRACTION OPERATION

		PrintWriter pw = new PrintWriter("file/file3.txt");

		BufferedReader br1 = new BufferedReader(new FileReader("file/file1.txt"));

		String s1 = br1.readLine();

		while (s1 != null) {
			BufferedReader br2 = new BufferedReader(new FileReader("file/file2.txt"));

			String s2 = br2.readLine();

			while (s2 != null) {
				if (s1.equals(s2)) {
					break;
				}
				s2 = br2.readLine();
			}

			System.out.println(s1);
			pw.println(s1);
			s1 = br1.readLine();
		}
	}
}
