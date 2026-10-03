public class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(int accountNumber, String ownerName, double interestingRate) {
        super(accountNumber, ownerName);
        this.interestRate = interestingRate;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && ( balance - amount ) >= 500 ){
            balance -= amount;
            System.out.println("Your withdrawal Successful");

        }else {
            System.out.println("Invalid amount or minimum balance of 500 required.");
        }
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0){
            balance += amount;
            System.out.println("Your deposit Successful");
        }
    }

    @Override
    public String getAccountType() {
        return "Saving";
    }

    public void addInteresting(){
        balance += balance * interestRate/100;
        System.out.println(balance);
    }
}
