public class CountNoOfDigit {
    static int countDigits(int number,int count) {
        if (number == 0) {
            return count;
        }
        return countDigits(number / 10, count + 1);
    }

    public static void main(String[] args) {
        int n = 12345;
        int digitCount = countDigits(n, 0);
        System.out.println("Number of digits in " + n + " is: " + digitCount);
    }
    
}
