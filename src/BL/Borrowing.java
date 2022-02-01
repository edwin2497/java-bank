package BL;

import java.util.Date;

public class Borrowing extends Account {

    //Properties
    private float startingAmount;
    private Date expirationDate;
    private int quotasAmount;
    private float monthlyPayment;

    //Constructors
    public Borrowing() {
    }

    public Borrowing(long number, float balance, float interest) {
        super(number, balance, interest);
    }

    public Borrowing(float startingAmount, Date expirationDate, int quotasAmount, float monthlyPayment, long number, float balance, float interest) {
        super(number, balance, interest);
        this.startingAmount = startingAmount;
        this.expirationDate = expirationDate;
        this.quotasAmount = quotasAmount;
        this.monthlyPayment = monthlyPayment;
    }

    public float getStartingAmount() {
        return startingAmount;
    }

    public void setStartingAmount(float startingAmount) {
        this.startingAmount = startingAmount;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getQuotasAmount() {
        return quotasAmount;
    }

    public void setQuotasAmount(int quotasAmount) {
        this.quotasAmount = quotasAmount;
    }

    public float getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(float monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

  
    
    

}
