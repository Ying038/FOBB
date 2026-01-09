public class SavingsAccount extends Account{
    private double interestRate;
    private double minimumBalance;
    private boolean isActive;

    public SavingsAccount(String accNo, String accHolder, double balance, double interestRate){
        super(accNo, accHolder, balance);
        this.interestRate = interestRate;
        this.minimumBalance = 500;
        this.isActive = true;
    }

    @Override
    public void calculateInterest(){
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
        System.out.println("Interest of " + interest + " added to Savings Account.");
    }

    @Override
    public void withdraw(double amount){
        if(balance - amount < minimumBalance){
            System.out.println("Error: Cannot withdraw " + amount + ". Minimum balance of " + minimumBalance + " required.");
        }else{
            super.withdraw(amount);
        }
    }

    @Override
    public void displayAccountInfo(){
        super.displayAccountInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    
    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
}
