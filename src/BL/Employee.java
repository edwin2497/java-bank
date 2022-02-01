package BL;

public class Employee extends Person {

    //Properties
    private int token;
    private int employeeId;

    //Constructors
    public Employee() {
    }

//    public Employee(int token, int employeeId, String name, String lastName, int phone, int id) {
//        super(name, lastName, phone, id);
//        this.token = token;
//        this.employeeId = employeeId;
//    }
    public Employee(int token, int employeeId, String name, String lastName, int phone, int id, String email) {
        super(name, lastName, phone, id, email);
        this.token = token;
        this.employeeId = employeeId;
    }

    //Getters and Setters
    public int getToken() {
        return token;
    }

    public void setToken(int token) {
        this.token = token;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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
        return "Id: " + super.getId() + " ,Name: " + super.name + " " + super.lastName + ", Phone: " + super.phone + ", Token: " + token + ", EmployeeId: " + employeeId + ", Email: " + email;
    }

}
