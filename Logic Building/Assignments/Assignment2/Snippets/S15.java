/*
Snippet 15: 
public class Main { 
 public static void main(String[] args) { 
 int num1 = 10; 
 double num2 = 5.5; 
 int result = num1 + num2; 
 System.out.println(result); 
 } 
} 
Error: here we are adding two valuses with different datatypes and storing the result in int datatype variable we need 
to typecast this before printing.
*/


public class S15 { 
 public static void main(String[] args) { 
 int num1 = 10; 
 double num2 = 5.5d; 
 double result = num1 + num2; 
 System.out.println((int)result); 
 } 
} 
