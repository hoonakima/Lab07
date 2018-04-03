package edu.handong.csee.java.lab07.prob2;

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
public class Chicken {

	private String name;
	private int price;
	private int ratings;
	
	
	public Chicken() {
		this.name = "justChicken";
		this.price = 0;
		this.ratings = 0;
		
	}
	
	public Chicken(String name, int price, int ratings) {
		this.name = name;
		this.price = price;
		this.ratings =ratings;
	}
	
	/**
	 * returns a menu's name.
	 * @return refers the menu's name.
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * gets a menu's name.
	 * @param name refers the name entered.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * returns a menu's price.
	 * @return refers the menu's price.
	 */
	public int getPrice() {
		return this.price;
	}
	
	/**
	 * gets a menu's price.
	 * @param price refers the price entered.
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	
	/**
	 * returns a menu's rating(number of stars).
	 * @return refers the menu's rating.
	 */
	public int getRatings() {
		return this.ratings;
	}
	/**
	 * gets a menu's rating(number of stars).
	 * @param ratings refers the rating entered.
	 */
	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
}


