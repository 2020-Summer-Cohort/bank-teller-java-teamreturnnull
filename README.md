# Bank Teller

## Objective

Design a banking application that handles standard interaction that a user would have with their bank.

*   Design a `Account` class that will handle instances of a bank account.
*   Design a `Bank` class that will house multiple accounts the user may have.
*   Design a `BankApplication` (with a `main` method) to build a user interface where your user can access their accounts and perform standard transactions.

### Tasks

The `Account` Class should have:

*   3 instance variables to handle `String accountNumber`, `String accountType`, and `double accountBalance` (Note the `accountNumber` will be a **unique identifier**)
*   Create a constructor that accepts input for your three instance variables
*   Create accessor methods for each instance variable in `Account`
*   Create a `deposit` method for adding funds
*   Create a `withdrawal` method for retrieving funds.
*   Create a `checkAccountBalance` method to show available funds

The `Bank` Class should have:

*   A `Map` called `accounts`
*   A `getAllAccounts()` method to return a `Collection<Account>` containing **all** accounts
*   An `openNewAccount()` to add an `Account` to `accounts`
*   A `getAccount(String accountNumber)` to get access a particular `Account`
*   A `closeAccount(String accountNumber)` to close a particular `Account`

Hint: This Class operates like a bank and keeps track of multiple bank accounts.

The `BankingApp` should have:

*   A `Bank` object
*   Two unique `Account` objects properly instantiated
*   Add your `Account`s to your `Bank` objects `Map`
*   Set up a UI to give the user the ability to interact with the application:
    *   Display `Account`s and their info.
    *   Display a menu to give your users choices to:
        *   Make a deposit to an `Account`
        *   Make a withdrawal from an `Account`
        *   Check the balance on an `Account`
        *   Close an `Account`
        *   Exit the application
    *   Accept input from the users choice and display the appropriate response
    *   Include a loop so the user can continue to manipulate accounts

**Stretch Task #1:** Include a security system that requires the user to enter a correct PIN (Personal Identification Number) before they can access the application. (Think about the most appropriate place to house this information)

**Stretch Task #2:** Refuse to close an account that still has remaining funds. Let the user know they can't remove an account that has funds remaining and prompt them to make another choice.

### Sample Output

```
Here are your accounts at our bank:
(1111) Checking 500.0
(2222) Savings 100.0

What would you like to do next?
Press 1 to deposit
Press 2 to withdrawal
Press 3 to check balance
Press 4 to close an account
Press 0 to exit

1
You want to deposit.

Here are your accounts

(1111) Checking 500.0
(2222) Savings 100.0

Type the account number to choose an account to deposit to.

1111
You have selected 1111
Enter the amount to deposit:

2000
You deposited 2000
Your updated balance on account 1111 is now 2500.0

What would you like to do next?
Press 1 to deposit
Press 2 to withdrawal
Press 3 to check balance
Press 4 to close an account
Press 0 to exit

4
You would like to close an account.

Here are your accounts
(1111) Checking 2500.0
(2222) Savings 100.0

Enter the account number of the account you would like to close:

2222
You are closing account # 2222
Here are your remaining accounts

(1111) Checking 2500.0

What would you like to do?
Press 1 to deposit
Press 2 to withdrawal
Press 3 to check balance
Press 4 to close an account
Press 0 to exit
...
...
...
```
