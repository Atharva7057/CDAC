public class Q2 {
    public static void main(String[] args) {
        int n = 7;
        int c = (n*2)-1;
        for (int i = 0; i < n; i++) {
//            spaces
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
//            main
            for (int j = 0; j < c; j++) {
                if (j == 0 || j == c-1 || i == 0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            c-=2;
            System.out.println();
        }
    }
}
