package com.visam.training.objectEquality;

public class TestClass {

	public static void main(String args[]) {

		Student s1 = new Student();
		Student s2 = new Student();

		s1.setFeedback(true);
		s2.setFeedback(false);
		s2.setName("name1");
		s1.setName("name1");

		if (s1.equals(s2)) {
			System.out.println("Good");
		} else {
			System.out.println("Needs improvement");
		}
	}

}
