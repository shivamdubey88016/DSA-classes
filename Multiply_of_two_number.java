public class Multiply_of_two_number {
    static int multiply(int n1,int n2){
        if(n1==0||n2==0){
            return 0;
        }
        int ans=(n1%10)*(n2%10);
   

    return  multiply(n1/10,n2/10)+ans;

    }
    public static void main(String []args){
        int n1=12;
        int n2=13;
        int result=multiply(n1,n2);
        System.out.println("Multiplication of "+n1+" and "+n2+" is: "+result);
    }
}
