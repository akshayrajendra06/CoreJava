package com.JavaTutorial15_01_2024;


class Person {
    // Encapsulating the name and age
    // only approachable and used using
    // methods defined
    private String name;
    private int age;
 
    public String getName() { return name; }
 
    public void setName(String name) { this.name = name; }
 
    public int getAge() { return age; }
 
    public void setAge(int age) { this.age = age; }
}
 

class Area {
    int length;
    int breadth;
 
    // constructor to initialize values
    Area(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
 
    // method to calculate area
    public void getArea()
    {
        int area = length * breadth;
        System.out.println("Area: " + area);
    }
}

class Encapsulate {
    // private variables declared
    // these can only be accessed by
    // public methods of class
    private String geekName;
    private int geekRoll;
    private int geekAge;
 
    // get method for age to access
    // private variable geekAge
    public int getAge() { return geekAge; }
 
    // get method for name to access
    // private variable geekName
    public String getName() { return geekName; }
 
    // get method for roll to access
    // private variable geekRoll
    public int getRoll() { return geekRoll; }
 
    // set method for age to access
    // private variable geekage
    public void setAge(int newAge) { geekAge = newAge; }
 
    // set method for name to access
    // private variable geekName
    public void setName(String newName)
    {
        geekName = newName;
    }
 
    // set method for roll to access
    // private variable geekRoll
    public void setRoll(int newRoll) { geekRoll = newRoll; }
}
 

public class EncapsulationCoding {

	public static void main(String[] args)
    {
        // person object created
        Person person = new Person();
        person.setName("John");
        person.setAge(30);
 
        // Using methods to get the values from the
        // variables
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        
        
        Area rectangle = new Area(2, 16);
        rectangle.getArea();
        
        Encapsulate obj = new Encapsulate();
        
        // setting values of the variables
        obj.setName("Harsh");
        obj.setAge(19);
        obj.setRoll(51);
 
        // Displaying values of the variables
        System.out.println("Geek's name: " + obj.getName());
        System.out.println("Geek's age: " + obj.getAge());
        System.out.println("Geek's roll: " + obj.getRoll());
 
        // Direct access of geekRoll is not possible
        // due to encapsulation
        // System.out.println("Geek's roll: " +
        // obj.geekName);
    }
}
