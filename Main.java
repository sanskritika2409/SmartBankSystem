import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Customer c1 = new Customer("Sanskritika", "C101");
        Account acc1 = new SavingsAccount("A1001", c1, 10000);

        int choice;
        do {
            System.out.println("\n=== Smart Bank Menu ===");
            System.out.println("1. Display Account Info");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Calculate Interest");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    acc1.displayAccountInfo();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    acc1.deposit(dep);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double wit = sc.nextDouble();
                    acc1.withdraw(wit);
                    break;
                case 4:
                    acc1.calculateInterest();
                    break;
                case 5:
                    System.out.println("Thank you for using Smart Bank!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}
