package com.visam.training.objectEquality;

public class TestClass {

	public static void main(String args[]) {

		Student s1 = new Student();
		Student s2 = new Student();

		s1.setId(10);
		s2.setId(10);
		
		s1.setMarks(12f);
		s2.setMarks(12f);
		
		s1.setFeedback(true);
		s2.setFeedback(true);
		
		s2.setName("name1");
		s1.setName("name1");

		if (s1.equals(s2)) {
			System.out.println("Good");
		} else {
			System.out.println("Needs improvement");
		}
		
		
		System.out.println(+s1.hashCode());
		System.out.println(+s2.hashCode());
	}

}
