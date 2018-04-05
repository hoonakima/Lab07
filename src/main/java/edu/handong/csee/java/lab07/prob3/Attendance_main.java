package edu.handong.csee.java.lab07.prob3;

import java.util.Random;

/**
 * This class is for detecting which student failed java programming course.
 * It shows whether students failed the course or not according to given random absence number.
 * Information of students is got from Attendance class which is in same package. 
 * @author jo jeong hoon
 *
 */
public class Attendance_main {

	/**
	 * This main method starts this program.
	 * @param args refers command-line arguments as an array of String objects.
	 */
	public static void main(String[] args) {
		
		Random randomGen = new Random();


		Attendance Student1 = new Attendance("Jess", 4, "21400999" ,0);
		Attendance Student2 = new Attendance("Kent", 2, "21700111", 0);
		Attendance Student3 = new Attendance("Lucas", 1, "21833222", 0);
		Attendance Student4 = new Attendance();

		
		Student4.setName("Martha");
		Student4.setGrade(2);

		Student1.setNumOfAbsence(randomGen.nextInt(10));
		Student2.setNumOfAbsence(randomGen.nextInt(10));
		Student3.setNumOfAbsence(randomGen.nextInt(10));
		Student4.setNumOfAbsence(randomGen.nextInt(10));

		if(Student1.getNumOfAbsence() > 6) {
			System.out.println("I'm sorry, " + Student1.getName() + ". You failed this course.");
			System.out.println("Your the number of absence is " + Student1.getNumOfAbsence()+ ".");
		}
		
		if(Student2.getNumOfAbsence() > 6) {
			System.out.println("I'm sorry, " + Student2.getName() + ". You failed this course.");
			System.out.println("Your the number of absence is " + Student2.getNumOfAbsence()+ ".");
		}
		
		if(Student3.getNumOfAbsence() > 6) {
			System.out.println("I'm sorry, " + Student3.getName() + ". You failed this course.");
			System.out.println("Your the number of absence is " + Student3.getNumOfAbsence()+ ".");
		}
	
		if(Student4.getNumOfAbsence() > 6) {
			System.out.println("I'm sorry, " + Student4.getName() + ". You failed this course.");
			System.out.println("Your the number of absence is " + Student4.getNumOfAbsence()+ ".");
		}
		





	}

}
