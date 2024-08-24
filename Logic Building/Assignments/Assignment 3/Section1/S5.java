/*
public class WrongInitializationForLoop {
    public static void main(String[] args) {
         for (int i = 10; i >= 0; i++) {
         System.out.println(i);
        }
 }
}
Error : we have to print from 10 to 1 . there is small error in code
 i is incrementing instead of decrementing.
 */

//Corrected
public class S5 {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
