
public class array17 {
    public static void display(int[] arr){
        int temp;
        int i = 0;
        int j = arr.length-1;
        while(i < j){
        temp = arr[i];
        arr[i] =  arr[j];
        arr[j] = temp;
        i++;
        j--;

      }   
      for(int k = 0; k < arr.length; k++){
        System.out.println(arr[k]);
      }
    }

    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        
        System.out.println("O.G array is");
        for(int k = 0; k < arr.length; k++){
            System.out.println(arr[k]);
        }
        System.out.println("reverse array is");
        display(arr);
    }
}
