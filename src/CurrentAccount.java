public class CurrentAccount extends BankAccount{

    private double overdraftLimit;

    public CurrentAccount(int accountNumber, String ownerName) {
        super(accountNumber, ownerName);
    }

    @Override
    public void withdraw(double amount) {

    }

    @Override
    public void deposit(double amount) {
        if (amount <= balance - overdraftLimit){
            balance -= amount;
            System.out.println("Your withdrawal Successful");
        }
    }

    @Override
    public String getAccountType() {
        return "Current Account";
    }

}
