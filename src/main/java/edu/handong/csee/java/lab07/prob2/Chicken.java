package edu.handong.csee.java.lab07.prob2; //package name

/**
 * defines a Chicken object.
 * This object has three data, which are chicken menu's name, price, and ratings(number of stars).
 * These are private data, but you can set the values.
 * Also, you can get these data.
 * @author jo jeong hoon
 *
 */
/**
 * @author jo jeong hoon
 *
 */
public class Chicken { //defines a Chicken class

	private String name; //instance variable
	private int price;  //instance variable
	private int ratings; //instance variable
	
	
	public Chicken() { //default constructor
		this.name = "justChicken"; //default name is entered into instance variable name
		this.price = 0; //default price is entered into instance variable price
		this.ratings = 0; //default ratings is entered into instance variable ratings
		
	}
	
	public Chicken(String name, int price, int ratings) { //constructor
		this.name = name; //defines chicken menu's initial name
		this.price = price; //defines chicken menu's initial price
		this.ratings =ratings; //defines chicken menu's initial ratings
	}
	
	/**
	 * returns a menu's name.
	 * @return refers the menu's name.
	 */
	public String getName() { //defines method getName
		return this.name;  //returns instance variable name
	}
	/**
	 * gets a menu's name.
	 * @param name refers the name entered.
	 */
	public void setName(String name) { //defines method setName
		this.name = name; //parameter name is entered into instance variable name
	}
	
	/**
	 * returns a menu's price.
	 * @return refers the menu's price.
	 */
	public int getPrice() { //defines method getPrice
		return this.price; //returns instance variable price
	}
	
	/**
	 * gets a menu's price.
	 * @param price refers the price entered.
	 */
	public void setPrice(int price) { //defines method setPrice
		this.price = price; //parameter price value is entered into instance variable name
	}
	
	/**
	 * returns a menu's rating(number of stars).
	 * @return refers the menu's rating.
	 */
	public int getRatings() { //defines method getRatings
		return this.ratings;  //returns the instance variable ratings
	}
	/**
	 * gets a menu's rating(number of stars).
	 * @param ratings refers the rating entered.
	 */
	public void setRatings(int ratings) { //defines method setRatings
		this.ratings = ratings; //parameter ratings value is entered into instance variable name
	}
}


