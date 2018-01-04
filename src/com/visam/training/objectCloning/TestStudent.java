package com.visam.training.objectCloning;

public class TestStudent implements Cloneable {

	private int studentId;
	private String studentName;

	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}
	
	/*@Override
	public int hashCode() {
		int res1, res2;
		res1 = Integer.hashCode(studentId);
		res2 = (studentName == null ? 0 : studentName.hashCode());
		
		return res1+res2;
	}*/
	
}

