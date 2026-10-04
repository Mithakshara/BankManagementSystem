# Bank Management System (Java)

A console-based banking application built in Java as a practice project for
learning Object-Oriented Programming. Users can create Savings and Current
accounts, deposit and withdraw money, add interest, and view the total balance
of the bank through a text menu.

## Features

- Create a Savings or Current account (account numbers are generated automatically)
- Display all accounts
- Search for an account by account number
- Deposit money
- Withdraw money (each account type has its own rules)
- Add interest to Savings accounts
- View the total balance of all accounts
- Input validation for menu choices and amounts

## Account Rules

| Account Type | Withdraw Rule |
|---|---|
| Savings | Balance must stay at **500 or more** after withdrawing. Earns interest (default 5%). |
| Current | Balance may go negative up to an **overdraft limit of 1000**. |

For both types, deposit and withdraw amounts must be greater than 0.

## OOP Concepts Used

| Concept | Where it is used |
|---|---|
| **Abstraction** | `BankAccount` is an abstract class with abstract methods `withdraw()` and `getAccountType()` |
| **Inheritance** | `SavingsAccount` and `CurrentAccount` extend `BankAccount` and use `super(...)` |
| **Polymorphism** | `withdraw()` behaves differently for each account type, called through a `BankAccount` reference |
| **Encapsulation** | `private` fields, getters, and no way to change the balance except through `deposit` and `withdraw` |
| **Collections** | `ArrayList<BankAccount>` holding both account types |
| **instanceof / casting** | Used so that interest can only be added to Savings accounts |

## Class Structure

```
            BankAccount (abstract)
            /                    \
   SavingsAccount          CurrentAccount
```

## Project Structure

```
bank-management-system-java/
├── BankAccount.java            # Abstract parent class
├── SavingsAccount.java         # Minimum balance + interest
├── CurrentAccount.java         # Overdraft limit
├── BankManagementSystem.java   # Main class with menu and helper methods
└── README.md
```

## How to Run

1. Install Java (JDK 17 or later).
2. Compile all files:
   ```
   javac *.java
   ```
3. Run the program:
   ```
   java BankManagementSystem
   ```

You can also open the project in IntelliJ IDEA and run `BankManagementSystem`.

## Menu

```
===== Bank Menu =====
1. Create Account
2. Display All Accounts
3. Search Account
4. Deposit
5. Withdraw
6. Add Interest (Savings only)
7. Total Bank Balance
8. Exit
```

## Sample Output

```
Type    : Savings Account
Number  : 1001
Owner   : Dilshan
Balance : 2000.0
```

## What I Learned

- Designing a class hierarchy with an abstract parent and child classes
- Using polymorphism to treat different account types in one list
- Validating user input and handling bad input without crashing
- Searching a list of objects and handling `null` results safely

## Future Improvements

- Transfer money between accounts
- Transaction history for each account
- Save and load accounts from a file
- Rebuild as a Spring Boot REST API with a database

## Author
Mithakshara
