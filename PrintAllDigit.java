import java.util.*;

public class PrintAllDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = Integer.parseInt(sc.nextLine());
        int copy = number;
        int count = 0;
        while (number > 0) {

            number = number / 10;
            count++;

        }
        System.out.println("Total digits: " + count);
        //find divisor
        int divisor = 1;
        for (int i = 1; i <= count - 1; i++) {
            divisor = divisor * 10; 
            System.out.println("Divisor: " + divisor);
        }
        System.out.println("Divisor: " + divisor);
        while (divisor > 0) {
            int digit = copy / divisor;
            System.out.println(digit);
            copy = copy % divisor;
            divisor = divisor / 10;
        }
    }

}
