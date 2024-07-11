import java.util.*;
public class table {
    public static void main(String[] args) {
        Scanner rc=new Scanner(System.in);
        int n=rc.nextInt();
        for(int i=1;i<=10;i++){
            int ans=n*i;
            
            System.out.println(n + "*"+i+ "="+ans);
        }System.out.println(n +"  Table is Displayed");
    }
}
