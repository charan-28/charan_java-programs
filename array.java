// Here is a Java program that prints duplicates from a list of integers. If there are no duplicates, it will print "the list is empty."


import java.util.*;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    flag = true;
                }
            }
        }
        if (!flag) {
            System.out.println("the list is empty");
        }
    }
}

