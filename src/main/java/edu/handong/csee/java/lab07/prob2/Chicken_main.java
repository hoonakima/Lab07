package edu.handong.csee.java.lab07.prob2;


public class Chicken_main {


	public static void main(String[] args) {
	
		Chicken firstChicken = new Chicken();
		firstChicken.setName("Cheese_mustard");
		firstChicken.setRatings(3);
		
		Chicken secondChicken = new Chicken();
		secondChicken.setName("Honey_mustard");
		secondChicken.setRatings(4);
		
		Chicken thirdChicken = new Chicken();
		thirdChicken.setName("Spicy_chicken");
		thirdChicken.setRatings(1);
		
		String firstName = firstChicken.getName();
		String secondName = secondChicken.getName();
		String thirdName = thirdChicken.getName();
		
		int firstRating = firstChicken.getRatings();
		int secondRating = secondChicken.getRatings();
		int thirdRating = thirdChicken.getRatings();

		System.out.println(firstName + "'s rating is " + firstRating);
		System.out.println(secondName + "'s rating is " + secondRating);
		System.out.println(thirdName + "'s rating is " + thirdRating);
	}

}
