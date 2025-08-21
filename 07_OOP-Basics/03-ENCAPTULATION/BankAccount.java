class BankAccount {
    private double balance;
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
}
public class Main4 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setBalance(10000);
        System.out.println(acc.getBalance());
    }
}
