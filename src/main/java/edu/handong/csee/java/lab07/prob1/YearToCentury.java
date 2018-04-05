package edu.handong.csee.java.lab07.prob1;  //package name

/**
 * defines an YearToCentury object.
 * The data of this object is year, and the method is calCentury.
 * @author jo jeong hoon
 *
 */
public class YearToCentury { //defines YearToCentury class

	int year; //instance variable

	public YearToCentury() { //default constructor
		year =0; //default year value when default constructor is called
	}

	/**
	 * This is YearToCentury constructor which has an int type parameter.
	 * @param year refers year number.
	 */
	public YearToCentury(int year) { //constructor 
		this.year =year; //puts the parameter value into the instance variable 
	}

	/**
	 * returns century number from given year value
	 * @return refers century number
	 */
	public int calCentury() { //defines calCentury method

		if(year%100 ==0) //when the year value is ended with 00
			return  year/100; //in this case, the century number is year/100 
		return (year/100)+1; // when year value is ended with 00, the century number is year/100 +1
	}

}