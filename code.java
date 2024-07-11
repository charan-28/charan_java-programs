import java.util.Scanner;
// public class code {
//     public static void main(String args[]){
//         int n=5;
       
//         for(int i=1;i<=n;i++) {
//             for(int j=1;j<=i;j++) {
//                 System.out.print(" ");
//             }
            
//             for(int j=i;j<=n;j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
        

//     }

// }
class code {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String string = in.nextLine();
        for(int i=1;i<=N;i++){
            System.out.println(string);
        }
    }
}