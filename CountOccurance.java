import java.util.Arrays;

public class CountOccurance {
    static int [] count1(int []arr,int count,int index,int element){
       //int result[]=new int[arr.length];
       if(index==arr.length){
        System.out.println("Element "+element+" occurs "+count+" times");   
        return new int[count];//making array size of count to put indexs in this array

       }
         if(arr[index]==element){
          count++;
         }
      int [] result= count1(arr,count,index+1,element);
      // during destroying the stack from top to bottom
      if(arr[index]==element){
        result[count-1]=index;
      }
      return result;
         
            
    }
    public static void main(String[] args) {
        int arr[]={1,2,1,3,4,1,5,1};
        int count=0;
        int element=1;
        int index=0;
        int result[]=count1(arr,count,index,element);
        System.out.println(Arrays.toString(result));
       }    
    }   
    

