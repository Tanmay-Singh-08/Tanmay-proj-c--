import java.util.Scanner;

class Bill {
    String name;
    int call;
    double amt;
    int billno;
    int fmr;

    // Default constructor
    

    // Parameterized constructor
    Bill(int billno, String name, int call) {
        
        billno = billno;
        name = name;
        call = call;
    }

    // Method to calculate the monthly bill
    void calculate() {
        if (call <= 100) {
            amt = call * 0.60;
        } else if (call <= 200) {
            amt = 100 * 0.60 + (call - 100) * 0.80;
        } else if (call <= 300) {
            amt = 100 * 0.60 + 100 * 0.80 + (call - 200) * 1.20;
        } else {
            amt = 100 * 0.60 + 100 * 0.80 + 100 * 1.20 + (call - 300) * 1.50;
        }
        amt += fmr; // Adding the fixed monthly rental to the bill amount
    }

    // Method to display the bill details
    void display() {
        System.out.println("Bill Number: " + billno);
        System.out.println("Consumer Name: " + name);
        System.out.println("Total Calls: " + call);
        System.out.println("Bill Amount: Rs. " + amt);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Bill Number:");
        int billno = scanner.nextInt();

        System.out.println("Enter Consumer Name:");
        String name = scanner.next();

        System.out.println("Enter Number of Calls:");
        int call = scanner.nextInt();

        Bill consumerBill = new Bill(billno, name, call);
        consumerBill.calculate();
        consumerBill.display();

        scanner.close();
    }
}
     
     
    


