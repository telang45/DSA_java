import java.util.*;

public class array4 {
    public static void main(String[] args) {
        int ans = -1;
        Scanner sc = new Scanner(System.in);
        int arr[] = {10,5,20,3,9,45,5};
        System.out.println("enter the element to be search");
        int target = sc.nextInt();
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                ans =i;
                System.out.println("element found at index"+" "+ans);
                break;
   
            } 
            }
           
            if(ans == -1){
                System.out.println("element not found");
            }
        }
    }

