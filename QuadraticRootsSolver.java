import java.util.Scanner;
public class QuadraticRootsSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();
        scanner.close();
        // Calculate discriminant
        double d = (b * b) - (4 * a * c);

        // Using ternary operators exclusively for conditional logic and formatting
        String result = (a == 0) 
            ? "Coefficient 'a' cannot be zero (not a quadratic equation)." 
            : (d > 0) 
                ? "Roots are real and distinct:\nRoot 1 = " + ((-b + Math.sqrt(d)) / (2 * a)) + "\nRoot 2 = " + ((-b - Math.sqrt(d)) / (2 * a))
                : (d == 0) 
                    ? "Roots are real and equal:\nRoot 1 = Root 2 = " + (-b / (2 * a))
                    : "Roots are complex and imaginary:\nRoot 1 = " + (-b / (2 * a)) + " + " + (Math.sqrt(-d) / (2 * a)) + "i\nRoot 2 = " + (-b / (2 * a)) + " - " + (Math.sqrt(-d) / (2 * a)) + "i";

        System.out.println("\n" + result);
    }
}