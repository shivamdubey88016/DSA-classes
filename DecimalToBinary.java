public class DecimalToBinary {
    static int convert(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 2 + 10 * convert(n / 2);
    }

    public static void main(String[] args) {
        int binary = convert(5);
        System.out.println(binary);
    }
}
