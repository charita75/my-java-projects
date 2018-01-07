package com.visam.training.objectEquality;

public class Student {

	private int id;
	private String name;
	private boolean feedback;
	private float marks;

	
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public float getMarks() {
		return marks;
	}
	
	public boolean getFeedback() {
		return feedback;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setFeedback(boolean feedback) {
		this.feedback = feedback;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}


	@Override
	public boolean equals(Object object) {

		if (object == null) {
			return false;
		} 
		
		if (!(object instanceof Student)) {
			return false;
		}
		
		if (id != ((Student) object).getId()) {
			return false;
		}
		if (name != ((Student) object).getName()) {
			return false;
		}
		if (feedback != ((Student) object).getFeedback()) {
			return false;
		} 
		if (marks != ((Student) object).getMarks()) {
			return false;
		}
		return true;
	}
	
	@Override
    public int hashCode() {
		int result,res1,res2,res3;
		result = ((name == null) ? 0 : name.hashCode());
		
		res1 = Integer.valueOf(id).hashCode();
		
		res2 = Boolean.hashCode(feedback);

		res3 = Float.hashCode(marks);
       
		
		return result+res1+res2+res3;
    }
	
}	
	
