package BL;

import java.util.ArrayList;

public class Customer extends Person {

    //Properties
    private String password;
    private boolean active;
    private int clientId;
    public ArrayList<Account> customersAccountList = new ArrayList();

    //Constructors
    public Customer() {
    }

    public Customer(String password, boolean active, int clientId, String name, String lastName, int phone, int id, String email) {
        super(name, lastName, phone, id, email);
        this.password = password;
        this.active = active;
        this.clientId = clientId;
    }

    //Getters and Setters
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    @Override
    public boolean Login() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String PersonalData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Account SearchAccount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Deposit(float amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float withdraw(float amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Logout() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String SeeAccounts() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float SeeBalance() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Id: " + super.getId() + " ,Name: " + super.name + " " + super.lastName + ", Phone: " + super.phone + ", Password: " + password + ", Active: " + active + ", ClientId: " + clientId + ", Email: " + email;
    }

}
