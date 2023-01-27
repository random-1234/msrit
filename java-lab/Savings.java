class SavingsAccount {
    static double annualInterestRate;
    private double savingsBalance;

    // Parameterized constructor
    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    // Method to calculate monthly interest
    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    // Static method to set annual interest rate
    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    // Method to return savings balance
    public double getSavingsBalance() {
        return savingsBalance;
    }
}

public class Savings {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        // Set annual interest rate to 4%
        SavingsAccount.modifyInterestRate(0.04);

        // Calculate and print new balances for both savers
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("New balance for saver1: $" + saver1.getSavingsBalance());
        System.out.println("New balance for saver2: $" + saver2.getSavingsBalance());

        // Set annual interest rate to 5%
        SavingsAccount.modifyInterestRate(0.05);

        // Calculate and print new balances for both savers
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("New balance for saver1: $" + saver1.getSavingsBalance());
        System.out.println("New balance for saver2: $" + saver2.getSavingsBalance());
    }
}