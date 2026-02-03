// package pattern_program;

// public class pattern7 {
//     public static void main(String[] args) {
//         int i,j;
//         for(i=5; i>=1; i--){
//             for(j=1; j<=i; j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
    
// }



//another logic

package pattern_program;
public class pattern7{
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++){
            for(j=1; j<=6-i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}