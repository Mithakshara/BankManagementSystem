public abstract class BankAccount {

    private int accountNumber;
    private String ownerName;
    protected double balance;

    public BankAccount(int accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance = 0;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void withdraw(double amount);
    public abstract void deposit(double amount);
    public abstract String getAccountType();

    public void displayAccount(){
        System.out.println("Type    : " + getAccountType());
        System.out.println("Number  : " + accountNumber);
        System.out.println("Owner   : " + ownerName);
        System.out.println("Balance : " + balance);
    }


}
