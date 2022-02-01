package BL;

public abstract class Person implements IOperations {

    //Properties
    public String name;
    public String lastName;
    public int phone;
    private int id;
    public String email;

    //Constructors
    public Person() {
    }

    public Person(String name, String lastName, int phone, int id) {
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.id = id;
    }

    public Person(String name, String lastName, int phone, int id, String email) {
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.id = id;
        this.email = email;
    }

    //Methods Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Methods ToString
    @Override
    public String toString() {
        return "Id: " + id + " ,Name: " + name + " " + lastName + ", Phone: " + phone + ", Email: " + email;
    }

}
