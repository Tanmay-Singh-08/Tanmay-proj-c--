import java.util.Scanner;

public class Bank {
    double bal, withdraw, add;
    char ch;
    
    // Declare Scanner at the class level so all methods can access it
    Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.println("Enter your balance:");
        bal = sc.nextDouble();
        
        System.out.println("Press 'w' to withdraw money and 'a' to deposit money:");
        ch = sc.next().charAt(0); // Reads a single character safely
    }

    public void calculate() {
        switch (ch) {
            case 'a': 
                System.out.println("Enter amount to be deposited:");
                add = sc.nextDouble();
                bal += add; // Add to balance
                System.out.println("Deposit successful! New balance: " + bal);
                break; // Prevents fall-through
                
            case 'w': 
                System.out.println("Enter amount to be withdrawn:");
                withdraw = sc.nextDouble();
                if (withdraw > bal) {
                    System.out.println("Error: Insufficient balance!");
                } else {
                    bal -= withdraw; // Subtract from balance
                    System.out.println("Withdrawal successful! New balance: " + bal);
                }
                break;
                
            default: 
                System.out.println("Invalid choice! Please restart and press 'a' or 'w'.");
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Bank myBank = new Bank();
        myBank.input();
        myBank.calculate();
    }
}