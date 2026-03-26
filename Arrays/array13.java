import java.util.*;
public class array13 {
    public static int repeatelement(int[] arr){
        
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
                
            }
            
        }
         return -1;
    }
    public static void main(String[] args){
            int[] arr = {10,30,9,10,5,30};
            System.out.println("first repeated element is"+ repeatelement(arr));
           
        }
}
