import java.util.*;
public class Palindrome {

    
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int originalNumber = number;
        int result = 0;
        while(number>0){
            int digit=number%10;
            result=result*10+digit;
            number=number/10;
        }
        if(result==originalNumber){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
