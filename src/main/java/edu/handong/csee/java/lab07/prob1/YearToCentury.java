package edu.handong.csee.java.lab07.prob1;

public class YearToCentury {

	int year;
	
	public YearToCentury() {
		year =0;
	}
	
	public YearToCentury(int year) {
		this.year =year;
	}
	
	public int calCentury() {
		
		if(year%100 ==0)
			return  year/100;
		return (year/100)+1;
	}
	
}