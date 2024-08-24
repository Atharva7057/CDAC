/*
 *
 *Snippet 10:
public class IncorrectWhileLoopControl {
     public static void main(String[] args) {
         int num = 10;
             while (num = 10) {
             System.out.println(num);
             num--;
            }
         }
}
* Error: The condition in while is not correct. the condition should return boolean value
* */
// correct code:
public class S10 {
    public static void main(String[] args) {
        int num = 10;
        while (num >= 0) {
            System.out.println(num);
            num--;
        }
    }
}
