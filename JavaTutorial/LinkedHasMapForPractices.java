package com.JavaTutorial;

import java.util.EnumMap;
import java.util.LinkedHashMap;

public class LinkedHasMapForPractices {
enum Size {
    SMALL, MEDIUM, LARGE, EXTRALARGE
}
	 public static void main(String[] args) {
	        // Creating a LinkedHashMap of even numbers
	        LinkedHashMap<String, Integer> evenNumbers = new LinkedHashMap<>();
	        evenNumbers.put("Two", 2);
	        evenNumbers.put("Four", 4);
	        evenNumbers.put("Two", 2);
	        evenNumbers.put("Four", 4);
	     System.out.println("LinkedHashMap1: " + evenNumbers);

	        // Creating a LinkedHashMap from other LinkedHashMap
	        LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>(evenNumbers);
	            numbers.put("Three", 3);
	     System.out.println("LinkedHashMap2: " + numbers);
	        
	        
	     System.out.println("-----------------------------------------------------");
	        
	        // Creating LinkedHashMap of even numbers
	        LinkedHashMap<String, Integer> evenNumbers1 = new LinkedHashMap<>();

	        // Using put()
	        evenNumbers1.put("Two", 2);
	        evenNumbers1.put("Four", 4);
	        System.out.println("Original LinkedHashMap : " + evenNumbers1);

	        // Using putIfAbsent()
	        evenNumbers1.putIfAbsent("Six", 6);
	        System.out.println("Updated LinkedHashMap : " + evenNumbers1);

	        //Creating LinkedHashMap of numbers
	        LinkedHashMap<String, Integer> numbers1 = new LinkedHashMap<>();
	        numbers1.put("One", 1);

	        // Using putAll()
	        numbers1.putAll(evenNumbers1);
	        System.out.println("New LinkedHashMap  : " + numbers1);
	        
	        
	        System.out.println("-------------------------------------------");
	        
	        LinkedHashMap<String, Integer> numbers11 = new LinkedHashMap<>();

	             numbers11.put("One", 1);
	             numbers11.put("Two", 2);
	             numbers11.put("Three", 3);
	        System.out.println("LinkedHashMap: " + numbers11);

	        // Using entrySet()
	        System.out.println("Key/Value mappings: " + numbers11.entrySet());

	        // Using keySet()
	        System.out.println("Keys: " + numbers11.keySet());

	        // Using values()
	        System.out.println("Values: " + numbers11.values());
	        
	     // Using get()
	        int value1 = numbers11.get("Three");
	        System.out.println("Returned Number: " + value1);

	        // Using getOrDefault()
	        int value2 = numbers11.getOrDefault("Five", 5);
	        System.out.println("Returned Number: " + value2);
	        
	                
	        System.out.println("-----------------------------------");
	        
	        // Creating an EnumMap of the Size enum
	        EnumMap<Size, Integer> sizes = new EnumMap<>(Size.class);
	        sizes.put(Size.SMALL, 28);
	        sizes.put(Size.MEDIUM, 32);
	        sizes.put(Size.LARGE, 36);
	        sizes.put(Size.EXTRALARGE, 40);
	        System.out.println("EnumMap: " + sizes);

	        // Using the entrySet Method
	        System.out.println("Key/Value mappings: " + sizes.entrySet());

	        // Using the keySet Method
	        System.out.println("Keys: " + sizes.keySet());

	        // Using the values  Method
	        System.out.println("Values: " + sizes.values());
	        
	    }
	}


