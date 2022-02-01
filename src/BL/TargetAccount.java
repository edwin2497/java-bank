package BL;

public class TargetAccount extends Account {

    //Properties
    private float monthlyAmount;
    private int quotasAmount;
    private int quotasMade;

    //Constructors
    public TargetAccount() {
    }

    public TargetAccount(long number, float balance, float interest) {
        super(number, balance, interest);
    }

    public TargetAccount(float monthlyAmount, int quotasAmount, int quotasMade, long number, float balance, float interest) {
        super(number, balance, interest);
        this.monthlyAmount = monthlyAmount;
        this.quotasAmount = quotasAmount;
        this.quotasMade = quotasMade;
    }
    
    //Getters and Setters

    public float getMonthlyAmount() {
        return monthlyAmount;
    }

    public void setMonthlyAmount(float monthlyAmount) {
        this.monthlyAmount = monthlyAmount;
    }

    public int getQuotasAmount() {
        return quotasAmount;
    }

    public void setQuotasAmount(int quotasAmount) {
        this.quotasAmount = quotasAmount;
    }

    public int getQuotasMade() {
        return quotasMade;
    }

    public void setQuotasMade(int quotasMade) {
        this.quotasMade = quotasMade;
    }
    
    
    

    
}