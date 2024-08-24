/*
Snippet 1
public class S1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i--) {
            System.out.println(i);
        }
    }
}

Error: i will always be lays than 0. Because we are decrementing it. To make this code run we
have to increment i
 */
//Corrected Code
public class S1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}