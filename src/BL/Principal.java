package BL;

import DAL.ReadFile;

import java.util.ArrayList;

public class Principal {

    //ArrayList for persons and accounts
    ArrayList<Person> personsList = new ArrayList();

    //Counter for the id of customers, accounts, and employees
    public int customerId = 1;
    public int employeeId = 1;
    public long accountId = 1;
    public Person personlog;
    Customer c = new Customer();

    //Method to add people 
    public void addPerson(Person New) {

        if (New instanceof Customer) {
            //((Customer) New).setId(customerId);
            customerId++;

        }
        if (New instanceof Employee) {
            //((Employee) New).setId(employeeId);
            employeeId++;

        }
        personsList.add(New);
    }

    //Method to update people 
    public void updatePerson(Person p) {
        int i = personsList.indexOf(p);

        personsList.set(i, p);

    }

    //Method to delete people 
    public void deletePerson(int id) {
        Person deletePerson = null;
        for (Person p : personsList) {
            if (p.getId() == id) {
                deletePerson = p;
            }
        }
        if (deletePerson != null) {
            if (deletePerson instanceof Customer) {
                personsList.remove(deletePerson);
            }
            if (deletePerson instanceof Employee) {
                personsList.remove(deletePerson);
            }

        }
    }

    //Method to search Customers
    public String searchCustomer(int id) {

        for (Person p : personsList) {
            if (p.getId() == id && p instanceof Customer) {
                return p.toString();
            }
        }

        return null;
    }

    //Method to search Employees
    public String searchEmployee(int id) {

        for (Person p : personsList) {
            if (p.getId() == id && p instanceof Employee) {
                return p.toString();
            }
        }

        return null;
    }

    //Method to show the list of customers
    public ArrayList<Customer> showCustomer() {

        ArrayList<Customer> customersList = new ArrayList();

        for (Person p : personsList) {
            if (p instanceof Customer) {
                customersList.add((Customer) p);
            }
        }
        return customersList;
    }

    //Method to show the list of employees
    public ArrayList<Employee> showEmployee() {

        ArrayList<Employee> employeesList = new ArrayList();
        for (Person p : personsList) {
            if (p instanceof Employee) {
                employeesList.add((Employee) p);
            }
        }
        return employeesList;
    }

    //Method to add accounts
    public void addCustomersAccount(Account New, ArrayList<Account> customersAccountList) {

        if (New instanceof SavingsAccount) {
            ((SavingsAccount) New).setNumber(accountId);
            accountId++;

        }
        if (New instanceof TargetAccount) {
            ((TargetAccount) New).setNumber(accountId);
            accountId++;

        }
        if (New instanceof Borrowing) {
            ((Borrowing) New).setNumber(accountId);
            accountId++;

        }

        c.customersAccountList.add(New);
        //accountsList.add(New);
    }

    //Method to show the list of SavingsAccounts
    public ArrayList<SavingsAccount> showSavingsAccount() {

        ArrayList<SavingsAccount> SavingsAccountList = new ArrayList();

        for (Account ac : c.customersAccountList) {
            if (ac instanceof SavingsAccount) {
                SavingsAccountList.add((SavingsAccount) ac);
            }
        }
        return SavingsAccountList;
    }

    //Method to show the list of TargetAccounts
    public ArrayList<TargetAccount> showTargetAccount() {

        ArrayList<TargetAccount> TargetAccountList = new ArrayList();

        for (Account ac : c.customersAccountList) {
            if (ac instanceof TargetAccount) {
                TargetAccountList.add((TargetAccount) ac);
            }
        }
        return TargetAccountList;
    }

    //Method to show the list of Borrowing
    public ArrayList<Borrowing> showBorrowing() {

        ArrayList<Borrowing> BorrowingList = new ArrayList();

        for (Account ac : c.customersAccountList) {
            if (ac instanceof Borrowing) {
                BorrowingList.add((Borrowing) ac);
            }
        }
        return BorrowingList;
    }

    //Method to delete accounts
    public void deleteAccount(long number) {
        Account deleteAccount = null;
        for (Account ac : c.customersAccountList) {
            if (ac.getNumber() == number) {
                deleteAccount = ac;
            }
        }
        if (deleteAccount != null) {
            if (deleteAccount instanceof SavingsAccount) {
                c.customersAccountList.remove(deleteAccount);

            }
            if (deleteAccount instanceof TargetAccount) {
                c.customersAccountList.remove(deleteAccount);

            }
            if (deleteAccount instanceof Borrowing) {
                c.customersAccountList.remove(deleteAccount);

            }

        }
    }

    //Method to update accounts
    public void updateAccount(Account ac) {
        int i = c.customersAccountList.indexOf(ac);

        c.customersAccountList.set(i, ac);

    }

