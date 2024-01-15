package com.JavaTutorial15_01_2024;

public class StatickeywordCountriesApp {

	 public static void main(String[] args) {
	        System.out.println("Number of countries: " + StatickeywordCountry.getNumberOfCountries());
	        StatickeywordCountry brazil = new StatickeywordCountry("Brazil", 210000000, "Brasilia");
	        brazil.getDetails();
	        StatickeywordCountry germany = new StatickeywordCountry("Germany", 83000000, "Berlin");
	        germany.getDetails();
	        StatickeywordCountry japan = new StatickeywordCountry("Japan", 12500000, "Tokyo");
	        japan.getDetails();
	        System.out.println("Number of countries: " + StatickeywordCountry.getNumberOfCountries());
	    }
}
