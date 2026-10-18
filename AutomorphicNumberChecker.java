import java.util.Scanner;

public class AutomorphicNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is automorphic: ");
        int number = scanner.nextInt();

        if (isAutomorphic(number)) {
            System.out.println(number + " is an automorphic number.");
        } else {
            System.out.println(number + " is not an automorphic number.");
        }

        scanner.close();
    }

    // Function to check if a number is automorphic
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String numberStr = String.valueOf(number);
        String squareStr = String.valueOf(square);

        // Check if the last digits of square match the original number
        return squareStr.endsWith(numberStr);
    }
}
