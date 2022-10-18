package com.io.buffredWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterMethods {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("file/abc.txt",true);
		
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write(100);
		bw.newLine();
		bw.write(new char[] {'S','O','M','U'});
		bw.newLine();
		bw.write("GLOBAL ENGINNERING COLLEGE");
		bw.newLine();
		
		bw.close(); // when buffered writer close then inner writer also closed!
		
	}

}
