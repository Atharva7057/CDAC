/*
public class OffByOneDoWhileLoop {
    public static void main(String[] args) {
     int num = 1;
     do {
         System.out.println(num);
         num--;
     } while (num > 0);
     }
}
Error: Here the condition in while is incorrect it should br num <= 5 and the num should increment
not decrement.
* */
//corrected
public class S8 {
    public static void main(String[] args) {
        int num = 1;
        do {
            System.out.println(num);
            num++;
        } while (num <= 5);
    }
}
