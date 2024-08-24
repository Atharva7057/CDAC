/*
public class DoWhileIncorrectCondition {
 public static void main(String[] args) {
     int num = 0;
     do {
        System.out.println(num);
        num++;
     } while (num > 0);
   }
}
// Error to investigate: Why does the loop only execute once? What is wrong with the loop condition in the `do while` loop?

Error : This do while loop will execute infinite times. because the condition will always be true.
To run this code only once we have to decrement the i value.
 */
//COrrected
public class S3 {
    public static void main(String[] args) {
        int num = 0;
        do {
            System.out.println(num);
            num--;
        } while (num > 0);
    }
}
