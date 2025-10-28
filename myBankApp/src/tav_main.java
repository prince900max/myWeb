import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author HP
 */
public class tav_main extends javax.swing.JFrame {
int balance = 0;
Connection con = null;
PreparedStatement pst = null;
ResultSet rs = null;
    
    public tav_main() { // for the password input
        initComponents();
        getBalanceFromDatabase();  // load balance immediately
       }
    //updateBalance(true);  // for adding money
 //updateBalance(false); // for subtracting money

    

     
    


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textField1 = new java.awt.TextField();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jOptionPane1 = new javax.swing.JOptionPane();
        txtId = new javax.swing.JTextField();
        lblResult = new javax.swing.JLabel();
        txtNumber = new javax.swing.JTextField();
        creditButton = new javax.swing.JButton();
        debitButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();

        textField1.setText("textField1");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblResult.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lblResult.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                lblResultComponentShown(evt);
            }
        });

        txtNumber.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        txtNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumberActionPerformed(evt);
            }
        });

        creditButton.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        creditButton.setText("Deposit(Credit)");
        creditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditButtonActionPerformed(evt);
            }
        });

        debitButton.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        debitButton.setText("Withdraw(Debit)");
        debitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                debitButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        jLabel2.setText("Tav Main");

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 2, 14)); // NOI18N
        jLabel1.setText("Input your Password below");

        refreshButton.setText("LOAD");
        refreshButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshButtonMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 2, 14)); // NOI18N
        jLabel3.setText("Input your password and click refresh to display your Balance");

        logoutButton.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        logoutButton.setText("LOGOUT");
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(265, 265, 265)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(223, 223, 223))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(logoutButton)
                        .addGap(95, 95, 95)
                        .addComponent(creditButton)
                        .addGap(76, 76, 76)
                        .addComponent(debitButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(refreshButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(creditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(debitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutButton))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void creditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditButtonActionPerformed
        // TODO add your handling code here:
        // your credit button
        
        updateBalance(true);
        /* THIS BLOCK OF CODE PERFORMS THE SAME ACTION AS ADDING / CREDITING BUT FALSELY UPDATES IN MYSQL DATABASE 
     if (password.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "Enter your Password");
} else {
    try {
        double value = Double.parseDouble(txtNumber.getText());

        if (value <= 0) {
            JOptionPane.showMessageDialog(null, "Amount must be positive");
        } else {
            // Assuming 'balance' is a class-level variable
            balance += value;
            lblResult.setText("Total: " + balance);

            try (Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/tavrince_db", "root", "123456");
                 PreparedStatement pst = con.prepareStatement(
                         "UPDATE tavrince_table SET balance = ? WHERE password = ?")) {

                pst.setDouble(1, balance);
                pst.setString(2, password.getText()); // use String for password

                int rowUpdated = pst.executeUpdate();

                if (rowUpdated > 0) {
                    JOptionPane.showMessageDialog(this, "The balance has been updated successfully!");
                    setVisible(false);
                    new tav_main().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "Password not found, update failed.");
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
            }
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Please enter a valid number!");
    }
}
        */

    }//GEN-LAST:event_creditButtonActionPerformed

    private void debitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_debitButtonActionPerformed
        // TODO add your handling code here:
        // withddraw button
        
        updateBalance(false);
        
         /*  if (password.getText().isEmpty()) { //THIS BLOCK OF CODE PERFORMS THE SAME ACTION AS SUBTRACTING / DEBITING BUT FALSELY UPDATES IN MYSQL DATABASE 
    JOptionPane.showMessageDialog(null, "Enter your Password");
} else {
    try {
        double value = Double.parseDouble(txtNumber.getText());

        if (value <= 0) {
            JOptionPane.showMessageDialog(null, "Amount must be positive");
        } else {
            // Assuming 'balance' is a class-level variable
            balance -= value;
            lblResult.setText("Total: " + balance);

            try (Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/tavrince_db", "root", "123456");
                 PreparedStatement pst = con.prepareStatement(
                         "UPDATE tavrince_table SET balance = ? WHERE password = ?")) {

                pst.setDouble(1, balance);
                pst.setString(2, password.getText()); // use String for password

                int rowUpdated = pst.executeUpdate();

                if (rowUpdated > 0) {
                    JOptionPane.showMessageDialog(this, "The balance has been updated successfully!");
                    setVisible(false);
                    new tav_main().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "Password not found, update failed.");
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
            }
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Please enter a valid number!");
    }
}
        */

   
        


    }//GEN-LAST:event_debitButtonActionPerformed

    private void lblResultComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_lblResultComponentShown
        // TODO add your handling code here:
        

    }//GEN-LAST:event_lblResultComponentShown

    private void txtNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumberActionPerformed

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        // TODO add your handling code here:
         new loginFrame().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutButtonMouseClicked

    private void refreshButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshButtonMouseClicked
        // TODO add your handling code here:5
         
         lblResult.setText("");
         txtNumber.setText("");
          getBalanceFromDatabase();  // load balance immediately
         
        
    }//GEN-LAST:event_refreshButtonMouseClicked
