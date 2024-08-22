import java.util.*;
class Q4{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("DO you have Membership ? yes/no");
		String mem = sc.next();
		int amount = 1000;
		if(amount >= 1000){
			if(mem.equals("yes")){
				int discount = (amount/100)*25;
				System.out.println("Amount after discount"+ (amount-discount));
			}else{
				int discount = (amount/100)*20;
				System.out.println("Amount after discount"+ (amount-discount));
			}
			
		}else if(amount >= 500 && amount < 1000){
			if(mem.equals("yes")){
				int discount = (amount/100)*15;
				System.out.println("Amount after discount"+ (amount-discount));
			}else{
				int discount = (amount/100)*10;
				System.out.println("Amount after discount"+ (amount-discount));
			}
		}else{
			if(mem.equals("yes")){
				int discount = (amount/100)*10;
				System.out.println("Amount after discount"+(amount-discount));
			}else{
				int discount = (amount/100)*5;
				System.out.println("Amount after discount"+ (amount-discount));
			}
		}
		
		
	}
}
/*
If the total purchase is greater than or equal to Rs.1000, apply a 20% discount. 
If the total purchase is between Rs.500 and Rs.999, apply a 10% discount. 
If the total purchase is less than Rs.500, apply a 5% discount. 
Additionally, if the user has a membership card, increase the discount by 5%. 
*/