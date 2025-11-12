import java.util.Scanner;

public class ValidateTriangle {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter length of side 1: ");
        int side1 = Integer.parseInt(sc.next());
        System.out.print("Enter length of side 2: ");           
        int side2 = Integer.parseInt(sc.next());
        System.out.print("Enter length of side 3: ");
        int side3 = Integer.parseInt(sc.next());    

        if((side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2)){
            System.out.println("The sides form a valid triangle.");
        }else{
            System.out.println("The sides do not form a valid triangle.");
        }
    }
    
}
