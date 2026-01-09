public class BankingSystem {
    public static void main(String[] args) {
        // Create a Savings Account
        SavingsAccount savingsAcc = new SavingsAccount("SA123", "Alice", 1000.0, 5.0);
        savingsAcc.displayAccountInfo();
        savingsAcc.calculateInterest();
        savingsAcc.withdraw(600);
        savingsAcc.withdraw(100);
        savingsAcc.displayAccountInfo();
        System.out.println();

        // Create a Current Account
        CurrentAccount currentAcc = new CurrentAccount("CA123", "Bob", 200.0, 500.0);
        currentAcc.displayAccountInfo();
        currentAcc.withdraw(300.0);
        currentAcc.displayAccountInfo();
        currentAcc.withdraw(1000.0);
        currentAcc.displayFees();
        currentAcc.calculateInterest();
        System.out.println();
    }
}
