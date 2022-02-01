/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import BL.Principal;
import javax.swing.JOptionPane;

/**
 *
 * @author Lap Casa
 */
public class JFLogin extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    Principal p = new Principal();

    public JFLogin() {
        initComponents();
        showCustomer();
        p.loadData();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtf_user = new javax.swing.JTextField();
        jlb_password = new javax.swing.JLabel();
        jtf_password = new javax.swing.JTextField();
        jcbx_changeusers = new javax.swing.JComboBox<>();
        jlb_token = new javax.swing.JLabel();
        jftf_token = new javax.swing.JFormattedTextField();
        jbt_login = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("User");

        jlb_password.setText("Password");

        jcbx_changeusers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customers", "Employees" }));
        jcbx_changeusers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbx_changeusersActionPerformed(evt);
            }
        });

        jlb_token.setText("Token");

        jftf_token.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("########"))));

        jbt_login.setText("Login");
        jbt_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlb_password)
                    .addComponent(jLabel1)
                    .addComponent(jlb_token))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcbx_changeusers, 0, 220, Short.MAX_VALUE)
                    .addComponent(jtf_user)
                    .addComponent(jtf_password)
                    .addComponent(jftf_token))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(148, Short.MAX_VALUE)
                .addComponent(jbt_login)
                .addGap(145, 145, 145))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jcbx_changeusers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_password)
                    .addComponent(jtf_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_token)
                    .addComponent(jftf_token, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jbt_login)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbt_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_loginActionPerformed
        String pass;
        if (jcbx_changeusers.getSelectedItem().equals("Customers")) {
            pass = jtf_password.getText();

            if (p.loginValidation(jtf_user.getText(), pass)) {
                new JFPrincipal(p).setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Wrong password or user, please try again");
            }
        } else if (jcbx_changeusers.getSelectedItem().equals("Employees")) {
            pass = jftf_token.getText();
            if (p.loginValidation2(jtf_user.getText(), pass)) {
                new JFPrincipal(p).setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Wrong password or user, please try again");
            }
        }
    }//GEN-LAST:event_jbt_loginActionPerformed

    private void jcbx_changeusersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbx_changeusersActionPerformed
        if (jcbx_changeusers.getSelectedItem().equals("Customers")) {
            showCustomer();
        } else {
            showEmployee();
        }
    }//GEN-LAST:event_jcbx_changeusersActionPerformed

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
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbt_login;
    private javax.swing.JComboBox<String> jcbx_changeusers;
    private javax.swing.JFormattedTextField jftf_token;
    private javax.swing.JLabel jlb_password;
    private javax.swing.JLabel jlb_token;
    private javax.swing.JTextField jtf_password;
    private javax.swing.JTextField jtf_user;
    // End of variables declaration//GEN-END:variables

    private void showCustomer() { //show customer options and hides employees options
        jlb_token.setVisible(false);
        jftf_token.setVisible(false);
        jlb_password.setVisible(true);
        jtf_password.setVisible(true);

    }

    private void showEmployee() { //show employees options and hides customer options
        jlb_token.setVisible(true);
        jftf_token.setVisible(true);
        jlb_password.setVisible(false);
        jtf_password.setVisible(false);

    }

}
