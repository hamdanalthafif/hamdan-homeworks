public class Add_Bank {
    private double balance;

    {
        balance=0 ;
    }
    public Add_Bank(double intiBalance)
    { balance=intiBalance;
    }
    public void deposit(double amount) {balance=balance+=amount;
    }
    public void  withraw(double amount){balance=balance-=amount;
    }
    public double getBalance() { return balance;}
    public void addlnteresr(double Rate)
    {
      balance += (balance/Rate);
    }




}
