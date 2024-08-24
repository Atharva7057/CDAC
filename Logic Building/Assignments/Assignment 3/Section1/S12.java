/*
* public class LoopVariableScope {
     public static void main(String[] args) {
         for (int i = 0; i < 5; i++) {
            int x = i * 2;
         }
        System.out.println(x); // Error: 'x' is not accessible here
     }
}
Error: The x variable is not in scope when we are printing it. if we want to accept the variable we have to
* declare x outside for loop.
*
* */
//corrected
public class S12 {
    public static void main(String[] args) {
        int x = 1;
        for (int i = 0; i < 5; i++) {
            x = i * 2;
        }
        System.out.println(x); // Error: 'x' is not accessible here
    }
}
