public  abstract   class BankAccount {

    private  double balance;
    private double number_deposit;
    private double number_withdrawals;
    private double interest_rate;
    protected  double srrvicce_charges;
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getNumber_deposit(){
        return number_deposit;
    }

    public double getNumber_withdrawals() {
        return number_withdrawals;

    }
    public double getInterest_rate(){
        return  interest_rate;
    }

    public BankAccount(double balance , double apr){
        this.balance = balance;
        this.interest_rate=apr;
    }
    private  void depoist(double amount){
        this.balance += amount;
        this.number_deposit++;
    }
    void withdraw(double amount){
        this.balance -= amount;
        this.number_withdrawals++;
    }

    public  void  calcInterest(){
        double monthlyInterest = (interest_rate /12 );
     monthlyInterest = balance * monthlyInterest;
     this.balance += monthlyInterest;
    }
    public  void monthlyprocess(){
        this.balance -= srrvicce_charges;
        calcInterest();

        this.number_deposit = 0;
        this .number_withdrawals = 0;
        this.srrvicce_charges = 0;
    }


    protected void deposit(double amount) {
    }
}
