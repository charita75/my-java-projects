package com.visam.training.day1;
public class Concatstring {
	
	private void stringConcat(String str, String str1) {
		String str3 = str.concat(str1);
		System.out.println(str3);
	}
public static void main (String args[]) {
	
	Concatstring cs = new Concatstring();
	cs.stringConcat("Hello", "World");
}
}
