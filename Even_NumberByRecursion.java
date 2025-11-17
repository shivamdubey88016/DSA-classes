public class Even_NumberByRecursion {

    static int evenN(int n) {

        if (n == 0) {
            return 0;
        }

        if (n % 2 == 0) {
            System.out.println(n);
        }

        return evenN(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        evenN(n);
    }
}
