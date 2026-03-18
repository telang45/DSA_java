public class array5 {
    public static void main(String[] args) {

        int arr1[] = {10, 20, 30};

       

        
        int arr2[] = arr1;

        

        
        arr2[0] = 100;

        
        System.out.println("arr1 elements:");
        for(int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        
        System.out.println("arr2 elements:");
        for(int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
