public class pattern11 {
    public static void main(String[] args) {
        int i,j;
        for(i=1; i<=5; i++){
            //printing space
            for(j=1; j<=5-i; j++){
                System.out.print(" ");
            }
            //printing *
            for(j=1; j<=5; j++){
                System.out.print("*");
            }
            //printing space after *
            for(j=1; j<=i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
