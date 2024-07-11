// import java.util.*;
// public class area {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter the value of n: ");
//         int n = sc.nextInt();
//         int nthTerm = fibonacci(n);
//         System.out.println("The " + n + "th term in the Fibonacci series is: " + nthTerm);
//     }

//     public static int fibonacci(int n) {
//         if (n <= 1) {
//             return n;
//         } else {
//             return fibonacci(n - 1) + fibonacci(n - 2);
//         }
//     }
// }
public class RemoveAsterisks {
    public static void main(String[] args) {
        String input = "meet**ca*e";
        String output = removeAsterisks(input);
        System.out.println(output);
    }

    private static String removeAsterisks(String input) {
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (ch != '*') {
                result.append(ch);
            }
        }

        return result.toString();
    }
}