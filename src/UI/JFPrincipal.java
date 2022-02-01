package UI;

import BL.*;
import javax.swing.DefaultComboBoxModel;

public class JFPrincipal extends javax.swing.JFrame {

    private Principal p;

    public JFPrincipal() {
        initComponents();
        p = new Principal();
    }

    public JFPrincipal(Principal p) {
        initComponents();
        this.p = p;
        validateAccess();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlb_Name = new javax.swing.JLabel();
        jlb_Type = new javax.swing.JLabel();
        jlb_Id = new javax.swing.JLabel();
        jlb_Email = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jcb_ClientAccounts = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jrb_SavingsAccount = new javax.swing.JRadioButton();
        jlb_TypeAccount = new javax.swing.JLabel();
        jlb_AccountBalance = new javax.swing.JLabel();
        jlb_AccountNumber = new javax.swing.JLabel();
        jlb_Interests = new javax.swing.JLabel();
        jpanel_SelectCustomer = new javax.swing.JPanel();
        jcb_selectCustomer = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        Maintenance = new javax.swing.JMenu();
        menuCustomer = new javax.swing.JMenu();
        addCustomer = new javax.swing.JMenuItem();
        deleteCustomer = new javax.swing.JMenuItem();
        updateCustomer = new javax.swing.JMenuItem();
        menuSearch = new javax.swing.JMenuItem();
        menuEmployees = new javax.swing.JMenu();
        addEmployee = new javax.swing.JMenuItem();
        deleteEmployee = new javax.swing.JMenuItem();
        UpdateEmployee = new javax.swing.JMenuItem();
        SearchEmployee = new javax.swing.JMenuItem();
        menuAccounts = new javax.swing.JMenu();
        AddAccount = new javax.swing.JMenuItem();
        DeleteAccount = new javax.swing.JMenuItem();
        UpdateAccount = new javax.swing.JMenuItem();
        SearchAccount = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Personal Information"));

        jLabel1.setText("Type:");

        jLabel2.setText("Name:");

        jLabel3.setText("Id:");

        jLabel4.setText("Email:");

        jlb_Name.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlb_Type.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlb_Id.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlb_Email.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_logout.setText("Logout");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlb_Type, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(jlb_Name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlb_Id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlb_Email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(btn_logout)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlb_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(jlb_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel2)))
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3))
                    .addComponent(jlb_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jlb_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addComponent(btn_logout)
                .addGap(19, 19, 19))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Accounts Information"));

        jLabel5.setText("Select Account:");

        jLabel6.setText("Type:");

        jLabel7.setText("Account Number:");

        jLabel8.setText("Account Balance:");

        jLabel9.setText("Account Interests:");

        jrb_SavingsAccount.setText("Savings Account");
        jrb_SavingsAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_SavingsAccountActionPerformed(evt);
            }
        });

        jlb_TypeAccount.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlb_AccountBalance.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlb_AccountNumber.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlb_Interests.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jrb_SavingsAccount)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlb_AccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlb_TypeAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlb_AccountBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlb_Interests, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jcb_ClientAccounts, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcb_ClientAccounts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jrb_SavingsAccount)
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlb_TypeAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jlb_AccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlb_AccountBalance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlb_Interests, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpanel_SelectCustomer.setBorder(javax.swing.BorderFactory.createTitledBorder("Select Customer"));

        javax.swing.GroupLayout jpanel_SelectCustomerLayout = new javax.swing.GroupLayout(jpanel_SelectCustomer);
        jpanel_SelectCustomer.setLayout(jpanel_SelectCustomerLayout);
        jpanel_SelectCustomerLayout.setHorizontalGroup(
            jpanel_SelectCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_SelectCustomerLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jcb_selectCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jpanel_SelectCustomerLayout.setVerticalGroup(
            jpanel_SelectCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_SelectCustomerLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jcb_selectCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        Maintenance.setText("Maintenance");

        menuCustomer.setText("Customers");

        addCustomer.setText("Add");
        addCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerActionPerformed(evt);
            }
        });
        menuCustomer.add(addCustomer);

        deleteCustomer.setText("Delete");
        deleteCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCustomerActionPerformed(evt);
            }
        });
        menuCustomer.add(deleteCustomer);

        updateCustomer.setText("Update");
        updateCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCustomerActionPerformed(evt);
            }
        });
        menuCustomer.add(updateCustomer);

        menuSearch.setText("Search");
        menuSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSearchActionPerformed(evt);
            }
        });
        menuCustomer.add(menuSearch);

        Maintenance.add(menuCustomer);

        menuEmployees.setText("Employees");

        addEmployee.setText("Add");
        addEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeActionPerformed(evt);
            }
        });
        menuEmployees.add(addEmployee);

        deleteEmployee.setText("Delete");
        deleteEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEmployeeActionPerformed(evt);
            }
        });
        menuEmployees.add(deleteEmployee);

        UpdateEmployee.setText("Update");
        UpdateEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateEmployeeActionPerformed(evt);
            }
        });
        menuEmployees.add(UpdateEmployee);

        SearchEmployee.setText("Search");
        SearchEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchEmployeeActionPerformed(evt);
            }
        });
        menuEmployees.add(SearchEmployee);

        Maintenance.add(menuEmployees);

        menuAccounts.setText("Accounts");

        AddAccount.setText("Add");
        AddAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAccountActionPerformed(evt);
            }
        });
        menuAccounts.add(AddAccount);

        DeleteAccount.setText("Delete");
        DeleteAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteAccountActionPerformed(evt);
            }
        });
        menuAccounts.add(DeleteAccount);

        UpdateAccount.setText("Update");
        UpdateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateAccountActionPerformed(evt);
            }
        });
        menuAccounts.add(UpdateAccount);

        SearchAccount.setText("Search");
        SearchAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchAccountActionPerformed(evt);
            }
        });
        menuAccounts.add(SearchAccount);

        Maintenance.add(menuAccounts);

        jMenuBar1.add(Maintenance);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpanel_SelectCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanel_SelectCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerActionPerformed
        JFAddCustomers jfc = new JFAddCustomers(p);
        jfc.setVisible(true);
    }//GEN-LAST:event_addCustomerActionPerformed

    private void deleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCustomerActionPerformed
        JFDeleteCustomers jfd = new JFDeleteCustomers(p);
        jfd.setVisible(true);

    }//GEN-LAST:event_deleteCustomerActionPerformed

    private void updateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCustomerActionPerformed
        JFUpdateCustomers jfu = new JFUpdateCustomers(p);
        jfu.setVisible(true);
    }//GEN-LAST:event_updateCustomerActionPerformed

    private void deleteEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEmployeeActionPerformed
        JFDeleteEmployees jfd = new JFDeleteEmployees(p);
        jfd.setVisible(true);
    }//GEN-LAST:event_deleteEmployeeActionPerformed

    private void addEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeActionPerformed
        JFAddEmployees jfa = new JFAddEmployees(p);
        jfa.setVisible(true);
    }//GEN-LAST:event_addEmployeeActionPerformed

    private void UpdateEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateEmployeeActionPerformed
        JFUpdateEmployee jfu = new JFUpdateEmployee(p);
        jfu.setVisible(true);
    }//GEN-LAST:event_UpdateEmployeeActionPerformed

    private void menuSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSearchActionPerformed
        JFSearchCustomers jfs = new JFSearchCustomers(p);
        jfs.setVisible(true);
    }//GEN-LAST:event_menuSearchActionPerformed

    private void SearchEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchEmployeeActionPerformed
        JFSearchEmployees jfs = new JFSearchEmployees(p);
        jfs.setVisible(true);
    }//GEN-LAST:event_SearchEmployeeActionPerformed

    private void AddAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAccountActionPerformed
        JFAddAccounts jfa = new JFAddAccounts(p);
        jfa.setVisible(true);
    }//GEN-LAST:event_AddAccountActionPerformed

    private void DeleteAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteAccountActionPerformed
        JFDeleteAccounts jfd = new JFDeleteAccounts(p);
        jfd.setVisible(true);
    }//GEN-LAST:event_DeleteAccountActionPerformed

    private void SearchAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchAccountActionPerformed
        JFSearchAccounts jfs = new JFSearchAccounts(p);
        jfs.setVisible(true);
    }//GEN-LAST:event_SearchAccountActionPerformed

    private void UpdateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateAccountActionPerformed
        JFUpdateAccounts jfu = new JFUpdateAccounts(p);
        jfu.setVisible(true);
    }//GEN-LAST:event_UpdateAccountActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        this.dispose();
        JFLogin jfp = new JFLogin();
        jfp.setVisible(true);
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void jrb_SavingsAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_SavingsAccountActionPerformed
        if (jrb_SavingsAccount.isSelected()) {
            if (p.personlog instanceof Customer) {
                p.load(((Customer) p.personlog).customersAccountList, 0);
            }
        }

    }//GEN-LAST:event_jrb_SavingsAccountActionPerformed

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
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AddAccount;
    private javax.swing.JMenuItem DeleteAccount;
    private javax.swing.JMenu Maintenance;
    private javax.swing.JMenuItem SearchAccount;
    private javax.swing.JMenuItem SearchEmployee;
    private javax.swing.JMenuItem UpdateAccount;
    private javax.swing.JMenuItem UpdateEmployee;
    private javax.swing.JMenuItem addCustomer;
    private javax.swing.JMenuItem addEmployee;
    private javax.swing.JButton btn_logout;
    private javax.swing.JMenuItem deleteCustomer;
    private javax.swing.JMenuItem deleteEmployee;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<Account> jcb_ClientAccounts;
    private javax.swing.JComboBox<String> jcb_selectCustomer;
    private javax.swing.JLabel jlb_AccountBalance;
    private javax.swing.JLabel jlb_AccountNumber;
    private javax.swing.JLabel jlb_Email;
    private javax.swing.JLabel jlb_Id;
    private javax.swing.JLabel jlb_Interests;
    private javax.swing.JLabel jlb_Name;
    private javax.swing.JLabel jlb_Type;
    private javax.swing.JLabel jlb_TypeAccount;
    private javax.swing.JPanel jpanel_SelectCustomer;
    private javax.swing.JRadioButton jrb_SavingsAccount;
    private javax.swing.JMenu menuAccounts;
    private javax.swing.JMenu menuCustomer;
    private javax.swing.JMenu menuEmployees;
    private javax.swing.JMenuItem menuSearch;
    private javax.swing.JMenuItem updateCustomer;
    // End of variables declaration//GEN-END:variables

    private void validateAccess() {
        if (p.personlog instanceof Customer) {

            Customer ac = (Customer) jcb_ClientAccounts.getSelectedItem();

            Maintenance.setVisible(false);
            jlb_Type.setText("Customer");
            jlb_Id.setText(Integer.toString(p.personlog.getId()));
            jlb_Name.setText(p.personlog.name);
            jlb_Email.setText(p.personlog.email);
            jpanel_SelectCustomer.setVisible(false);

        } else {
            jlb_Type.setText("Employee");
            jlb_Id.setText(Integer.toString(p.personlog.getId()));
            jlb_Name.setText(p.personlog.name);
            jlb_Email.setText(p.personlog.email);
        }
    }
}
