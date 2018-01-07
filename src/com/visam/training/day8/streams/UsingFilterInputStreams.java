package com.visam.training.day8.streams;

import java.io.*;

public class UsingFilterInputStreams {
	public static void main(String args[]) throws FileNotFoundException, IOException {
		
		FileInputStream is = new FileInputStream("D:\\TestJavaFiles\\abc.txt");
		FilterInputStream fis = new BufferedInputStream(is);
		try {
			int i = 0;
			while ((i = fis.read()) != -1) {
				// System.out.println((char)i);
				int a = fis.available();
				System.out.println("bytes available" + a);
				fis.skip(1);
				// fis.mark(4);
				System.out.println((char) i);
				// fis.reset();
			}
		} 
		catch (FileNotFoundException fe) {
			fe.printStackTrace();
			System.out.println("Error occurs");
		} 
		finally {
			is.close();
			fis.close();
			
		}
	}
}
