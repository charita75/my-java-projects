package com.visa.training.day5;

public class WordCount {
public static void main (String args[]) {
	String s = "Friendship means closeness and the trust built between the two people";
	String[] result = s.split("\\s");
	
	for(String keyword : result) {
		if(keyword.contains("the")) {
			System.out.println("The exists");
		}
		else {
			System.out.println("no the");
		}
	}
	
	}
}
