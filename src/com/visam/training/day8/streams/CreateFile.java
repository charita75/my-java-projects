package com.visam.training.day8.streams;

import java.io.File;
import java.io.IOException;
import java.io.*;

public class CreateFile {
	public static void main(String[] args) throws IOException {
		
			File inputFile = new File("D:\\TestJavaFiles\\abc.txt");
			File outputFile = new File("D:\\TestJavaFiles\\pqr.txt");

			inputFile.createNewFile();
			outputFile.createNewFile();
						
			FileOutputStream fos = new FileOutputStream(inputFile);
			byte[] buffer = new byte[1024];
			String s = "Hello";
			buffer = s.getBytes();
			fos.write(buffer);
			
			FileInputStream fis = new FileInputStream(inputFile);
			FileOutputStream fos1 = new FileOutputStream(outputFile);
			int bytesRead;
			bytesRead = fis.read(buffer);
			/*while((bytesRead = fis.read(buffer))!=-1) {
			System.out.println((char)+bytesRead);
			}*/
			fos1.write(bytesRead);

			fos.close();
			fos1.close();
			fis.close();
			
	}
	
	
}