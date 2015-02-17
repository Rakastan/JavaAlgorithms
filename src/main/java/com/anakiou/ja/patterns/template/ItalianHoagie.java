package com.anakiou.ja.patterns.template;

public class ItalianHoagie extends Hoagie {

	String[] meatUsed = { "Salami", "Pepperoni", "Capicola Ham" };

	String[] cheeseUsed = { "Provolone" };

	String[] veggiesUsed = { "Lettuce", "Tomatoes", "Onions", "Sweet Peppers" };

	String[] condimentsUsed = { "Oil", "Vinegar" };

	@Override
	void addMeat() {
		System.out.println("Adding the Meat: ");

		for (String meat : meatUsed) {
			System.out.println(meat + "");
		}
	}

	@Override
	void addCheese() {
		System.out.println("Adding the Cheese: ");

		for (String cheese : cheeseUsed) {
			System.out.println(cheese + "");
		}
	}

	@Override
	void addVegetables() {
		System.out.println("Adding the Veggies: ");

		for (String veg : veggiesUsed) {
			System.out.println(veg + "");
		}
	}

	@Override
	void addCondiments() {
		System.out.println("Adding the Condiments: ");

		for (String condiment : condimentsUsed) {
			System.out.println(condiment + "");
		}
	}

}
