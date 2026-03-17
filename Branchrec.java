public class Branchrec {
    static void branch(int x){
        if(x<=0){
            System.out.println("Base case reached with x = "+x);
            return;
        }
        System.out.println("Current x: "+x);
        branch(x-1); 
        System.out.println("After first call with x = "+x);
        branch(x-2); 
        System.out.println("After second call with x = "+x);
        branch(x-3);
        System.out.println("After third call with x = "+x);
    }
    public static void main(String[] args) {
        int n = 3; 
        branch(n);
    }
    
}
