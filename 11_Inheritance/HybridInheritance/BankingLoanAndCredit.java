interface Loan {
    void applyLoan(double amount);
}

interface CreditCard {
    void applyCreditCard();
}

class Account {
    String holderName;
    double balance;

    public Account(String holderName, double balance) {
        this.holderName = holderName;
        this.balance = balance;
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(String holderName, double balance) {
        super(holderName, balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", Balance: " + balance);
    }
}

class PremiumAccount extends SavingsAccount implements Loan, CreditCard {
    public PremiumAccount(String holderName, double balance) {
        super(holderName, balance);
    }

    public void applyLoan(double amount) {
        System.out.println("Loan of " + amount + " approved for " + holderName);
    }

    public void applyCreditCard() {
        System.out.println(holderName + " credit card issued.");
    }
}

public class BankingLoanAndCredit {
    public static void main(String[] args) {
        PremiumAccount acc = new PremiumAccount("David", 20000);
        acc.deposit(5000);
        acc.applyLoan(100000);
        acc.applyCreditCard();
    }
}
