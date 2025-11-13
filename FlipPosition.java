

public class FlipPosition {
    public static void main(String[] args) {
        int num = 32145;
        int position =0;
        int flipNumber = 0;
        while (num > 0) {
            int pos = num % 10;
            position++;
            flipNumber = flipNumber + (position* (int) Math.pow(10, pos - 1));
            num = num / 10;
            
        }
        
        System.out.println(" number after flipping positions:  " + flipNumber);
    }

}
