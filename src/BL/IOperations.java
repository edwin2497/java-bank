package BL;

public interface IOperations {
    
    //Methods
    boolean Login();

    String PersonalData();

    Account SearchAccount();

    void Deposit(float amount);

    float withdraw(float amount);

    void Logout();

    String SeeAccounts();
    
    float SeeBalance();
}
