package com.visam.training.day5;

public class WordCountUsingIndex {

	public static void main(String[] args) {
	    String theString = "Friendship means the closeness and the trust built between the two people";
	    //String[] newString = theString.split("\\s");
	    //String s = newString.toString();
	    int index = 0;
	    int count = 0;

	    while (true) {
	       // index = (newString.toString()).indexOf("the", index + 1);
	    	// index = s.indexOf("the", index + 1);
	    	index = theString.indexOf("the", index+1);
	        if (index == -1) {
	            break;
	        } else {
	            count++;
	        }
	    }

	    System.out.print(count);

	}
}
