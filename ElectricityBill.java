import java.util.*;
public class ElectricityBill{
    public static void main(String[] args) {
         
     Scanner sc = new Scanner(System.in);  

        System.out.print("Enter the number of units consumed: ");

        double units = Integer.parseInt(sc.nextLine());
        if (units < 0) {
            System.out.println("Units cannot be -ve");
            return;
        }
       else if(units <= 100) {
            double bill_amount = units * 1.5;
            System.out.println("Total Electricity Bill: " + bill_amount);
        } else if (units <= 200) {
            double bill_amount = (100 * 1.5) + ((units - 100) * 2.5);
            System.out.println("Total Electricity Bill: " + bill_amount);
        } else {
            double bill_amount = (100 * 1.5) + (100* 2.5) + ((units - 200)*3.5);
            System.out.println("Total Electricity Bill: " + bill_amount);
       }


    }

}