import java.util.*;
public class array12 {
    public static int largest(int[] arr){
        int min = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > min){
                min = arr[i];
        
            }
        }
        return min;
    }

    public static int Slargest(int[] arr){
        int max = largest(arr);
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == max){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int seclargest = largest(arr);
        return seclargest;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,15,45,60};
        System.out.println("the second largest number is"+Slargest(arr));
    }
}
