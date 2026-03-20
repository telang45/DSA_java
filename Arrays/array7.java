import java.util.*;
public class array7 {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner (System.in);
        int[] arr = {50,60,70,80,90};
        System.out.println("enter element to be search");
        int search = sc.nextInt();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == search){
                count++;
            }
        }
        System.out.println("element found "+search+" in"+count+"times");
    }
}
