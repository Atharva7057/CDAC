/*
* public class IncorrectLoopUpdate {
     public static void main(String[] args) {
         int i = 0;
         while (i < 5) {
             System.out.println(i);
             i += 2; // Error: This may cause unexpected results in output
          }
    }
}
* */

public class S11 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i += 2; // Error: This may cause unexpected results in output
        }
    }
}
