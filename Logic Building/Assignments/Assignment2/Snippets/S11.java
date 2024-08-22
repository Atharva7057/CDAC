/*
Snippet 11;
public class Main { 
 public static void main(String[] args) { 
	 int[] arr = {1, 2, 3}; 
	 System.out.println(arr[5]); 
 } 
} 
Error : ArrayIndexOutOfBoundsException will occur because arr length is 3 and we are trying to access 5th index which is not possible
*/
public class S11 { 
 public static void main(String[] args) { 
 int[] arr = {1, 2, 3}; 
 System.out.println(arr[2]); 
 } 
} 