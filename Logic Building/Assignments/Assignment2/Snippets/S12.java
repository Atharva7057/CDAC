/*
Snippet 12: 
public class Main { 
 public static void main(String[] args) { 
 while (true) { 
 System.out.println("Infinite Loop"); 
 } 
 } 
} 
Error : this will fall into infinit loop and will print the output till the memory gets full.
to avoid this we need to give condition to while loop 
*/
//corrected

public class S12 { 
 public static void main(String[] args) { 
 int i = 0;
 while (i < 10) { 
	 System.out.println("Infinite Loop"); 
	 i++;
	} 
 } 
} 
