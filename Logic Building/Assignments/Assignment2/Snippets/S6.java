/*
Snippet 6:
public class Main { 
 public static void main(String[] args) { 
	 int x = y + 10; 
	 System.out.println(x); 
 } 
}
Error : Here y variable is not declared.we need to declare and initialize the variable y

*/
//corrected
public class S6 { 
 public static void main(String[] args) { 
 int y = 1;
 int x = y + 10; 
 System.out.println(x); 
 } 
} 
