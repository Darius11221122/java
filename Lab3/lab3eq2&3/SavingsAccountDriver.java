public class SavingsAccountDriver {
    public static void main(String []args){
        SavingsAaccount saver1 = new SavingsAaccount();
        SavingsAaccount saver2 = new SavingsAaccount();

        saver1.setSavingsBalance(2000.00);
        saver1.setAnnualInterestRate(0.04);
        saver2.setSavingsBalance(3000.00);
        saver2.setAnnualInterestRate(0.04);

        saver1.calclateMothlyInterest();
        saver2.calclateMothlyInterest();

        System.out.println("Month 1, Saver1 :" + saver1.getSavnigsBalance());
        System.out.println("Month 1, Saver2 :" + saver2.getSavnigsBalance());

        saver1.setAnnualInterestRate(0.05);
        saver2.setAnnualInterestRate(0.05);

        saver1.calclateMothlyInterest();
        saver2.calclateMothlyInterest();

        System.out.println("Month 2, Saver1 :" + saver1.getSavnigsBalance());
        System.out.println("Month 2, Saver2 :" + saver2.getSavnigsBalance());
    }
}
