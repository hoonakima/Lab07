package edu.handong.csee.java.lab07.prob2;

public class Chicken {

	private String name;
	private int price;
	private int ratings;
	private enum Data{
		name, price, ratings
	};
	
	public Chicken() {
		this.name = "initialName";
		this.price = 0;
		this.ratings = 0;
		
	}
	
	public Chicken(String name,int price, int ratings) {
		setChicken(name, price, ratings);
	}
	
	public void setChicken(String name, int price, int ratings) {
		this.name =name;
		this.price = price;
		this.ratings = ratings;
	}
	
	public void getChicken() {
		for(Data nextData : Data.values()) {
			System.out.print(nextData);
		}
		System.out.println();
	}
}


//git export!!!!!!!!!