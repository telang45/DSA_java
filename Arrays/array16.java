import java.util.*;
public class array16 {
    public static int duplicate(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length; j++){
                if(i != j && arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int [] arr = {10,20,30,30,40,50};
        System.out.println("duplicate value is"+duplicate(arr));
    }
}
