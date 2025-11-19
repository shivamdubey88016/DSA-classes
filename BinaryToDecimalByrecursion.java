public class BinaryToDecimalByrecursion {

    public static void main(String []args){
        int binaryNumber=101; 
        int decimalNumber=binaryToDecimal(binaryNumber,0);
        System.out.println("Decimal of binary "+binaryNumber+" is: "+decimalNumber);
    }
    static int binaryToDecimal(int n,int power){
        if(n==0){
            return 0;
        }
        int lastDigit=n%10;
        int result=lastDigit * (int)Math.pow(2,power) ;
        return result+binaryToDecimal(n/10,power+1);
    }   
    
}
