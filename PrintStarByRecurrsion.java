public class PrintStarByRecurrsion {
    static String PrintStar(int n){
        if(n==0){
            return "";
        }
        return  PrintStar(n-1)+"* " ;
    }
static void print(int n){
    if(n==0){
        return;
    }
    print(n-1);
    System.out.println(PrintStar(n));
    
}
    public static void main(String[] args) {
        
       
        print(5);
    }
    
}
