public class Q22 {
    public static void main(String[] args) {
        int n = 9;
        int col = n*2-1;
        for (int i = 1; i <= n ; i++) {
//            spaces
            for (int j = 1; j <= i ; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= col ; k++) {
                System.out.print('*');
            }
            col-=2;
            System.out.println();
        }
//        straight
        int scol = 3;
        for (int i = 2; i <= n; i++) {
//            spaces
            for (int j = n; j >= i ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= scol ; k++) {
                System.out.print("*");
            }
            scol+=2;
            System.out.println();
        }
    }
}
