package teller;

public class Account {

////    The Account Class should have:
//
//            3 instance variables to handle String accountNumber, String accountType, and double accountBalance (Note the accountNumber will be a unique identifier)
//    Create a constructor that accepts input for your three instance variables
//    Create accessor methods for each instance variable in Account
//    Create a deposit method for adding funds
//    Create a withdrawal method for retrieving funds.
//    Create a checkAccountBalance method to show available funds

//    Fields

    private String accountNumber;
    private String accountType;
    private Double accountBalance;

//    Constructors

    public Account(String accountNumber, String accountType, Double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }


//    Methods


    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public Double checkAccountBalance() {
        return accountBalance;
    }

    public void deposit(Double amount) {
        accountBalance = accountBalance + amount;
    }

    public void withdrawAmount(Double amount) {
        accountBalance = accountBalance - amount;
    }


}
