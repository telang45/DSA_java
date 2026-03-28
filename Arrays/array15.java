public class array15 {

    // Function to swap two numbers in array
    public static void swap(int[] arr) {

        // swapping without temp
        arr[0] = arr[0] + arr[1];
        arr[1] = arr[0] - arr[1];
        arr[0] = arr[0] - arr[1];
    }

    public static void main(String[] args) {

        int[] arr = {10, 20};

        System.out.println("Before Swap:");
        System.out.println("arr[0] = " + arr[0]);
        System.out.println("arr[1] = " + arr[1]);

        // calling function
        swap(arr);

        System.out.println("After Swap:");
        System.out.println("arr[0] = " + arr[0]);
        System.out.println("arr[1] = " + arr[1]);
    }
}