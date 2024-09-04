public class Q1 {
    public static void main(String[] args) {
        int c = 1;
//        spaces
        int n = 7;
        for (int i = 0; i < n; i++) {
//            spaces
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < c; j++) {
                if (j == 0 || j == c-1 || i == n-1){
                    System.out.print("*");
                }
                 else{
                    System.out.print(" ");
                }
            }
            c+=2;
            
            
            System.out.println();
        }
       

    }
}
