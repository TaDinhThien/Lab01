import java.util.Arrays;
import java.util.Scanner;

public class SortAndCompute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] myArray = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            myArray[i] = scanner.nextInt();
        }

        Arrays.sort(myArray);

        System.out.println("Sorted array: " + Arrays.toString(myArray));

        int sum = 0;
        for (int value : myArray) {
            sum += value;
        }
        double average = (double) sum / n;

        System.out.println("Sum of elements: " + sum);
        System.out.println("Average value: " + average);

        scanner.close();
    }
}
