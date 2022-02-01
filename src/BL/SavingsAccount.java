package BL;

public class SavingsAccount extends Account {

    //Properties
    private int depositAmount;

    //Constructors
    public SavingsAccount() {
    }

    public SavingsAccount(long number, float balance, float interest) {
        super(number, balance, interest);
    }

    public SavingsAccount(int depositAmount, long number, float balance, float interest) {
        super(number, balance, interest);
        this.depositAmount = depositAmount;
    }

    //Getters and Setters
    public int getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(int depositAmount) {
        this.depositAmount = depositAmount;
    }

    @Override
    public String toString() {
        return "Account: " + "Number: " + number + ", Balance: " + super.getBalance() + ", Interest: " + super.getInterest() + ", Deposit Amount: " + depositAmount;
    }

}
