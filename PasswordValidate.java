import java.util.*;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        
        if (pass.length() < 8) {
            System.out.println("Invalid: Password must be at least 8 characters long");
            return;
        }

        boolean upper = false, digit = false;

        
        for (int i = 0; i < pass.length(); i++) {
            char ch = pass.charAt(i);
            if (Character.isUpperCase(ch))
                upper = true;
            if (Character.isDigit(ch))
                digit = true;
        }

        
        if (upper && digit)
            System.out.println("Password is valid ");
        else
            System.out.println("Invalid: must contain at least one uppercase letter and one digit ");
    }
}
