import java.util.*;
public class sort {
    public static void main()
    {
        Scanner rc =new Scanner(System.in);
        int n=rc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=rc.nextInt();
        }
        for(int i=0;i<=arr.length;i++)
        {
            for(int j=i+1;j=arr.length;j++)
            {
                int temp;
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<=arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
