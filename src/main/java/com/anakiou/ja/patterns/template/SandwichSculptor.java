package com.anakiou.ja.patterns.template;

public class SandwichSculptor {

	public static void main(String[] args) {

		Hoagie cust12Hogie = new ItalianHoagie();

		cust12Hogie.makeSandwich();

		Hoagie cust13Hogie = new VeggieHoagie();

		cust13Hogie.makeSandwich();

	}

}
