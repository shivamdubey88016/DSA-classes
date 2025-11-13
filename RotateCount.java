public class RotateCount {
  public static void main(String[] args) {
    int num = 12345;
    int rotateBy = 2;
    int divisor = (int) Math.pow(10, rotateBy);
    int rotationNum= num % divisor;//45
    int remainingNum = num / divisor;//123
    int digitsCount = (int) Math.log10(num)+1;//count digit of original number
     rotateBy=rotateBy % digitsCount;//to handle if rotateBy > digitsCount
   if(rotateBy<0){
     rotateBy=rotateBy + digitsCount;
   }
    int newNum = rotationNum * (int) Math.pow(10, rotateBy) + remainingNum;
    System.out.println("Number after rotation: " + newNum);     
  }  
}
