package edu.handong.csee.java.lab07.prob1; //package name

import java.util.Scanner; //import Scanner class to get input

/**
 * This class is for executing the program that uses YearToCentury class.
 * @author jo jeong hoon
 *
 */
public class YearToCentury_main { //defines YearToCentury_main class

	/**
	 * starts this program.
	 * It shows century number which is calculated by given year number.
	 * @param args refers command-line arguments as an array of String objects.
	 */
	public static void main(String[] args) { //define a main method

		Scanner keyboard = new Scanner(System.in); //Instantiation the Scanner object

		System.out.println("Input year: "); //print the line 
		int year = keyboard.nextInt(); //get year value from keyboard

		YearToCentury obj = new YearToCentury(year); //instantiation the YearToCentury object

		System.out.println(year + " is " + obj.calCentury() + "th century." ); //print the calculated century value


	}

}
