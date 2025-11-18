public class PlanicromeByRecursion {
    static void planidrone(int original,int curr,int rev){
      
        if(curr==0){
            if(original==rev){
                System.out.println("Planidrome");
            }else{
                System.out.println("Not Planidrome");
            }
            return;
        }
         int re=rev*10 + curr%10 ;
        planidrone(original, curr/10, re);
    }
    public static void main(String[] args) {
        int n=1215;
        planidrone(n,n,0);
    }       
}