private void getBalanceFromDatabase() {
    String pass = password.getText();
    String sql = "SELECT balance FROM tavrince_table WHERE password = ?";

    try (Connection con = DriverManager.getConnection(
             "jdbc:mysql://localhost:3306/tavrince_db", "root", "123456");
         PreparedStatement pst = con.prepareStatement(sql)) {

        pst.setString(1, pass);

        try (ResultSet rs = pst.executeQuery()) {
            if (rs.next()) {
                int balance = rs.getInt("balance");
                lblResult.setText("Current balance: " + balance);
            } else {
                lblResult.setText("User not found.");
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error fetching balance: " + e.getMessage());
    }
}



private void updateBalance(boolean isAdding) {
    String pass = password.getText();

    if (pass.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Enter your Password");
        return;
    }

    double value;
    try {
        value = Integer.parseInt(txtNumber.getText());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Please enter a valid number!");
        return;
    }

    if (value <= 0) {
        JOptionPane.showMessageDialog(null, "Amount must be positive");
        return;
    }

    try (Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/tavrince_db", "root", "123456")) {

        // 1️⃣ Get current balance
        String selectSQL = "SELECT balance FROM tavrince_table WHERE password = ?";
        try (PreparedStatement pst = con.prepareStatement(selectSQL)) {
            pst.setString(1, pass);
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    int currentBalance = rs.getInt("balance");

                    // 2️⃣ Calculate new balance
                    double newBalance = isAdding ? currentBalance + value : currentBalance - value;

                    if (newBalance < 0) {
                        JOptionPane.showMessageDialog(null, "Insufficient funds!");
                        return;
                    }

                    // 3️⃣ Update database
                    String updateSQL = "UPDATE tavrince_table SET balance = ? WHERE password = ?";
                    try (PreparedStatement updatePst = con.prepareStatement(updateSQL)) {
                        updatePst.setDouble(1, newBalance);
                        updatePst.setString(2, pass);

                        int rowUpdated = updatePst.executeUpdate();
                        if (rowUpdated > 0) {
                            lblResult.setText("Your new balance is: " + newBalance);
                            JOptionPane.showMessageDialog(null, "Balance updated successfully!");
                           
                        } else {
                            JOptionPane.showMessageDialog(null, "Password not found, update failed.");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "User not found.");
                }
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage());
    }
}



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
            java.util.logging.Logger.getLogger(tav_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tav_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tav_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tav_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tav_main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton creditButton;
    private javax.swing.JButton debitButton;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JLabel lblResult;
    private javax.swing.JButton logoutButton;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton refreshButton;
    private java.awt.TextField textField1;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNumber;
    // End of variables declaration//GEN-END:variables
}
