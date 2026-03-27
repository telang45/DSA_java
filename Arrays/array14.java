public class array14 {
    public static void swap(int a,int b){
        int temp;
        System.out.println("original elements are");
        System.out.println("a="+a);
        System.out.println("b="+b);
        temp = a;
         a = b;
         b = temp;
        System.out.println("after swapping");
        System.out.println("a="+a);
        System.out.println("b="+b);

    
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
         int a = 5;
        int b= 10;
        swap(a,b);
    }

}
