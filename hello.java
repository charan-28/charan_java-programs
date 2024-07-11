import java.util.Scanner;

public class hello {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfSquares = 0;
        int negativeCount = 0;
        int oddCount = 0;

        while (true) {
            int num = scanner.nextInt();

            // Check for conditions to terminate the loop
            if (num < 0) {
                negativeCount++;
                if (negativeCount == 3) {
                    break;
                }
            } else {
                sumOfSquares += num * num;
                if (num % 2 != 0) {
                    oddCount++;
                    if (oddCount > 2) {
                        break;
                    }
                }
            }
        }
        System.out.println(sumOfSquares);
    }
}