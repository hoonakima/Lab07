package edu.handong.csee.java.lab07.prob3; //package name


/**
 * This class is about student's information : name, grade, student number, and the number of absence.
 * You can get and set the student's information.  
 * @author jo jeong hoon
 *
 */
public class Attendance { //define the Attendance class

	private String name; //instance variable in private
	private int grade; //instance variable in private
	private String studentNumber; //instance variable in private
	private int numOfAbsence; //instance variable in private
	
	
	public Attendance() { //Constructor name is same with class name, and this is default constructor
		this.name = "Null"; //set the instance variable name value as Null
		this.grade =0; //set the instance variable grade value
		this.studentNumber = "Null"; //set the instance variable studentNumber value
		this.numOfAbsence = 0; //set the instance variable numOfAbsence value
		
	}
	
	/**
	 * This constructor's parameters are student's name, grade, student number, and the number of absence.
	 * By using this constructor, you can initialize each student's data.
	 * @param name refers student's name.
	 * @param grade refers student's grade.
	 * @param studentNumber refers student's student number.
	 * @param numOfAbsence refers the number of absence of student.
	 */
	public Attendance(String name, int grade, String studentNumber, int numOfAbsence) { //constructor
	 this.name = name; //set the instance variable name value as parameter value
	 this.grade = grade; //set the instance variable grade value as parameter value  
	 this.studentNumber = studentNumber; //set the instance variable studentNumber value as parameter value
	 this.numOfAbsence = numOfAbsence; //set the instance variable numOfAbsence value as parameter value
	 
	}
	public void setName(String name) { //defines setName method
		this.name = name; //set the instance variable name value as parameter value
	}

	public void setGrade(int grade) { //defines setGrade method
		this.grade = grade; //set the instance variable grade value as parameter value
	}
	
	public void setStudentNumber(String studentNumber) { //defines setStudentNumber method
		this.studentNumber = studentNumber; //set the instance variable StudentNumber value as parameter value
	}
	
	public void setNumOfAbsence(int numOfAbsence) { //defines setNumOfAbsence method
		this.numOfAbsence = numOfAbsence; //set the instance variable NumOfAbsence value as parameter value
		
	}
	
	public String getName() { //defines getName method
		return name; //return name value
	}
	
	public int getGrade() { //defines getGrade method
		return grade; //return grade value
	}
	
	public String getStudentNumber() { //defines getStudentNumber method
		return studentNumber; //return studentNumber value
	}
	
	public int getNumOfAbsence() { //defines getNumOfAbsence method
		return numOfAbsence; //return numOfAbsence value
		
	}
	
	
}
