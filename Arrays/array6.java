public class array6 {
public static void display(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
        public static void main(String[] args){
            int[] arr = {10,20,30,40};
            System.out.println("original array");
            display(arr);
            int[] shallow_clone = arr;
            shallow_clone[0] = 0;
            shallow_clone[1] = 0;
            System.out.println("after changing the value of shallow clone ");
            display(shallow_clone);

            System.out.println("after changing value of shallow clone original array");
            display(arr);

            int[] deep_clone = arr.clone();
            deep_clone[0] = 90;
            deep_clone[1] = 60;
            System.out.println("after changing value of deep clone");
            display(deep_clone);
            System.out.println("after changing value of deep clone original array");
            display(arr);

        }
}
