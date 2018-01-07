package com.visam.training.day8.streams;

import java.io.*;

public class FileCreation {
	public static void main(String args[]) throws IOException {
		File myFile = new File("D:\\TestJavaFiles\\new.txt");

		if (!(myFile.exists())) {
			myFile.createNewFile();
			
		} else {
			System.out.println("File exists");
		}
	}
}
