package penta.assignments;
import java.util.Scanner;

class Account {
  String accountNumber;
  String accountHolderName;
  double balance;

 public Account(String accountNumber, String accountHolderName) {
     this.accountNumber = accountNumber;
     this.accountHolderName = accountHolderName;
     this.balance = 0.0; 
 }

 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposit successful. Current balance: " + balance);
 }

 public void withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawal successful. Current balance: " + balance);
     } else {
         System.out.println("Insufficient balance. Withdrawal failed.");
     }
 }

 public double checkBalance() {
     return balance;
 }
}

public class Banking {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     Account currentAccount = null;
     boolean exit = false;

     while (!exit) {
         System.out.println("Enter your choice:");
         System.out.println("1. Create an account");
         System.out.println("2. Deposit");
         System.out.println("3. Withdraw");
         System.out.println("4. Check balance");
         System.out.println("5. Exit");

         int choice = scanner.nextInt();

         switch (choice) {
             case 1:
                 System.out.print("Enter account number: ");
                 String accountNumber = scanner.next();
                 System.out.print("Enter account holder name: ");
                 String accountHolderName = scanner.next();
                 currentAccount = new Account(accountNumber, accountHolderName);
                 System.out.println("Account created successfully.");
                 break;
             case 2:
                 if (currentAccount == null) {
                     System.out.println("Please create an account first.");
                 } else {
                     System.out.print("Enter deposit amount: ");
                     double depositAmount = scanner.nextDouble();
                     currentAccount.deposit(depositAmount);
                 }
                 break;
             case 3:
                 if (currentAccount == null) {
                     System.out.println("Please create an account first.");
                 } else {
                     System.out.print("Enter withdrawal amount: ");
                     double withdrawAmount = scanner.nextDouble();
                     currentAccount.withdraw(withdrawAmount);
                 }
                 break;
             case 4:
                 if (currentAccount == null) {
                     System.out.println("Please create an account first.");
                 } else {
                     double balance = currentAccount.checkBalance();
                     System.out.println("Current balance: " + balance);
                 }
                 break;
             case 5:
                 exit = true;
                 System.out.println("Exiting Thank you!");
                 break;
             default:
                 System.out.println("Invalid choice");
         }
     }

     scanner.close();
 }
}




