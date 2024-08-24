public class Q16 {
    public static void main(String[] args) {
        int n = 5;
        int col = 1;
        for (int i = 1; i <= n ; i++) {
//            print spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= col ; k++) {
                System.out.print("*");
            }
            col+=2;

            System.out.println();


        }
    }
}
