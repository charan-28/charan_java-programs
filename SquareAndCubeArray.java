import java.util.Scanner;

public class SquareAndCubeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int n = scanner.nextInt();
            int[] arr = new int[n * 3];

             
            for (int i = 0; i < n; i++) {
                int number = scanner.nextInt();
                arr[i * 3] = number;               
                arr[i * 3 + 1] = number * number;   
                arr[i * 3 + 2] = number * number * number;  
            }
            for (int i = 0; i < n; i++) {
                System.out.printf("%5d-%6d-%6d%n", arr[i * 3], arr[i * 3 + 1], arr[i * 3 + 2]);
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid integers.");
        } finally {
            scanner.close();
        }
    }
}