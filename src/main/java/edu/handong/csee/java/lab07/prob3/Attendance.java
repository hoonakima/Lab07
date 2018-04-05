package edu.handong.csee.java.lab07.prob3;


/**
 * This class is about student's information : name, grade, student number, and the number of absence.
 * You can get and set the student's information.  
 * @author jo jeong hoon
 *
 */
public class Attendance {

	private String name;
	private int grade;
	private String studentNumber;
	private int numOfAbsence;
	
	
	public Attendance() {//<constructor name = class name>
		this.name = "Null";
		this.grade =0;
		this.studentNumber = "Null";
		this.numOfAbsence = 0;
		
	}
	
	/**
	 * This constructor's parameters are student's name, grade, student number, and the number of absence.
	 * By using this constructor, you can initialize each student's data.
	 * @param name refers student's name.
	 * @param grade refers student's grade.
	 * @param studentNumber refers student's student number.
	 * @param numOfAbsence refers the number of absence of student.
	 */
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
