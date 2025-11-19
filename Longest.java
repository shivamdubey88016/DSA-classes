public class Longest {
    public static void main(String [] args){
        int arr[]={1,1,2,2,2,3,3,4,4,4,4,5,5,5,5,5};
        int count =1;
        //int prev=0;//do without previous variable also
        int maxCount=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                count++;
                maxCount=Math.max(maxCount,count);

            }else{
               
               count=1;
    }}
    //maxCount=Math.max(maxCount,Math.max(count,prev));
    System.out.println("Longest consecutive sequence length is: " + maxCount);

    

    }}