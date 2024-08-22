/*
public class Main { 
	 public static void main(String[] args) { 
		System.out.println("Main method with String[] args"); 
	 } 
	 public static void main(int[] args) { 
		System.out.println("Overloaded main method with int[] args"); 
	 } 
	 
	 error: cant have multipe main methods . but here only one method main method is correct so it will be treated as main method
} 
*/

//corrected code:

public class Snippet5 { 
	 public static void main(String[] args) { 
		System.out.println("Main method with String[] args"); 
		main(new int[]{1,2,3});
	 } 
	 public static void main(int[] args) { 
		System.out.println("Overloaded main method with int[] args"); 
	 } 
	 
}

