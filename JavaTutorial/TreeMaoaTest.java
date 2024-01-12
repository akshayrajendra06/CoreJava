package com.JavaTutorial;

import java.util.TreeMap;

public class TreeMaoaTest {

	 public static void main(String[] args) {
	        // Creating TreeMap of even numbers
	        TreeMap<String, Integer> evenNumbers = new TreeMap<>();

	        // Using put()
	        evenNumbers.put("Two", 2);
	        evenNumbers.put("Four", 4);

	        // Using putIfAbsent()
	        evenNumbers.putIfAbsent("Six", 6);
	        System.out.println("TreeMap of even numbers: " + evenNumbers);

	        //Creating TreeMap of numbers
	        TreeMap<String, Integer> numbers = new TreeMap<>();
	        numbers.put("One", 1);

	        // Using putAll()
	        numbers.putAll(evenNumbers);
	        System.out.println("TreeMap of numbers: " + numbers);
	        
	        
	        System.out.println("----------1-----------------------------");
	        
	        TreeMap<String, Integer> numbers1 = new TreeMap<>();

	        numbers1.put("One", 1);
	        numbers1.put("Two", 2);
	        numbers1.put("Three", 3);
	        System.out.println("TreeMap: " + numbers1);

	        // Using entrySet()
	        System.out.println("Key/Value mappings: " + numbers1.entrySet());

	        // Using keySet()
	        System.out.println("Keys: " + numbers1.keySet());

	        // Using values()
	        System.out.println("Values: " + numbers1.values());
	        
	        
	        System.out.println("----------2-----------------------------");
	        
	     // Using get()
	        TreeMap<String, Integer> numbers11 = new TreeMap<>();
	        numbers11.put("First", 1);
	        numbers11.put("Second", 2);
	        numbers11.put("Third", 3);
	        System.out.println("TreeMap: " + numbers11);
	        
	        int value1 = numbers11.get("Third");
	        System.out.println("Using get(): " + value1);

	        // Using getOrDefault()
	        
//	        getOrDefault() - Returns the value 
//	        associated with the specified key. Returns 
//	        the specified default value if the key is not found.
	        int value2 = numbers11.getOrDefault("Five", 5);
	        System.out.println("Using getOrDefault(): " + value2);
	        
	        System.out.println("---------------3------------------------");
		     
	        // remove method with single parameter
	        int value = numbers.remove("Two");
	        System.out.println("Removed value: " + value);

	        // remove method with two parameters
	        boolean result = numbers.remove("Three", 3);
	        System.out.println("Is the entry {Three=3} removed? " + result);

	        System.out.println("Updated TreeMap: " + numbers);
	        
	       
	        System.out.println("---------------4------------------------");
		      
	        // Using replace()
	        numbers11.replace("Second", 22);
	        numbers11.replace("Third", 3, 33);
	        System.out.println("TreeMap using replace: " + numbers11);

	         // Using replaceAll()
	        numbers11.replaceAll((key, oldValue) -> oldValue + 2);
	        System.out.println("TreeMap using replaceAll: " + numbers11);
	        
	        // Using the firstKey() method
	        String firstKey = numbers11.firstKey();
	        System.out.println("First Key: " + firstKey);

	        // Using the lastKey() method
	        String lastKey = numbers11.lastKey();
	        System.out.println("Last Key: " + lastKey);

	        // Using firstEntry() method
	        System.out.println("First Entry: " + numbers11.firstEntry());

	        // Using the lastEntry() method
	        System.out.println("Last Entry: " + numbers11.lastEntry());
	        
	        System.out.println("------------------5----------------------------");
	        
	        TreeMap<String, Integer> numbers111 = new TreeMap<>();
	        numbers111.put("First", 1);
	        numbers111.put("Second", 5);
	        numbers111.put("Third", 4);
	        numbers111.put("Fourth", 6);
	        System.out.println("TreeMap: " + numbers111);

	        /*
higherKey() - Returns the lowest key among those keys that 
are greater than the specified key.
higherEntry() - Returns an entry associated with a key that is lowest 
among all those keys greater than the specified key.

lowerKey() - Returns the greatest key among all those keys that are less than
the specified key.
lowerEntry() - Returns an entry associated with a key that is greatest among
all those keys that are less than the specified key.
 
ceilingKey() - Returns the lowest key among those keys that are greater 
than the specified key. If the key passed as an argument is present in the 
map, it returns that key.

ceilingEntry() - Returns an entry associated with a key that is lowest among 
those keys that are greater than the specified key. It an entry associated
with the key passed an argument is present in the map, it returns the entry 
associated with that key.
 
floorKey() - Returns the greatest key among those keys that are less than
 the specified key. If the key passed as an argument is present, it returns 
 that key.
 
floorEntry() - Returns an entry associated with a key that is greatest 
among those keys that are less than the specified key. If the key passed as 
argument is present, it returns that key.

 */
	        
	        // Using higher()
	        System.out.println("Using higherKey(): " + numbers111.higherKey("Fourth"));
	        System.out.println("Using higherEntry(): " + numbers111.higherEntry("Fourth"));

	        // Using lower()
	        System.out.println("\nUsing lowerKey(): " + numbers111.lowerKey("Fourth"));
	        System.out.println("Using lowerEntry(): " + numbers111.lowerEntry("Fourth"));

	        // Using ceiling()
	        System.out.println("\nUsing ceilingKey(): " + numbers111.ceilingKey("Fourth"));
	        System.out.println("Using ceilingEntry(): " + numbers111.ceilingEntry("Fourth"));

	        
	       
	        // Using floor()
	        System.out.println("\nUsing floorKey(): " + numbers111.floorKey("Fourth"));
	        System.out.println("Using floorEntry(): " + numbers111.floorEntry("Fourth"));

	        
	        System.out.println("------------------------ss-----------------");
	        
	        /*
	        pollFirstEntry() and pollLastEntry() Methods
	        pollFirstEntry() - returns and removes the entry associated with the first key of the map
	        pollLastEntry() - returns and removes the entry associated with the last key of the map

	        */
	        
	        TreeMap<String, Integer> numbers1111 = new TreeMap<>();
	        numbers1111.put("First", 1);
	        numbers1111.put("Second", 2);
	        numbers1111.put("Third", 3);
	        System.out.println("TreeMap: " + numbers1111);

	        //Using the pollFirstEntry() method
	        System.out.println("Using pollFirstEntry(): " + numbers1111.pollFirstEntry());

	        // Using the pollLastEntry() method
	        System.out.println("Using pollLastEntry(): " + numbers1111.pollLastEntry());

	        System.out.println("Updated TreeMap: " + numbers1111);
	        
	 }
	 
}
