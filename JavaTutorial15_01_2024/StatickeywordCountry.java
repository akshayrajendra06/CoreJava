package com.JavaTutorial15_01_2024;

public class StatickeywordCountry {

	 private static int numberOfCountries;
	    private final String NAME;
	    private int population;
	    private String capital;

	    static {
	        numberOfCountries = 5;
	    }

	    public StatickeywordCountry(String name, int population, String capital) {
	        NAME = name;
	        this.population = population;
	        this.capital = capital;
	        numberOfCountries++;
	    }

	    public final void populationChange(int change){
	        population += change;
	    }

	    public void getDetails() {
	        System.out.println("Country name: " + NAME + " Population: " + population + " Capital: " + capital);
	    }

	    public static int getNumberOfCountries() {
	        return numberOfCountries;
	    }

	    static {
	        numberOfCountries = 0;
	    }
}
