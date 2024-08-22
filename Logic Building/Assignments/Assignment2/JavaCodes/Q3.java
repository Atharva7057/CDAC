import java.util.*;
class Q3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		char optr =  sc.next().charAt(0);;
		int num2 = sc.nextInt();
		
		if(optr == '+'){
			System.out.println(num1+num2);
		}else if(optr == '-'){
			System.out.println(num1-num2);
		}
		else if(optr == '*'){
			System.out.println(num1*num2);
		}else if(optr == '/'){
			System.out.println(num1/num2);
		}else{
			System.out.println("Invalid input");
		}
	}
}