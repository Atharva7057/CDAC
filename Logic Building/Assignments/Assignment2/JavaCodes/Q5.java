import java.util.*;
class Q5{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Physics marks");
		int phy = sc.nextInt();
		System.out.println("Enter Chemistry marks");
		int chem = sc.nextInt();
		System.out.println("Enter Maths marks");
		int maths = sc.nextInt();
		
		if(phy >= 40 && chem >= 40 && maths >= 40){
			System.out.println("Result : Pass");
		
		}else{
			System.out.println("Result : Fail");
		}
	}
}