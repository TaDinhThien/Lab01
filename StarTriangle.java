import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int space = 0; space < n - i; space++) {
                System.out.print(" ");
            }
            // Print stars
            for (int star = 0; star < 2 * i - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
