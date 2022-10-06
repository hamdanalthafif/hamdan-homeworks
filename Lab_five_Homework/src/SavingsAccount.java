public class SavingsAccount extends  BankAccount {
    static  boolean isActive;
    public SavingsAccount(double balance , double apr)
    {
        super(balance,apr);

        isActive = super.getBalance()>= 25;

    }
  public  void withdraw(double amount)
  {
      if (super.getBalance() < 25){
          System.out.println("Your account  balance is too low , and your account  is  inactive :");
          isActive= false;
      }else {
          super.withdraw(amount);

      }
  }
         public  void  deposit (double amount){
             super.deposit (amount);
     if (super.getBalance() > 25){
         System.out.println("Your account is active :");
         isActive = true;
     }
}
public  void  monthlyProcess(){
        if (super.getNumber_withdrawals()>4){

           super. srrvicce_charges += 1;
        } if (super.getBalance()<25){
        System.out.println("The account is inactive, your  balance is less than $ 25.");
        isActive = false;

    }






}


}

