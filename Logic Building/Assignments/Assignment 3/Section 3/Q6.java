public class Q6 {
    public static boolean isprime(int num){
        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 5;
        int start = 2;

        while (count > 0){
            if (isprime(start)){
                System.out.println(start);
                count--;
            }
            start++;
        }
    }
}
