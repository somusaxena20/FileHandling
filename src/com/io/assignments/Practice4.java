package com.io.assignments;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

// WAP FOR REMOVE DUPLICATE FROM FILE

public class Practice4 {
	public static void main(String[] args)throws Exception {
		
		PrintWriter pw = new PrintWriter("output.txt");
		
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		
		String line = br.readLine();
		
		while (line != null) {
			boolean flag = false;
			
			BufferedReader br1 = new BufferedReader(new FileReader("output.txt"));
			
			String target = br1.readLine();
			
			while (target != null) {
				
				if (line.equals(target)) {
					flag = true;
					break;
				}
				flag = br1.readLine();
			}
			
		}
	}
}
