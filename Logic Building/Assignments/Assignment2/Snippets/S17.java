/*
Snippet 17: 
public class Main { 
 public static void main(String[] args) { 
 int a = 10; 
 int b = 5; 
 int result = a ** b; 
 System.out.println(result); 
 } 
} 
Error : error: illegal start of expression
    int result = a ** b;
	reason : The ** operator is not a valid operator in Java.

*/
//corrected

public class S17 { 
	 public static void main(String[] args) { 
		 int a = 10; 
		 int b = 5; 
		 int result = a * b; 
		 System.out.println(result); 
	 } 
} 