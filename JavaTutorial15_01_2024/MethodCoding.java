package com.JavaTutorial15_01_2024;

public class MethodCoding {


	  // method with no parameter
	  public void display1() {
	    System.out.println("Method without parameter");
	  }

	  // method with single parameter
	  public void display2(int a) {
	    System.out.println("Method with a single parameter: " + a);
	  }

	  public static int square(int num) {

		    // return statement
		    return num * num;
		  }
	  
	  public static void main(String[] args) {
	    
	    // create an object of Main
		  MethodCoding obj = new MethodCoding();

	    // calling method with no parameter
	    obj.display1();
	    
	    // calling method with the single parameter
	    obj.display2(24);
	    
	    int result;

	    // call the method
	    // store returned value to result
	    result = square(10);

	    System.out.println("Squared value of 10 is: " + result);
	    
	  }
}
