/*
Snippet 22: 
public class Main { 
 public static void main(String[] args) { 
 static void displayMessage() { 
 System.out.println("Message"); 
 } 
 } 
} 
Error : we cannot declare a method inside another method.

*/
//corrected
public class S22 { 

static void displayMessage() { 
 System.out.println("Message"); 
}
 public static void main(String[] args) { 
	displayMessage();
 } 
} 

