package edu.handong.csee.java.lab07.prob1; 

/**
 * defines YearToCentury object.
 * The data of this object is year, and the method is calCentury.
 * @author jo jeong hoon
 *
 */
public class YearToCentury { 

	int year;
	
	public YearToCentury() {
		year =0;
	}
	
	public YearToCentury(int year) {
		this.year =year;
	}
	
	/**
	 * returns century number from given year value
	 * @return refers century number
	 */
	public int calCentury() {
		
		if(year%100 ==0)
			return  year/100;
		return (year/100)+1;
	}
	
}