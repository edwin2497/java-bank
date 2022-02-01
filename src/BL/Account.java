package BL;

public abstract class Account {

    //Properties
    public long number;
    private float balance;
    private float interest;
    

    //Constructors
    public Account() {
    }

    public Account(long number, float balance, float interest) {
        this.number = number;
        this.balance = balance;
        this.interest = interest;
    }

    //Getters and Setters
    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    @Override
    public String toString() {
        return "Account{" + "number=" + number + ", balance=" + balance + ", interest=" + interest + '}';
    }

}
