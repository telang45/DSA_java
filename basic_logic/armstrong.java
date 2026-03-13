public class armstrong {
    public static void main(String[] args) {
        int num = 153;
        int temp = num;
        int sum = 0;

        while(num > 0){
            int digit = num % 10;
            sum = sum + digit * digit * digit;
            num = num / 10;
            
        }
        System.out.println(sum);
        if (temp == sum){
            System.out.println("armstrong number");
        }
        else{
            System.out.println("not an amstrong number");
        }
    }
    
}
