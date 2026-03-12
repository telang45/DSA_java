public class palindrome {
    public static void main(String[] args) {
        int num = 1331;
        int temp = num;
        int rev = 0;

        while(num>0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        System.out.println(rev);

        if(temp == rev){
            System.out.print("number is palindrome");
        }
        else{
            System.out.print("number is not a palindrome");
        }
    }
    
}
