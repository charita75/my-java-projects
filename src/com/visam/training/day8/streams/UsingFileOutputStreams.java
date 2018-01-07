package com.visam.training.day8.streams;
import java.io.*;

public class UsingFileOutputStreams {
	public static void main(String args[]) throws IOException {
		
		FileOutputStream os = new FileOutputStream("D:\\TestJavaFiles\\abc.txt");
		FilterOutputStream fos = new FilterOutputStream(os);
		
		String s = "Writing bytes";
		byte[] b = s.getBytes();
		
		fos.write(b);
	}

}
