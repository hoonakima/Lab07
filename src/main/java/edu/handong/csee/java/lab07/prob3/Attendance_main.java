package edu.handong.csee.java.lab07.prob3; //package name

import java.util.Random; //import Random class

/**
 * This class is for detecting which student failed java programming course.
 * It shows whether students failed the course or not according to given random absence number.
 * The information of students is got from Attendance class which is in same package. 
 * @author jo jeong hoon
 *
 */
public class Attendance_main { //defines the Attendance_main class 

	/**
	 * This main method starts this program.
	 * It shows which student failed the course.
	 * @param args refers command-line arguments as an array of String objects.
	 */
	public static void main(String[] args) { //defines main method

		Random randomGen = new Random(); //instantiate the Random object


		Attendance Student1 = new Attendance("Jess", 4, "21400999" ,0); //instantiate Attendance object and initialize with some values
		Attendance Student2 = new Attendance("Kent", 2, "21700111", 0); //instantiate Attendance object and initialize with some values
		Attendance Student3 = new Attendance("Lucas", 1, "21833222", 0); //instantiate Attendance object and initialize with some values
		Attendance Student4 = new Attendance(); //instantiate Attendance object without initializing 


		Student4.setName("Martha"); //set the Student4 object's name 
		Student4.setGrade(2); //set the Student4 grade 

		Student1.setNumOfAbsence(randomGen.nextInt(10)); //set the Student1's number of absence randomly which is within 0 to 10
		Student2.setNumOfAbsence(randomGen.nextInt(10)); //set the Student2's number of absence randomly which is within 0 to 10
		Student3.setNumOfAbsence(randomGen.nextInt(10)); //set the Student3's number of absence randomly which is within 0 to 10
		Student4.setNumOfAbsence(randomGen.nextInt(10)); //set the Student4's number of absence randomly which is within 0 to 10

		if(Student1.getNumOfAbsence() > 6) { //when the Student1's number of absence is greater than 6
			System.out.println("I'm sorry, " + Student1.getName() + ". You failed this course."); //print this line
			System.out.println("Your the number of absence is " + Student1.getNumOfAbsence()+ "."); //print this line
		}

		if(Student2.getNumOfAbsence() > 6) { //when the Student2's number of absence is greater than 6
			System.out.println("I'm sorry, " + Student2.getName() + ". You failed this course."); //print this line
			System.out.println("Your the number of absence is " + Student2.getNumOfAbsence()+ "."); //print this line
		}

		if(Student3.getNumOfAbsence() > 6) { //when the Student3's number of absence is greater than 6
			System.out.println("I'm sorry, " + Student3.getName() + ". You failed this course."); //print this line
			System.out.println("Your the number of absence is " + Student3.getNumOfAbsence()+ "."); //print this line
		}

		if(Student4.getNumOfAbsence() > 6) { //when the Student4's number of absence is greater than 6
			System.out.println("I'm sorry, " + Student4.getName() + ". You failed this course."); //print this line
			System.out.println("Your the number of absence is " + Student4.getNumOfAbsence()+ "."); //print this line
		}






	}

}
