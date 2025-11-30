import java.util.Scanner;

class BankAccount {
    private String depositorName;
    private int accountNumber;
    private String accountType;
    private double balance;

    BankAccount(String name, int accNo, String type, double initialBalance) {
        depositorName = name;
        accountNumber = accNo;
        accountType = type;
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void display() {
        System.out.println("Depositor Name: " + depositorName);
        System.out.println("Balance: " + balance);
    }
}

public class BankAccountTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter depositor name: ");
        String name = sc.nextLine();

        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account type: ");
        String type = sc.nextLine();

        System.out.print("Enter initial balance: ");
        double initialBalance = sc.nextDouble();

        BankAccount account = new BankAccount(name, accNo, type, initialBalance);

        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        account.display();
    }
}
