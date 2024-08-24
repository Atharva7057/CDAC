public class Q18 {
    public static void main(String[] args) {
        int n = 5;
        int col = 1;
//        straight
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
//        reverse
        int rcol = n*2-3;
        for (int i = n; i >= 1 ; i--) {
//            spaces
            for (int j = i; j <= n ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= rcol ; k++) {
                System.out.print('*');
            }
            rcol-=2;
            System.out.println();
        }
    }
}
