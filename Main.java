// // import java.util.Scanner;
// // class Main {

// //     public static void main(String args[]) {
// //         Scanner in = new Scanner(System.in);
// //         String a=in.nextLine();
// //         int N = in.nextInt();
// //         for(int i=1;i<=N;i++)
// //         {
// //             System.out.println(a);
// //         }
// // }
// // }
// import java.util.*;
// import java.io.*;
// import java.math.*;
// class Main {

//     public static void main(String args[]) {
//         Scanner in = new Scanner(System.in);
//         int n = in.nextInt();
//         for (int i = 0; i < n; i++) {
//             int e = in.nextInt();
//             int f =(int)Math.floor(e*7.5+700);
//             System.out.println(f);
//         }   
//     }
// }
import java.util.Scanner;
public class Main{
public static void main(String[] args) {
    Scanner rc =new Scanner(System.in);
    int h = rc.nextInt();
    int w = rc.nextInt();
    for(int i=1;i<=h;i++){
        for(int j=1;j<=w;j++)
            System.out.print("o "); 
    System.out.println("");
    }
}
}
