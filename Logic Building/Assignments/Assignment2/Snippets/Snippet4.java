/*
Snippet 4: 
public class Main { 
 public static void main() { 
	System.out.println("Hello, World!"); 
 } 
} 

Error: Main method not found in class Snippet4, please define the main method as:
   public static void main(String[] args)
	or a JavaFX application class must extend javafx.application.Application
	
	Q) Why is String[] args needed?
	Ans: String[] args should be passed as an parameter in method . this acts as the entry point of the program. The String[] args 
	parameter in the main method allows the program to accept command-line arguments when the program is run.
	
*/
 
public class Snippet4 { 
 public static void main(String[] args) { 
	System.out.println("Hello, World!"); 
 } 
} 
