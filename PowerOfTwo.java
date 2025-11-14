public class PowerOfTwo {
    public static void main(String[] args) {
       
        int number = 14;
         if(number<=0){
            System.out.println("Not a power of two");
            return;
        }               
      
        while (number > 1) {
            if (number % 2 == 0) {
                number = number / 2;//
            } else {
                System.out.println("Not a power of two");
                return;
            }
           

        }
        
       
    }

}
