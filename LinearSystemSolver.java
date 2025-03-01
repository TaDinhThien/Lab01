import java.util.Scanner;

public class LinearSystemSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter coefficient a11: ");
        double a11 = scanner.nextDouble();
        System.out.print("Enter coefficient a12: ");
        double a12 = scanner.nextDouble();
        System.out.print("Enter coefficient a21: ");
        double a21 = scanner.nextDouble();
        System.out.print("Enter coefficient a22: ");
        double a22 = scanner.nextDouble();
        System.out.print("Enter coefficient b1: ");
        double b1 = scanner.nextDouble();
        System.out.print("Enter coefficient b2: ");
        double b2 = scanner.nextDouble();
        
        double determinant = a11 * a22 - a12 * a21;
        
        if (determinant == 0) {
            if (a11 * b2 == a21 * b1 && a12 * b2 == a22 * b1) {
                System.out.println("The system has infinitely many solutions.");
            } else {
                System.out.println("The system has no solution.");
            }
        } else {
            double x1 = (b1 * a22 - b2 * a12) / determinant;
            double x2 = (a11 * b2 - a21 * b1) / determinant;
            System.out.println("The solutions are: x1 = " + x1 + " and x2 = " + x2);
        }
        
        scanner.close();
    }
}
