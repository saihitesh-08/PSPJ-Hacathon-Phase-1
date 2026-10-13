import java.util.Scanner;
public class PersonalBankingLedger {
String name;
long accountNumber;
double balance;
double totalDeposits = 0.0;
double totalWithdrawals = 0.0;

PersonalBankingLedger(String name, long accountNumber, double balance) {
this.name = name.toUpperCase();
this.accountNumber = accountNumber;
this.balance = balance;
}

void deposit(double amount) {
balance = balance + amount;
totalDeposits = totalDeposits + amount;

System.out.println("Deposit Amount : Rs. " + amount);
System.out.println("Transaction Status : Deposit Successful");
System.out.println("Updated Balance : Rs. " + balance);
}

void deposit(double amount, String description) {
balance = balance + amount;
totalDeposits = totalDeposits + amount;

System.out.println("Deposit Amount : Rs. " + amount);
System.out.println("Description : " + description);
System.out.println("Transaction Status : Deposit Successful");
System.out.println("Updated Balance : Rs. " + balance);
}

void withdraw(double amount) {
System.out.println("Withdrawal Amount : Rs. " + amount);

if (amount <= balance) {
balance = balance - amount;
totalWithdrawals = totalWithdrawals + amount;

System.out.println("Transaction Status : Withdrawal Successful");
System.out.println("Updated Balance : Rs. " + balance);
} else {
System.out.println("Transaction Status : Insufficient Balance");
System.out.println("Available Balance : Rs. " + balance);
}
}

void withdraw(double amount, String description) {
System.out.println("Withdrawal Amount : Rs. " + amount);

if (amount <= balance) {
balance = balance - amount;
totalWithdrawals = totalWithdrawals + amount;

System.out.println("Description : " + description);
System.out.println("Transaction Status : Withdrawal Successful");
System.out.println("Updated Balance : Rs. " + balance);
} else {
System.out.println("Transaction Status : Insufficient Balance");
System.out.println("Available Balance : Rs. " + balance);
}
}

boolean verifyName(String enteredName) {
return name.equalsIgnoreCase(enteredName.trim());
}

void displaySummary() {
System.out.println("----------- ACCOUNT SUMMARY -----------");
System.out.println("Account Holder : " + name);
System.out.println("Account Number : " + accountNumber);
System.out.println("Total Deposits : Rs. " + totalDeposits);
System.out.println("Total Withdrawals : Rs. " + totalWithdrawals);
System.out.println("Final Balance : Rs. " + balance);
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("=========== PERSONAL BANKING LEDGER ===========");

System.out.print("Enter Account Holder Name : ");
String name = sc.nextLine();

System.out.print("Enter Account Number : ");
long accountNumber = sc.nextLong();

System.out.print("Enter Initial Balance : ");
double initialBalance = sc.nextDouble();

PersonalBankingLedger account =
new PersonalBankingLedger(name, accountNumber, initialBalance);

System.out.println();
System.out.println("Account Holder Name : " + account.name);
System.out.println("Account Number : " + account.accountNumber);
System.out.println("Initial Balance : Rs. " + account.balance);

System.out.println();
System.out.println("----------- TRANSACTION DETAILS -----------");

System.out.print("Enter Deposit Amount : ");
double depositAmount = sc.nextDouble();

account.deposit(depositAmount);

System.out.println();

System.out.print("Enter Withdrawal Amount : ");
double withdrawalAmount = sc.nextDouble();

account.withdraw(withdrawalAmount);

System.out.println();

System.out.print("Enter Another Withdrawal Amount : ");
double largeWithdrawal = sc.nextDouble();

account.withdraw(largeWithdrawal);

sc.nextLine();

System.out.println();
System.out.print("Enter name for verification : ");
String verifyName = sc.nextLine();

System.out.println();
account.displaySummary();
System.out.println();

if (account.verifyName(verifyName)) {
System.out.println("Account Holder Verification: Names Match");
} else {
System.out.println("Account Holder Verification: Names Do Not Match");
}

System.out.println("================================================");
sc.close();
}
}