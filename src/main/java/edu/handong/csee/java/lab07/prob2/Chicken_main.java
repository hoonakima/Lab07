package edu.handong.csee.java.lab07.prob2; //package name


/**
 * This class is for executing the program which contains Chicken class.
 * @author jo jeong hoon
 *
 */
public class Chicken_main { //defines Chicken_main class


	/**
	 * starts this program.
	 * It prints each chicken menu's rating, which is entered. 
	 * @param args refers command-line arguments as an array of String objects.
	 */
	public static void main(String[] args) { //defines main method, which starts this program

		Chicken firstChicken = new Chicken("Cheese_mustard", 15000, 5); //initialize the values for the firstChicken object
		Chicken secondChicken = new Chicken("Honey_mustard", 15000, 5); //initialize the values for the secondChicken object
		Chicken thirdChicken = new Chicken("Spicy_chicken", 13000, 5);//initialize the values for the thirdChicken object

		firstChicken.setRatings(3); // set the firstChicken's Ratings value
		secondChicken.setRatings(4); //set the secondChicken's Ratings value
		thirdChicken.setRatings(1); //set the thirdChicken's Ratings value


		System.out.println(firstChicken.getName() + "'s rating is " + firstChicken.getRatings()); //print the line which indicates the firstChicken's name and ratings 
		System.out.println(secondChicken.getName() + "'s rating is " + secondChicken.getRatings()); //print the line which indicates the secondChicken's name and ratings 
		System.out.println(thirdChicken.getName() + "'s rating is " + thirdChicken.getRatings()); //print the line which indicates the thirdChicken's name and ratings 
	}

}
