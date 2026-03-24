import java.util.*;
public class array11 {
    public static void findUnique(int[] arr){
        int n = arr.length;
        
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j < n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }

            }
            if(count == 1){
                System.out.println("Unique Element is"+arr[i]);
            }
        }
        
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter"+n+"element array");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        findUnique(arr);
    }
}
