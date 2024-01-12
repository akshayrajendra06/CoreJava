package com.JavaTutorial;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Consumer;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 * Hello world!
 **/


public class App 
{
    public static void main( String[] args )
    {

	ArrayList<Integer> arrayList = new ArrayList();
	arrayList.add(6);
	arrayList.add(2);
	arrayList.add(5);
	arrayList.add(8);
	arrayList.add(1);
	arrayList.add(0);
	arrayList.add(10);
	arrayList.add(9);
	
	System.out.println(arrayList);
//	[6, 2, 5, 8, 1, 0, 10, 9]

	
	
	Collections.sort(arrayList);
	System.out.println(arrayList);
//	[0, 1, 2, 5, 6, 8, 9, 10]
	
	
//  using Map HashMap
//	Map<K, V>
	Map<String , Employee> map = new HashMap();

	Employee employee1 = new Employee(1L, "Mher");
	
	// we put employee name and Object 
	map.put(employee1.getName(), employee1);
	Employee employee2 = new Employee(22L, "Annie");
	map.put(employee2.getName(), employee2);
	Employee employee3 = new Employee(8L, "John");
	map.put(employee3.getName(), employee3);
	Employee employee4 = new Employee(2L, "George");
	map.put(employee4.getName(), employee4);
	
	// Using TreeMap
	TreeMap<String, Employee> sorted = new TreeMap();
	
	sorted.putAll(map);
	
	System.out.println(map);
//	{George=com.Email.Employee@17ba57f0, John=com.Email.Employee@3481ff98, Annie=com.Email.Employee@2ddb3ae8, Mher=com.Email.Employee@79518e00}

	System.out.println("Tree Map "+ sorted);
//	{Annie=com.Email.Employee@2ddb3ae8, George=com.Email.Employee@17ba57f0, John=com.Email.Employee@3481ff98, Mher=com.Email.Employee@79518e00}

	
	// Using  Sort by Key
//											     map.values();
	List<String> employeeByKey = new ArrayList(map.keySet());
	List<Integer> employeeByvalue = new ArrayList(map.values());
	Collections.sort(employeeByKey);
	
	
	System.out.println(employeeByKey);
//	[Annie, George, John, Mher]
	
	System.out.println(employeeByvalue);
//	[com.Email.Employee@5f96f6a2, com.Email.Employee@48df4071, com.Email.Employee@290e8cab, com.Email.Employee@6e3ecf5c]
			
	
	// Array List directy use Employee object
	List<Employee> employeeById = new ArrayList(map.values());
	System.out.println(employeeById);
//	[com.Email.Employee@5f96f6a2, com.Email.Employee@48df4071, com.Email.Employee@290e8cab, com.Email.Employee@6e3ecf5c]

	
//	Using a TreeSet		
	Map<String , Long> map2 = new HashMap();
	// we put employee name and id  
	map2.put(employee1.getName(), employee1.getId());
	
	map2.put(employee2.getName(), employee2.getId());
	
	map2.put(employee3.getName(), employee3.getId());

	map2.put(employee4.getName(), employee4.getId());
	
	// value store in employe object 
	SortedSet<String> valueSet = new TreeSet(map2.values());
	System.out.println(valueSet);
	//[1, 2, 8, 22]
	
	
	Consumer<Integer>  empy = (n)-> {System.out.println(n);};
	arrayList.forEach( empy);
	
	arrayList.forEach((n)-> {System.out.println(n);});
		
	System.out.println(empy);

	
	
	    StringFunction exclaim = (s) -> s + "!";
	    StringFunction ask = (s) -> s + "?";
	    printFormatted("Hello", exclaim);
	    printFormatted("Hello", ask);
	    
	    String words = "One Two Three Four";
	    int countWords = words.split("\\s").length;
	    System.out.println(countWords);
	    
	    String originalStr = "Hello";
	    String reversedStr = "";
	    System.out.println("Original string: " + originalStr);
	        
	    for (int i = 0; i < originalStr.length(); i++) {
	      reversedStr = originalStr.charAt(i) + reversedStr;
	      System.out.println(" : "+reversedStr);
	    }
	    
}

interface StringFunction {

	  String run1(String str);
	}
  public static void printFormatted(String str, StringFunction format) {
	    String result = format.run1(str);
	    System.out.println(result);
	    
//	    Hello!
//	    Hello?
	  }


}