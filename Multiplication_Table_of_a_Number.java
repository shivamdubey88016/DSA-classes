public class Multiplication_Table_of_a_Number {
    public static void main(String []args){
        int number=15;
       int result =  table(number,1);
        
    }

    static int table(int n,int count){
        if(count>10){
            return 0;
        }
       System.out.println((n*count));
         
        return table(n,count+1);  
    }
    
}