    //Method to search accounts
    public String searchSavingsAccount(int number) {

        //SavingsAccount sa = new SavingsAccount();
        for (Account ac : c.customersAccountList) {
            if (ac.getNumber() == number && ac instanceof SavingsAccount) {
                return ac.toString();
            }

        }

        return "Account doesn't exist";
    }

    //Method to search accounts
    public String searchTargetAccount(int number) {

        for (Account ac : c.customersAccountList) {
            if (ac.getNumber() == number && ac instanceof TargetAccount) {
                return ac.toString();
            }

        }

        return "Account doesn't exist";
    }

    //Method to search accounts
    public String searchBorrowingAccount(int number) {

        for (Account ac : c.customersAccountList) {
            if (ac.getNumber() == number && ac instanceof Borrowing) {
                return ac.toString();
            }
        }

        return "Account doesn't exist";
    }

    //Method to login in the program
    public boolean loginValidation(String user, String password) {

        for (Person p : personsList) {
            if (p.email.equals(user)) {
                if (p instanceof Customer) {
                    if (((Customer) p).getPassword().equals(password)) {
                        personlog = new Customer();
                        personlog = p;
                        return true;

                    }
                }

            }

        }
        return false;
    }

    public boolean loginValidation2(String user, String password) {

        for (Person p : personsList) {
            if (p instanceof Employee) {
                if (p.email.equals(user)) {
                    if (((Employee) p).getToken() == Integer.parseInt(password)) {
                        personlog = new Employee();
                        personlog = p;

                        return true;
                    }

                }
            }
        }
        return false;
    }

    //Method to load data of customers and employees from the file
    public void loadData() {
        loadCustomers();
        loadEmployees();
        loadAccounts();
    }

    //Method to load data of customers from the file
    private void loadCustomers() {
        //String rute = "F:\\PRG2\\CustomersData.csv";//crear archivo csv  nombre/apellido/cedula/telefono/email/clave/activo
       String rute = "C:\\DatosProyecto\\.CustomersData.csv";
        ReadFile rf = new ReadFile();

        ArrayList<String[]> list = rf.Read(rute);

        for (String[] customer : list) {
            System.out.println("client = " + customer[0]);

            Customer cs = new Customer();
            try {
                cs.name = customer[0];
                cs.lastName = customer[1];
                cs.setId(Integer.parseInt(customer[2]));
                cs.phone = (Integer.parseInt(customer[3]));
                cs.setPassword(customer[4]);
                cs.email = customer[5];
                cs.setClientId(customerId);

                addPerson(cs);
            } catch (Exception e) {
                System.out.println("error");
            }
        }

    }

    //Method to load data of employees from the file
    private void loadEmployees() {

        //String rute = "F:\\PRG2\\EmployeesData.csv";
        String rute = "C:\\DatosProyecto\\.EmployeesData.csv";
        ReadFile rf = new ReadFile();

        ArrayList<String[]> list = rf.Read(rute);

        for (String[] employee : list) {
            System.out.println("Employee = " + employee[0]);

            Employee em = new Employee();
            try {
                em.name = employee[0];
                em.lastName = employee[1];
                em.setId(Integer.parseInt(employee[2]));
                em.phone = (Integer.parseInt(employee[3]));
                em.setToken(Integer.parseInt(employee[4]));
                em.email = employee[5];
                em.setEmployeeId(employeeId);

                addPerson(em);

            } catch (Exception e) {
                System.out.println("error");
            }
        }

    }

    public void loadAccounts(/*ArrayList<Account> customersAccountList, int accountType*/) {

        //String rute = "F:\\PRG2\\AccountsData.csv";
       String rute = "C:\\DatosProyecto\\.AccountsData.csv";
        ReadFile rf = new ReadFile();

        ArrayList<String[]> list = rf.Read(rute);

        for (String[] account : list) {

            SavingsAccount sa = new SavingsAccount();
            Customer c = new Customer();
            try {

                sa.number = Long.parseLong(account[0]);
                sa.setBalance(Float.parseFloat(account[1]));
                sa.setInterest(Float.parseFloat(account[2]));
                sa.setDepositAmount(Integer.parseInt(account[3]));

                addCustomersAccount(sa, c.customersAccountList);

            } catch (Exception e) {
                System.out.println("error");
            }
        }
    }

    public ArrayList<Account> load(ArrayList<Account> customersAccountList, int accountType) {

        ArrayList<Account> listaccount = new ArrayList();

        for (Account c : c.customersAccountList) {
            if (accountType == 0 && c instanceof SavingsAccount) {
                listaccount.add((SavingsAccount) c);

            }

        }
        return listaccount;

    }
}
