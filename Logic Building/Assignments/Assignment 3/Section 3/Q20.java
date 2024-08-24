public class Q20 {
    public static void main(String[] args) {
        int n = 0;
        int t = 5;
        for (int i = 1; i <=5 ; i++) {
            for (int j = 5; j >= t ; j--) {
                System.out.print(j);
                if (t < j){
                    System.out.print("*");
                }
            }

            t--;
            System.out.println();
        }
    }
}
