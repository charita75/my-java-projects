package com.visam.training.objectEquality;

public class Student {

	private int id;
	private String name;
	private boolean feedback;
	private float marks;

	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setFeedback(boolean feedback) {
		this.feedback = feedback;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public float getMarks() {
		return marks;
	}
	
	public boolean getFeedback() {
		return feedback;
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

	
}	
	
