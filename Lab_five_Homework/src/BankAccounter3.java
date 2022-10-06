


public class BankAccounter3 {
    private double balance;

    {
        balance=0 ;
    }
    public BankAccounter3(double intiBalance)
    { balance=intiBalance;
    }
    public void deposit(double amount) {balance=balance+=amount;
    }
    public void  withraw(double amount){balance=balance-=amount;
    }
    public double getBalance() { return balance;}


}

