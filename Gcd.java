import java.util.*;

public class Gcd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
       int c=a;
         int d=b;
        int rem = 0;
        if (a < b && a > 0 && b > 0) {
            rem = b % a;
            if (rem == 0) {
                System.out.println("GCD is: " + a);

            } else {

                b = a;
                a = rem;

            }
        } else {
            rem = a % b;
            if (rem == 0) {
                System.out.println("GCD is: " + b);
            } else {
                a = b;
                b = rem;

            }

        }
        System.out.println(rem);
        int lcm=(c*d)/rem;
        System.out.println("LCM is: "+lcm); 

    }

}
