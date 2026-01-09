public class Account{
    protected String accNo;
    protected String accHolder;
    protected double balance;

    public Account(String accNo, String accHolder, double balance){
        this.accNo = accNo;
        this.accHolder = accHolder;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println(accHolder + " deposited: " + amount);
            System.out.println("New balance: " + balance);
        }else{
            System.out.println("Invalid deposit amount.");   
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && balance >= amount ){
            balance -= amount;
            System.out.println(accHolder + " withdrew: $" + amount);
            System.out.println("New balance: " + balance);
        }else{
            System.out.println("Transaction failed: Insufficient funds or invalid amount.");
        }
    }

    public void calculateInterest(){
        System.out.println("Base Account does not have interest calculation.");
    }

    public void displayAccountInfo(){
        System.out.println("Account Number: " + accNo);
        System.out.println("Account Holder: " + accHolder);
        System.out.println("Balance: " + balance);
    }

    public String getAccNo() {
        return accNo;
    }
    public String getAccHolder() {
        return accHolder;
    }
    public double getBalance() {
        return balance;
    }

    public void setAccHolder(String accHolder) {
        this.accHolder = accHolder;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

}