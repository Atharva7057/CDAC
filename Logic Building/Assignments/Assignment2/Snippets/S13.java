/*
Snippet 13: 
public class Main { 
 public static void main(String[] args) { 
 String str = null; 
 System.out.println(str.length()); 
 } 
} 
Error : it will thow NullPointerException because we are storing null in the variable. the variable must be assigned with a valid string value

*/


public class S13 { 
 public static void main(String[] args) { 
	 String str = "CDAC Mumbai"; 
	 System.out.println(str.length()); 
	 } 
} 
