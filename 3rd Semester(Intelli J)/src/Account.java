public class Account {
    protected double balance;
    public void deposit(double amount){
        balance += amount;
    }

    public void withDraw(double amount){
        balance -= amount;
    }
}

class SavingAccount extends Account{
    private double defaultInterestRate = 2.5;
    private double interestRate;

    public void setDefaultInterestRate(double rate){
        defaultInterestRate = rate;
    }

    public void applyMonthlyRate(){
        
    }
}
