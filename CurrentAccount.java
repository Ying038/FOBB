public class CurrentAccount extends Account{
    private double overdraftLimit;
    private double transactionFee;
    private double accumulatedFees;

    public CurrentAccount(String accNo, String accHolder, double balance, double overdraftLimit){
        super(accNo, accHolder, balance);
        this.overdraftLimit = overdraftLimit;
        this.transactionFee = 2.0; 
        this.accumulatedFees = 0.0;
    }

    @Override
    public void withdraw(double amount){
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
            System.out.println(accHolder + " withdrew: " + amount + " (Overdraft used if negative)");
            if(balance < 0){
                accumulatedFees += transactionFee;
                balance -= transactionFee;
                System.out.println("Overdraft fee of " + transactionFee + " applied.");
            }            
        } else {
            System.out.println("Error: Exceeds overdraft limit of " + overdraftLimit);
        }
    }
    
    @Override
    public void calculateInterest(){
        System.out.println("Current Account for " + getAccHolder() + " does not earn interest.");
    }

    public void displayFees(){
        System.out.println("Total fees charged to " + accHolder + ": " + accumulatedFees);
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
    
    public double getTransactionFee() {
        return transactionFee;
    }

    public void setTransactionFee(double transactionFee) {
        this.transactionFee = transactionFee;
    }

    public double getAccumulatedFees() {
        return accumulatedFees;
    }
    
    public void setAccumulatedFees(double accumulatedFees) {
        this.accumulatedFees = accumulatedFees;
    }
}
