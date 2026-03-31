import java.util.*;
public class array10 {
    public static void triplet_sum(int[] arr , int target){
        int n = arr.length;
        for(int i = 0; i < n-2; i++){
            for(int j = i+1; j < n-1; j++){
                for(int k = j+1; k<n; k++){
                    if(arr[i] + arr[j] + arr[k] == target){
                        System.out.println("target addition indices are"+ " "+i+" ,"+j+"and"+" "+k);
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
         System.out.println("enter size of an array");
           int n = sc.nextInt();

        System.out.println("enter"+ " "+n+" "+"elements");
            int[] arr = new int[n];

         for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
         }
     
        System.out.println("Enter target sum");
           int target = sc.nextInt();
              triplet_sum(arr,target);
    }
}
