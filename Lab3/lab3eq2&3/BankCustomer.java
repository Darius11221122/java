public class BankCustomer {
    String name;
    String address;
    SavingsAaccount[] accountArray = new SavingsAaccount[3];
    int accountNumber = 0;

    public BankCustomer(String newName, String newAddress, int accountNumber){
        name = newName;
        address = newAddress;
    }

    public void addAccount(SavingsAaccount newSavingsAaccount) {
        if (accountNumber < accountArray.length) {
            accountArray[accountNumber] = newSavingsAaccount;
            accountNumber++;
        } else {
            System.out.println("Cannot add more accounts. Maximum limit reached.");
        }
    }

    public double balance() {
        double totalBalance = 0;
        for (int i = 0; i < accountNumber; i++) {
            totalBalance += accountArray[i].getSavnigsBalance();
        }
        return totalBalance;
    }

    public void summary() {
        for (int i = 0; i < accountNumber; i++) {
            System.out.println("Account ID: " + accountArray[i].getaccountID() + ", Balance: " + accountArray[i].getSavnigsBalance());
        }
    }
}