package com.visam.training.objectCloning;

public class Student {
	
		public static void main(String args[]) throws CloneNotSupportedException {
			TestStudent s = new TestStudent();
			TestStudent clonedObj = (TestStudent)s.clone();
			
			s.setStudentId(12);
			s.setStudentName("charita");
			
			//clonedObj.setStudentId(12);
			//clonedObj.setStudentName("charita");
			
			//System.out.println(s.getStudentId());
			System.out.println(clonedObj.getStudentId());
			
			System.out.println(clonedObj.getStudentName());
			
			
			System.out.println(s.getClass()==clonedObj.getClass());
			
			System.out.println(s.equals(clonedObj));
			
			System.out.println(s==clonedObj);
		
			
			System.out.println(s.hashCode());
			System.out.println(clonedObj.hashCode());
			
		
	}
}

