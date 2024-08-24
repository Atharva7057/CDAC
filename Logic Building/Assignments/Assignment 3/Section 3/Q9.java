public class Q9 {
    public static void main(String[] args) {
        int num = 48249;
        int largest = Integer.MIN_VALUE;
        while (num > 0){
            int ld = num%10;
            largest = Math.max(largest,ld);
            num = num/10;
        }
        System.out.println(largest);
    }
}
