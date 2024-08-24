/*
public class S2 {
    public static void main(String[] args) {
        int count = 5;
        while (count = 0) {
            System.out.println(count);
            count--;
        }
    }
}
Error The problem is with the condition in while loop. the condition should always return boolean value.
To correct this code we have to change the condition to >=.
 */
//corrected code
public class S2 {
    public static void main(String[] args) {
        int count = 5;
        while (count >= 0) {
            System.out.println(count);
            count--;
        }
    }
}

