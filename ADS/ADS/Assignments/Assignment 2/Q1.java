class Q1{
	public static void main(String[] args){
		int n = 5;
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= i; j++){
				System.out.print('*');
			}
			System.out.println();
		}
	}
}

/*
Tc : O(n^2)

Explaination: i have taken two loops outer loops is for number of lines and inner loop is to print star 




*/