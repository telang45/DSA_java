import java.util.*;
public class array9 {
    public static int[] display(int[] arr){
       int n = arr.length;
        
            Arrays.sort(arr);
            System.out.println("sortrd array");
            for(int i = 0; i < n; i++){
                System.out.println(arr[i]);
        }
        System.out.println();
        int[] arr2 = {arr[0],arr[n-1]};
        return arr2;
    }
    public static void main(String[] args) {
        int[] arr = {10,0,50,20,90};
        int[] newarr = display(arr);
        System.out.println("small array element is"+" "+newarr[0]);
        System.out.println("largest array element is"+" "+newarr[1]);
    }
}
