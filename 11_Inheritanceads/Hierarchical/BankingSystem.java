class Account {
    String accountHolder;
    double balance;

    public Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void showBalance() {
        System.out.println(accountHolder + "'s Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    double interestRate;

    public SavingsAccount(String accountHolder, double balance, double interestRate) {
        super(accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        balance += (balance * interestRate / 100);
        System.out.println("Interest added. New Balance: " + balance);
    }
}

class CurrentAccount extends Account {
    double overdraftLimit;

    public CurrentAccount(String accountHolder, double balance, double overdraftLimit) {
        super(accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawal Successful. Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient Funds!");
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("John", 10000, 5);
        sa.showBalance();
        sa.addInterest();

        System.out.println();

        CurrentAccount ca = new CurrentAccount("David", 5000, 2000);
        ca.showBalance();
        ca.withdraw(6500);
    }
}
