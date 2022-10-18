package com.io.bufferedReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderConstructor {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("file/abc.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		String s = br.readLine();
		
		while(s != null)
		{
			System.out.println(s);
			s = br.readLine();
		}
		br.close();
	}
}
