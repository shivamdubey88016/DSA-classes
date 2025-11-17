public class SumByReccursion {
    public static void main(String[] args) {
        int n = 543; 
        int result = sum(n);
        System.out.println("Sum of digits of " + n + " is: " + result);
    }

    public static int sum(int n) {
        
        if (n == 0) {
            return 0;
        }

       
        return (n % 10) + sum(n / 10);
    }
}
