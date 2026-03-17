public class PrintStar2 {
    static void printst(int max,int cr,int cl){
        if(cr>max){
            return;
        }
        if(cl<=cr){
            System.out.print("* ");
            printst(max,cr,cl+1);
        }else{
            System.out.println();
            printst(max,cr+1,1);
        }
    }
    public static void main(String[] args) {
        int n=5;
        printst(n,1,1);
    }       
    
}
