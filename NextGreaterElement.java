import java.util.Stack;

public class NextGreaterElement {
    public static void main(String args[]){
        int arr[] = {4,5,2,25};
        int n = arr.length;
        Stack<Integer> s = new Stack<>();
        int nge[] = new int[n];
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && s.peek() <= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nge[i] = -1;
            } else {
                nge[i] = s.pop();
            }
            s.push(arr[i]);
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " --> " + nge[i]);
        }   
    }
    
}
