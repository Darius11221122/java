public class SavingsAaccount {
    static int nextID = 1;
    private int accountID = 1;
    static double annualInterestRate;
    private double savingsBalance;

    public SavingsAaccount(){
        accountID = nextID;
        nextID++;
    }
    public void calclateMothlyInterest(){
        savingsBalance += (annualInterestRate * savingsBalance) / 12;
    }
    public static void modifyInterestRate(double newAnnualInterestRate){
        annualInterestRate = newAnnualInterestRate;
    }

    //get
    public int getNextID(){
        return nextID;
    }
    public int getaccountID(){
        return accountID;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public double getSavnigsBalance(){
        return savingsBalance;
    }

    //set
    public void setAnnualInterestRate(double newAnnualInterestRate){
        annualInterestRate = newAnnualInterestRate;
    }
    public void setSavingsBalance(double newSavingsBalance){
        savingsBalance = newSavingsBalance;
    }

}


