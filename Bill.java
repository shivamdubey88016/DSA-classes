import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dosa_price_per_unit = 20;
        int idli_price_per_unit = 10;
        int cold_drink_price_per_unit = 15;

        System.out.print("Enter the quantity of dosa: ");
        int dosa_quantity = Integer.parseInt(sc.nextLine());

        System.out.print("Enter the quantity of idli: ");
        int idli_quantity = Integer.parseInt(sc.nextLine());

        System.out.print("Enter the quantity of cold drink: ");
        int cold_drink_quantity =Integer.parseInt(sc.nextLine());
//validate for negative quantity
        if (dosa_quantity < 0 || idli_quantity < 0 || cold_drink_quantity < 0) {
            System.out.println("Quantity cannot be -ve");
            return;
        }
 System.out.println("total price of dosa: " + dosa_price_per_unit * dosa_quantity);
  System.out.println("------------------------");
        System.out.println("total price of idli: "+ idli_price_per_unit * idli_quantity);
         System.out.println("------------------------");
        System.out.println("total price of cold drink: " + cold_drink_price_per_unit * cold_drink_quantity);
         System.out.println("------------------------");
        int dosa_price = dosa_price_per_unit * dosa_quantity;
        int idli_price = idli_price_per_unit * idli_quantity;
        int cold_drink_price = cold_drink_price_per_unit * cold_drink_quantity;
        int total_price = dosa_price + idli_price + cold_drink_price;

        System.out.println("\n----- BILL SUMMARY -----");
        System.out.println("Dosa Price: " + dosa_price);
        System.out.println("Idli Price: " + idli_price);
        System.out.println("Cold Drink Price: " + cold_drink_price);
        System.out.println("------------------------");
        System.out.println("Total Bill: " + total_price);
    }
}
