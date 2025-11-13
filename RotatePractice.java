import java.util.*;
public class RotatePractice {
    public static void main(String []args){
        int number = 123456;
        int rotate = 7;
        int count = 0;

        int temp = number;
        while(temp > 0){
            temp = temp / 10;
            count++;
        }

        rotate = rotate % count;  

        if(rotate == 0){
            System.out.println(number);
            return;
        }

        int rem = count - rotate;

        
        int newNumber = number % (int)Math.pow(10, rotate);
        int firstPart = number / (int)Math.pow(10, rotate);

        int result = newNumber * (int)Math.pow(10, rem) + firstPart;

        System.out.println(result);
    }
}
