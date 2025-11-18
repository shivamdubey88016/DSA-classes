public class ArmstrongRec {

    static void checkArmstrong(int num, int curr, int sum) {

        if (curr == 0) {
            if (sum == num) {
                System.out.println(num + " is an Armstrong number.");
            } else {
                System.out.println(num + " is not an Armstrong number.");
            }
            return;
        }

        int digit = curr % 10;
        checkArmstrong(num, curr / 10, sum + digit * digit * digit);
    }

    public static void main(String[] args) {
        int num = 1503;
        checkArmstrong(num, num, 0);
    }
}
