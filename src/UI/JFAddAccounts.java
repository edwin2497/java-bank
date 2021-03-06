package UI;

import BL.*;
import java.text.SimpleDateFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class JFAddAccounts extends javax.swing.JFrame {

    /**
     * Creates new form JFAddAccounts
     */
    Principal p;

    public JFAddAccounts() {
        initComponents();
        p = new Principal();

    }

    JFAddAccounts(Principal p) {
        initComponents();
        this.p = p;
        jtf_SavingsAccountNumber.setText((String.valueOf(p.accountId)));
        jtf_BorrowingNumber.setText((String.valueOf(p.accountId)));
        jtf_TargetAccountNumber.setText((String.valueOf(p.accountId)));
        loadCustomers();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jbt_addBorrowing = new javax.swing.JButton();
        jtf_BorrowingQuotasAmount = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jlb_interest4 = new javax.swing.JLabel();
        jlb_Balance4 = new javax.swing.JLabel();
        jlb_Number4 = new javax.swing.JLabel();
        jtf_BorrowingExpirationDate = new javax.swing.JTextField();
        jtf_BorrowingStartingAmount = new javax.swing.JTextField();
        jtf_BorrowingInterest = new javax.swing.JTextField();
        jtf_BorrowingBalance = new javax.swing.JTextField();
        jtf_BorrowingNumber = new javax.swing.JTextField();
        jcb_SelectCustomersB = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtf_BorrowingMonthlyPayment = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jcb_SelectCustomersSA = new javax.swing.JComboBox<>();
        jtf_SavingsAccountNumber = new javax.swing.JTextField();
        jlb_Number3 = new javax.swing.JLabel();
        jlb_Balance3 = new javax.swing.JLabel();
        jtf_SavingsAccountBalance = new javax.swing.JTextField();
        jtf_SavingsAccountInterest = new javax.swing.JTextField();
        jlb_interest3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtf_SavingsAccountDepositAmount = new javax.swing.JTextField();
        jbt_addSavingsAccount = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jlb_Number2 = new javax.swing.JLabel();
        jlb_Balance2 = new javax.swing.JLabel();
        jlb_interest2 = new javax.swing.JLabel();
        jtf_TargetAccountNumber = new javax.swing.JTextField();
        jtf_TargetAccountBalance = new javax.swing.JTextField();
        jtf_TargetAccountInterest = new javax.swing.JTextField();
        jbt_addTargetAccoun = new javax.swing.JButton();
        jcb_SelectCustomersTA = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jtf_TargetAccountMonthlyAmount = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtf_TargetAccountQuotasAmount = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtf_TargetAccountQuotasMade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jbt_addBorrowing.setText("Add");
        jbt_addBorrowing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_addBorrowingActionPerformed(evt);
            }
        });

        jLabel7.setText("Quotas Amount");

        jLabel8.setText("Expirtation Date");

        jLabel9.setText("Starting Amount");

        jlb_interest4.setText("Interest");

        jlb_Balance4.setText("Balance");

        jlb_Number4.setText("Number");

        jtf_BorrowingNumber.setEditable(false);

        jLabel10.setText("Select Client: ");

        jLabel11.setText("Monthly Payment");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcb_SelectCustomersB, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jlb_Number4)
                                .addComponent(jlb_Balance4)
                                .addComponent(jlb_interest4))
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jtf_BorrowingBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtf_BorrowingNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtf_BorrowingInterest, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jtf_BorrowingStartingAmount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jtf_BorrowingExpirationDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jtf_BorrowingQuotasAmount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbt_addBorrowing, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtf_BorrowingMonthlyPayment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jcb_SelectCustomersB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_Number4)
                    .addComponent(jtf_BorrowingNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_Balance4)
                    .addComponent(jtf_BorrowingBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_interest4)
                    .addComponent(jtf_BorrowingInterest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtf_BorrowingStartingAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtf_BorrowingExpirationDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtf_BorrowingQuotasAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jtf_BorrowingMonthlyPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbt_addBorrowing)
                .addGap(24, 24, 24))
        );

        jTabbedPane1.addTab("Borrowing ", jPanel3);

        jLabel5.setText("Select Client: ");

        jtf_SavingsAccountNumber.setEditable(false);

        jlb_Number3.setText("Number");

        jlb_Balance3.setText("Balance");

        jlb_interest3.setText("Interest");

        jLabel6.setText("Deposit Amount");

        jbt_addSavingsAccount.setText("Add");
        jbt_addSavingsAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_addSavingsAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jlb_Number3)
                                .addComponent(jlb_Balance3)
                                .addComponent(jlb_interest3))
                            .addComponent(jLabel6))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jtf_SavingsAccountBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtf_SavingsAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtf_SavingsAccountInterest, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtf_SavingsAccountDepositAmount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbt_addSavingsAccount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jcb_SelectCustomersSA, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jcb_SelectCustomersSA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_Number3)
                    .addComponent(jtf_SavingsAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_Balance3)
                    .addComponent(jtf_SavingsAccountBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_interest3)
                    .addComponent(jtf_SavingsAccountInterest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtf_SavingsAccountDepositAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jbt_addSavingsAccount)
                .addGap(101, 101, 101))
        );

        jTabbedPane1.addTab("Saving Account", jPanel1);

        jlb_Number2.setText("Number");

        jlb_Balance2.setText("Balance");

        jlb_interest2.setText("Interest");

        jtf_TargetAccountNumber.setEditable(false);

        jbt_addTargetAccoun.setText("Add");
        jbt_addTargetAccoun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_addTargetAccounActionPerformed(evt);
            }
        });

        jLabel1.setText("Monthly Amount");

        jLabel2.setText("Quotas Amount");

        jLabel3.setText("Quotas Made");

        jLabel4.setText("Select Client: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(129, 129, 129)
                            .addComponent(jbt_addTargetAccoun, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlb_Number2)
                                    .addComponent(jlb_Balance2)
                                    .addComponent(jlb_interest2))
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(38, 38, 38)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jtf_TargetAccountBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtf_TargetAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtf_TargetAccountInterest, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jtf_TargetAccountMonthlyAmount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jtf_TargetAccountQuotasAmount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jtf_TargetAccountQuotasMade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jcb_SelectCustomersTA, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jcb_SelectCustomersTA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_Number2)
                    .addComponent(jtf_TargetAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_Balance2)
                    .addComponent(jtf_TargetAccountBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_interest2)
                    .addComponent(jtf_TargetAccountInterest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtf_TargetAccountMonthlyAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtf_TargetAccountQuotasAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtf_TargetAccountQuotasMade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jbt_addTargetAccoun)
                .addGap(36, 36, 36))
        );

        jTabbedPane1.addTab("Target Account", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbt_addTargetAccounActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_addTargetAccounActionPerformed

        Customer c = (Customer) jcb_SelectCustomersTA.getSelectedItem();

        if (jtf_TargetAccountQuotasMade.getText().equals("") || jtf_TargetAccountQuotasAmount.getText().equals("") || jtf_TargetAccountMonthlyAmount.getText().equals("") || jtf_TargetAccountNumber.getText().equals("")
                || jtf_TargetAccountBalance.getText().equals("") || jtf_TargetAccountInterest.getText().equals("")) {//Valid that we do not leave a blank space when entering information
            JOptionPane.showMessageDialog(null, "You can not leave blank spaces!!");
        } else {
            try {//We call the constructor and pass it values
                TargetAccount ta = new TargetAccount(Float.parseFloat(jtf_TargetAccountMonthlyAmount.getText()), Integer.parseInt(jtf_TargetAccountQuotasAmount.getText()), Integer.parseInt(jtf_TargetAccountQuotasMade.getText()),
                        Long.parseLong(jtf_TargetAccountNumber.getText()), Float.parseFloat(jtf_TargetAccountBalance.getText()), Float.parseFloat(jtf_TargetAccountInterest.getText()));

                p.addCustomersAccount(ta, c.customersAccountList);//Call the add method and pass the object that we create
                JOptionPane.showMessageDialog(null, "Target Account added successfully");

                //Clean the jtextfield
                jtf_TargetAccountBalance.setText("");
                jtf_TargetAccountInterest.setText("");
                jtf_TargetAccountMonthlyAmount.setText("");
                jtf_TargetAccountQuotasAmount.setText("");
                jtf_TargetAccountQuotasMade.setText("");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error adding the account");//Error message
            }
        }

        //Update account id fields in each window
        jtf_BorrowingNumber.setText((String.valueOf(p.accountId)));
        jtf_SavingsAccountNumber.setText((String.valueOf(p.accountId)));
        jtf_TargetAccountNumber.setText((String.valueOf(p.accountId)));

    }//GEN-LAST:event_jbt_addTargetAccounActionPerformed

    private void jbt_addSavingsAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_addSavingsAccountActionPerformed
        Customer c = (Customer) jcb_SelectCustomersSA.getSelectedItem();

        if (jtf_SavingsAccountNumber.getText().equals("") || jtf_SavingsAccountBalance.getText().equals("") || jtf_SavingsAccountInterest.getText().equals("") || jtf_SavingsAccountDepositAmount.getText().equals("")) {//Valid that we do not leave a blank space when entering information
            JOptionPane.showMessageDialog(null, "You can not leave blank spaces!!");
        } else {
            try {//We call the constructor and pass it values
                SavingsAccount sa = new SavingsAccount(Integer.parseInt(jtf_SavingsAccountDepositAmount.getText()), Long.parseLong(jtf_SavingsAccountNumber.getText()), Float.parseFloat(jtf_SavingsAccountBalance.getText()),
                        Float.parseFloat(jtf_SavingsAccountInterest.getText()));

                p.addCustomersAccount(sa, c.customersAccountList);//Call the add method and pass the object that we create
                JOptionPane.showMessageDialog(null, "Savings Account added successfully");

                //Clean the jtextfield
                jtf_SavingsAccountBalance.setText("");
                jtf_SavingsAccountInterest.setText("");
                jtf_SavingsAccountDepositAmount.setText("");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error adding the account");//Error message
            }
        }

        //Update account id fields in each window
        jtf_BorrowingNumber.setText((String.valueOf(p.accountId)));
        jtf_SavingsAccountNumber.setText((String.valueOf(p.accountId)));
        jtf_TargetAccountNumber.setText((String.valueOf(p.accountId)));
    }//GEN-LAST:event_jbt_addSavingsAccountActionPerformed

    private void jbt_addBorrowingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_addBorrowingActionPerformed
        Customer c = (Customer) jcb_SelectCustomersB.getSelectedItem();
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
       
        

        if (jtf_BorrowingNumber.getText().equals("") || jtf_BorrowingBalance.getText().equals("") || jtf_BorrowingInterest.getText().equals("") || jtf_BorrowingExpirationDate.getText().equals("")
                || jtf_BorrowingQuotasAmount.getText().equals("") || jtf_BorrowingMonthlyPayment.getText().equals("") || jtf_BorrowingStartingAmount.getText().equals("")) {//Valid that we do not leave a blank space when entering information
            JOptionPane.showMessageDialog(null, "You can not leave blank spaces!!");
        } else {
            try {//We call the constructor and pass it values
                Borrowing b = new Borrowing(Float.parseFloat(jtf_BorrowingStartingAmount.getText()), sdf.parse(jtf_BorrowingExpirationDate.getText())/*(int) Date.parse(jtf_BorrowingExpirationDate.getText())*/, Integer.parseInt(jtf_BorrowingQuotasAmount.getText()),
                        Float.parseFloat(jtf_BorrowingMonthlyPayment.getText()),Long.parseLong(jtf_BorrowingNumber.getText()), Float.parseFloat(jtf_BorrowingBalance.getText()), Float.parseFloat(jtf_BorrowingBalance.getText()));

                p.addCustomersAccount(b, c.customersAccountList);//Call the add method and pass the object that we create
                JOptionPane.showMessageDialog(null, "Borrowing added successfully");

                //Clean the jtextfield
                jtf_TargetAccountBalance.setText("");
                jtf_TargetAccountInterest.setText("");
                jtf_TargetAccountMonthlyAmount.setText("");
                jtf_TargetAccountQuotasAmount.setText("");
                jtf_TargetAccountQuotasMade.setText("");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error adding the account");//Error message
            }
        }

        //Update account id fields in each window
        jtf_BorrowingNumber.setText((String.valueOf(p.accountId)));
        jtf_SavingsAccountNumber.setText((String.valueOf(p.accountId)));
        jtf_TargetAccountNumber.setText((String.valueOf(p.accountId)));
    }//GEN-LAST:event_jbt_addBorrowingActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFAddAccounts.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFAddAccounts.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFAddAccounts.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFAddAccounts.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFAddAccounts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbt_addBorrowing;
    private javax.swing.JButton jbt_addSavingsAccount;
    private javax.swing.JButton jbt_addTargetAccoun;
    private javax.swing.JComboBox<Customer> jcb_SelectCustomersB;
    private javax.swing.JComboBox<Customer> jcb_SelectCustomersSA;
    private javax.swing.JComboBox<Customer> jcb_SelectCustomersTA;
    private javax.swing.JLabel jlb_Balance2;
    private javax.swing.JLabel jlb_Balance3;
    private javax.swing.JLabel jlb_Balance4;
    private javax.swing.JLabel jlb_Number2;
    private javax.swing.JLabel jlb_Number3;
    private javax.swing.JLabel jlb_Number4;
    private javax.swing.JLabel jlb_interest2;
    private javax.swing.JLabel jlb_interest3;
    private javax.swing.JLabel jlb_interest4;
    private javax.swing.JTextField jtf_BorrowingBalance;
    private javax.swing.JTextField jtf_BorrowingExpirationDate;
    private javax.swing.JTextField jtf_BorrowingInterest;
    private javax.swing.JTextField jtf_BorrowingMonthlyPayment;
    private javax.swing.JTextField jtf_BorrowingNumber;
    private javax.swing.JTextField jtf_BorrowingQuotasAmount;
    private javax.swing.JTextField jtf_BorrowingStartingAmount;
    private javax.swing.JTextField jtf_SavingsAccountBalance;
    private javax.swing.JTextField jtf_SavingsAccountDepositAmount;
    private javax.swing.JTextField jtf_SavingsAccountInterest;
    private javax.swing.JTextField jtf_SavingsAccountNumber;
    private javax.swing.JTextField jtf_TargetAccountBalance;
    private javax.swing.JTextField jtf_TargetAccountInterest;
    private javax.swing.JTextField jtf_TargetAccountMonthlyAmount;
    private javax.swing.JTextField jtf_TargetAccountNumber;
    private javax.swing.JTextField jtf_TargetAccountQuotasAmount;
    private javax.swing.JTextField jtf_TargetAccountQuotasMade;
    // End of variables declaration//GEN-END:variables

    private void loadCustomers() {
        jcb_SelectCustomersTA.setModel(new DefaultComboBoxModel(p.showCustomer().toArray()));
        jcb_SelectCustomersSA.setModel(new DefaultComboBoxModel(p.showCustomer().toArray()));
        jcb_SelectCustomersB.setModel(new DefaultComboBoxModel(p.showCustomer().toArray()));
    }
}
