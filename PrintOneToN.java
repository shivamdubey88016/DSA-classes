public class PrintOneToN {
    public static void main(String[] args){
        int n=1321;
        String result = printOneToN(n);
        System.out.println(result);
    }
    
    static String printOneToN(int n){
        if(n==0){
            return "";
        }
        String cs="";
        switch(n%10){
            case 0:
                cs="Zero ";
                break;
            case 1:
                cs="One ";
                break;
            case 2:
                cs="Two ";
                break;
            case 3:
                cs="Three ";
                break;
            case 4:
                cs="Four ";
                break;
            case 5:
                cs="Five ";
                break;
            case 6:
                cs="Six ";
                break;
            case 7:
                cs="Seven ";
                break;
            case 8:
                cs="Eight ";
                break;
            case 9:
                cs="Nine ";
                break;
        }
       return printOneToN(n/10)+cs;

    }
}
