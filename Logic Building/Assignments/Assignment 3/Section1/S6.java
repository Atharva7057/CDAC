/*
public class MisplacedForLoopBody {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++)
            System.out.println(i);
        System.out.println("Done");
    }
}
Error : we are printing Done only once because it is not included in loop block.
we have to add curly braces to add it in the scope
 */
//corrected
public class S6 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            System.out.println(i);
            System.out.println("Done");
        }

    }
}
