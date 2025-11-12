import java.util.Scanner;

public class LeafYear {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = Integer.parseInt(sc.next());
        boolean isLeafYear;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeafYear = true;
        } else {
            isLeafYear = false;
        }

        if (isLeafYear) {
            System.out.println(year + " is a leaf year.");
        } else {
            System.out.println(year + " is not a leaf year.");
        }       
    }
    
}
