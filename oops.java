// class Addition {
//     public void playMusic() {
//         System.out.println("Play Music");
//     }

//     public static int getAns(int x, int y) {
//         if (x > y) {
//             System.out.println(x + y);
//         } else {
//             System.out.println(x + y * 5);
//         }
//     }
// }

// public class oops {
//     public static void main(String[] args) {
//         Addition add = new Addition();
//         int a = 2;
//         int b = 9;
//         int c = add.getAns(a, b);
//         System.out.println(c);
//         add.playMusic();
//     }
// }
import java.util.*;

public class oops{
    static int addition(int x, int y){
        int z;
        if(x>y){
        z=(x+y)*5;
        }
        else{
        z=x-y;
        }
        return z;
    }int n=cr.nextInt();
    static int oddEven(){
        
         for(int i=0;i<n;i++){
             if(n%2==0)
             return "even";
             else
             return "odd";
        }
        return "Not a number";
    }
    public static void main(String[] args) {
       // Scanner rc=new Scanner(System.in);
        oops cr=new oops();
        int a=3;
        int b=1;
        int c,u;
        
        c=addition(a, b);
        u=cr.oddEven(n);
        System.out.println(c);
        System.out.println(u);
    }
}
    