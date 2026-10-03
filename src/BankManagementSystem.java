import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BankManagementSystem {
    static Scanner scanner  = new Scanner(System.in);

    public static BankAccount findAccount(ArrayList<BankAccount> accounts,int accNUmber){

        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNumber()== accNUmber){
                return accounts.get(i);
            }
        }


        return null;
    }



    public static void main(String[] args) {

        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount(1001, "Dilshan", 5));
        CurrentAccount c = new CurrentAccount(2001, "Kamal");
        SavingsAccount s = new SavingsAccount(1001, "Dilshan", 5);
        accounts.add(c);
        accounts.add(s);

        try {
            while (true){
                System.out.println("""
                    ===== Bank Menu =====
                    1. Create Account
                    2. Display All Accounts
                    3. Search Account
                    4. Deposit
                    5. Withdraw
                    6. Add Interest (Savings only)
                    7. Total Bank Balance
                    8. Exit
                    """);
                System.out.print("What your option : ");
                int input = scanner.nextInt();
                switch (input){
                    case 1:
                        System.out.println(1);
                        break;
                    case 2:
                        System.out.println(2);
                        break;
                    case 3:
                        System.out.print("Enter the bank account : ");
                        int searchAccount = scanner.nextInt();

                        BankAccount Details = findAccount(accounts,searchAccount);
                        if (Details != null){
                            Details.displayAccount();

                        }else {
                            System.out.println("No account");
                        }

                        break;
                    case 4:
                        System.out.println(4);
                        break;
                    case 5:
                        System.out.println(5);
                        break;
                    case 6:
                        System.out.println(6);
                        break;
                    case 7:
                        System.out.println(7);
                        break;
                    case 8:
                        System.out.println("Exiting from programme");
                        return;
                }

            }
        } catch (InputMismatchException e){
            System.out.println("Input not valid");
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }scanner.close();
    }

}
