// public class pattern9 {
//     public static void main(String[] args) {
//         int i, j, start;

//         for(i = 1; i <= 5; i++) {

//             start = i % 2;   // decide starting number

//             for(j = 1; j <= i; j++) {
//                 System.out.print(start + " ");
//                 start = 1 - start;   // flip value
//             }

//             System.out.println();
//         }
//     }
// }


public class pattern9{
    
    public static void main(String[] args){
        int i,j;
        for(i=1; i<=5; i++){
            for(j=1; j<=i; j++){
                int sum=i+j;
                if(sum%2==0){
                    System.out.print("1"+" " );
                }
                else{
                    System.out.print("0"+" " );
                }

             

           }   
             System.out.println();
            
        }
    }
}