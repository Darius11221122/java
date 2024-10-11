public class BankCustomerDriver {
    public static void main(String[] args) {
        // Creating BankCustomer
        BankCustomer customer = new BankCustomer("John Doe", "123 Main St", 1);

        // Creating Savings Accounts
        SavingsAaccount saver1 = new SavingsAaccount();
        SavingsAaccount saver2 = new SavingsAaccount();
        SavingsAaccount saver3 = new SavingsAaccount();

        // Setting balances and interest rates
        saver1.setSavingsBalance(2000.00);
        saver2.setSavingsBalance(3000.00);
        saver3.setSavingsBalance(4000.00);
        
        saver1.setAnnualInterestRate(0.04);
        saver2.setAnnualInterestRate(0.04);
        saver3.setAnnualInterestRate(0.04);

        // Adding accounts to the customer
        customer.addAccount(saver1);
        customer.addAccount(saver2);
        customer.addAccount(saver3);

        // Calculate monthly interest for each saver
        saver1.calclateMothlyInterest();
        saver2.calclateMothlyInterest();
        saver3.calclateMothlyInterest();

        // Print account summary
        System.out.println("Account Summary:");
        customer.summary();

        // Print total balance
        System.out.println("Total Balance: " + customer.balance());

        // Modify interest rate to 5% and calculate for next month
        SavingsAaccount.modifyInterestRate(0.05);

        saver1.calclateMothlyInterest();
        saver2.calclateMothlyInterest();
        saver3.calclateMothlyInterest();

        // Print updated summary after interest rate change
        System.out.println("\nUpdated Account Summary after Interest Rate Change:");
        customer.summary();

        // Print updated total balance
        System.out.println("Updated Total Balance: " + customer.balance());
    }
}