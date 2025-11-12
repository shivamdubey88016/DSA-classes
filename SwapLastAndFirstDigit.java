public class SwapLastAndFirstDigit {
    public static void main(String[]args){
         int number=12345;
         int firstDigit=number;
         int lastDigit=number%10;
         int count=0;
         while(firstDigit>=10){
            firstDigit=firstDigit/10;
            count++;
         }
         int divisor=(int)Math.pow(10,count);
         int middlePart=(number%divisor)/10;
         int swappedNumber=lastDigit*divisor + middlePart*10 + firstDigit;
         System.out.println("Number after swapping first and last digit: " + swappedNumber);
    }
}   //find first digit
//last digit
//count
//divisor
//middle part
//swapped number