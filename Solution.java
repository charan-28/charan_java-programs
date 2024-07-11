import java.io.*;
import java.util.*;

class Square {
    void number(int n) {
        int temp = n;
        int sum = 0;
        while (n > 0) {
            sum += (n % 10);
            n = n / 10;
            System.out.println("sum inloop : " + sum);
        }
        System.out.println("sum : " + sum);
        int b = sum * sum;
        System.out.println(b);
        if (temp == b) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Square rc = new Square();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // System.out.println(rc.number(a));
        rc.number(a);

    }
}