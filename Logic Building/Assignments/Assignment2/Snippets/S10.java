/*

Snippet 10

public class Main { 
 public void display() { 
	System.out.println("No parameters"); 
 } 
 public void display(int num) { 
	System.out.println("With parameter: " + num); 
 } 
 public static void main(String[] args) { 
	 display(); 
	 display(5); 
 } 
 Error : we cant access non static methods without creating object of class. Method overloading is allowed but we have to create a object 
 make the methods static.
} 
*/

public class S10 { 
 public static void display() { 
	System.out.println("No parameters"); 
 } 
 public static void display(int num) { 
	System.out.println("With parameter: " + num); 
 } 
 public static void main(String[] args) { 
	 display(); 
	 display(5); 
 } 
} 