package edu.handong.csee.java.lab07.prob3;


public class Attendance {

	private String name;
	private int grade;
	private String studentNumber;
	private int numOfAbsence;
	
	
	public Attendance() {//constructor name = class name
		this.name = "Null";
		this.grade =0;
		this.studentNumber = "Null";
		this.numOfAbsence = 0;
		
	}
	
	public Attendance(String name, int grade, String studentNumber, int numOfAbsence) {
	 this.name = name;
	 this.grade = grade;
	 this.studentNumber = studentNumber;
	 this.numOfAbsence = numOfAbsence;
	 
	}
	public void setName(String name) {
		this.name = name;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	public void setNumOfAbsence(int numOfAbsence) {
		this.numOfAbsence = numOfAbsence;
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public String getStudentNumber() {
		return studentNumber;
	}
	
	public int getNumOfAbsence() {
		return numOfAbsence;
		
	}
	
	
}
