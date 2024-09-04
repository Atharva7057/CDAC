public class Q3 {
    public static void main(String[] args) {
        int n = 5;
        int c = 1;
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                    System.out.print(" ");
            }
            for (char j = 0; j < c; j++) {
                System.out.print(ch);
                ch++;
            }

            c+=2;


            System.out.println();
        }
    }
}
