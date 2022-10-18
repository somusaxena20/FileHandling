package com.io.buffredWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BuffredWriterConstructor {

	public static void main(String[] args) throws IOException {
		
//		CONSTRUCTOR USING FILEWRITER ARGUMENT
		
		BufferedWriter bw1 = new BufferedWriter(new FileWriter("file/abc.txt"));
		
//		CONSTRUCTOR USING FILEWRITER & BUFFERED SIZE
		
		BufferedWriter bw2 = new BufferedWriter(new FileWriter("file/abc.txt"),20);

	}

}
