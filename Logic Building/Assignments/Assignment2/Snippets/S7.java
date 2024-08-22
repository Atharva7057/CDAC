/*
Snippet 7: 
public class Main { 
 public static void main(String[] args) { 
	 int x = "Hello"; 
	 System.out.println(x); 
 } 
} 

Error : incompatible types: String cannot be converted to int
wr are trying to store string in int variable which is not acepted.

*/

//corrected
public class S7 { 
 public static void main(String[] args) { 
	 String x = "Hello"; 
	 System.out.println(x); 
 } 
} 
