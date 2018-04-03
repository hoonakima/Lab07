package edu.handong.csee.java.lab07.prob2;


public class Chicken_main {


	public static void main(String[] args) {
	
		Chicken firstChicken = new Chicken("Cheese_mustard", 15000, 5);
		Chicken secondChicken = new Chicken("Honey_mustard", 15000, 5);
		Chicken thirdChicken = new Chicken("Spicy_chicken", 13000, 5);
		
		firstChicken.setRatings(3);
		secondChicken.setRatings(4);
		thirdChicken.setRatings(1);
		

		System.out.println(firstChicken.getName() + "'s rating is " + firstChicken.getRatings());
		System.out.println(secondChicken.getName() + "'s rating is " + secondChicken.getRatings());
		System.out.println(thirdChicken.getName() + "'s rating is " + thirdChicken.getRatings());
	}

}
