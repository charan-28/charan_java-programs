import java.io.*;
import java.util.*;

public class addelement {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner rc = new Scanner(System.in);
        int n,loc,i;
        n=rc.nextInt();
        int arr[]=new int[n+1];
        for(i=0;i<arr.length;i++)
        {
            arr[i]=rc.nextInt();
        }
        loc=rc.nextInt();
        for(i=loc;i<n-1;i++)
        {
            arr[i]=arr[i+1];   
        }
        n--;
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}