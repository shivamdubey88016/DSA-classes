public class Factorial_of_a_NumberByRecursion {
    public static void main(String []args){
        int number=0;
        int result=factorial(number);
        System.out.println("Factorial of "+number+" is: "+result);
    }
    static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        int result=factorial(n-1);
        return n*result;
    }
    
}
