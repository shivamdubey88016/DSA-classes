import java.util.*;
public class GreatestAmongThree {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = Integer.parseInt(sc.next());
        System.out.print("Enter second number: ");
        int num2 = Integer.parseInt(sc.next());
        System.out.print("Enter third number: ");
        int num3 = Integer.parseInt(sc.next());
        if((num1>=num2)&&(num1>=num3)){
            System.out.println("The greatest number is: " + num1);
        }else if((num2>=num1)&&(num2>=num3)){
            System.out.println("The greatest number is: " + num2);
        }else{
            System.out.println("The greatest number is: " + num3);
        }


    }
    
}
