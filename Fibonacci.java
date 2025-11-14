public class Fibonacci {
    public static void main(String[] args){
        int n = 10; 
        int first = 0, second = 1;
        
        System.out.print("Fibonacci Series up to " + n + " terms: ");
        
        for(int i = 1; i <= n; i++){
           
            int third = first + second;
             System.out.print(first + " ");
            first = second;
            second = third;
        }
    }   
    
}
