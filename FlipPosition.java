import java.util.*;

public class FlipPosition {
    public static void main(String[] args) {
        int num = 32145;
        int position = 54321;
        int flipNumber = 0;
        while (num > 0) {
            int digit = num % 10;
            int pos = position % 10;
            flipNumber = flipNumber + (pos * (int) Math.pow(10, digit - 1));
            num = num / 10;
            position = position / 10;
        }
        System.out.println(flipNumber);
    }

}
