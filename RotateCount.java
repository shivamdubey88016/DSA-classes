public class RotateCount {
  public static void main(String[] args) {
    int num = 12345;
    int rotateBy = 2;
    int divisor = (int) Math.pow(10, rotateBy);
    int rotationNum= num % divisor;//45
    int remainingNum = num / divisor;//123
    int digits = (int) Math.log10(num)+1;//count digit of original number
    int multiplier = (int) Math.pow(10, digits - rotateBy);//1000
    int rotatedNumber = rotationNum * multiplier + remainingNum;//45123
    System.out.println("Number after rotation: " + rotatedNumber);  // our output

  }  
}
