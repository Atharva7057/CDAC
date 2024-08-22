/*
snippet 1
public class Snippet1 { 
	 public void main(String[] args) { 
		System.out.println("Hello, World!"); 
	 } 
	 
	 Error : The main method should always be static. Because when JVM couldnt find non staic methods, because we have to create a object of nonstatic method
	 
	 
}
*/

// corrected code
public class Snippet1 { 
	 public static void main(String[] args) { 
		System.out.println("Hello, World!"); 
	 } 
} 
