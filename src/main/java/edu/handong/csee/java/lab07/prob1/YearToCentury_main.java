package edu.handong.csee.java.lab07.prob1;

import java.util.Scanner;

public class YearToCentury_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Input year: ");
		int year = keyboard.nextInt();
		
		YearToCentury obj = new YearToCentury(year);
		
		System.out.println(year + " is " + obj.calCentury() + "th century." );
	
		
	}

}
