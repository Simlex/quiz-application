package quizapp;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import static javax.swing.JOptionPane.showMessageDialog;
import java.sql.SQLException;
import java.util.UUID;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SignUp extends javax.swing.JFrame {

    public SignUp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        matricNo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pwd = new javax.swing.JPasswordField();
        pwd_confirmation = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SIGN UP");
        setPreferredSize(new java.awt.Dimension(810, 520));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(75, 146, 34));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\SIMILOLUWA AFOLABI\\Documents\\NetBeansProjects\\LoginAndSignUp\\src\\assets\\images\\logo.png")); // NOI18N
        jLabel1.setText("Logo");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CSC Study Quiz");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Welcome To");

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Copyright 2024. All rights reserved.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 110, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(106, 106, 106))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(42, 42, 42))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 400, 500);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("SIGN UP");

        jLabel6.setText("Full Name");

        fName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameActionPerformed(evt);
            }
        });

        jLabel7.setText("Matric Number");

        matricNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matricNoActionPerformed(evt);
            }
        });

        jLabel8.setText("Password");

        jLabel9.setText("Confirm Password");

        jButton1.setBackground(new java.awt.Color(75, 146, 34));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SIGN UP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setText("I have an account.");

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(75, 146, 34));
        jButton2.setText("LOGIN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pwd)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(pwd_confirmation, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                            .addComponent(matricNo)
                            .addComponent(fName)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(matricNo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwd_confirmation, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jButton2))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(400, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 101, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameActionPerformed

    private void matricNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matricNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matricNoActionPerformed

    public static String encryptPassword(String password) {
        try {
            // Create a MessageDigest instance for MD5 hashing
            MessageDigest md = MessageDigest.getInstance("MD5");

            // Convert password string to bytes
            byte[] passwordBytes = password.getBytes();

            // Compute the hash value of the password bytes
            byte[] hashedBytes = md.digest(passwordBytes);

            // Convert the hash value to a hexadecimal string representation
            StringBuilder sb = new StringBuilder();
            for (byte b : hashedBytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException ex) {
            // Handle NoSuchAlgorithmException
            ex.printStackTrace();
            return null;
        }
    }

    /**
     * Show login screen *
     */
    public void showLoginScreen() {
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null); // Aligns frame to center
        this.dispose();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // System.out.println("Sign up button clicked");
        String fullName, matricNumber, password, passwordConfirmation, query;
        String DbUrl, DbUser, DbPassword;
        DbUrl = "jdbc:MySQL://localhost:3306/java_quiz_database";
        DbUser = "java_quiz";
        DbPassword = "password";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(DbUrl, DbUser, DbPassword);

            if (con != null) {
                System.out.println("Connection to the database was successful!");
                // Proceed with further database operations
            } else {
                System.out.println("Failed to connect to the database!");
            }

            Statement st = con.createStatement();

            if (fName.getText().isEmpty()) {
                JOptionPane.showMessageDialog(
                        new JFrame(),
                        "Full name is required",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else if (matricNo.getText().isEmpty()) {
                JOptionPane.showMessageDialog(
                        new JFrame(),
                        "Matric number is required",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else if (pwd.getPassword().length == 0) {
                JOptionPane.showMessageDialog(
                        new JFrame(),
                        "Password is required",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else if (pwd_confirmation.getPassword().length == 0) {
                JOptionPane.showMessageDialog(
                        new JFrame(),
                        "Please confirm your password",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else if (!new String(pwd.getPassword()).equals(new String(pwd_confirmation.getPassword()))) {
                JOptionPane.showMessageDialog(
                        new JFrame(),
                        "Your password and confirmation password don't match",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                fullName = fName.getText();
                matricNumber = matricNo.getText();
                password = new String(pwd.getPassword());
                passwordConfirmation = new String(pwd_confirmation.getPassword());

                System.out.println(password);

                // Get the database metadata
                DatabaseMetaData dbm = con.getMetaData();

                // Open a connection
                try (Connection conn = DriverManager.getConnection(DbUrl, DbUser, DbPassword); Statement stmt = conn.createStatement()) {
                    String sql = "CREATE TABLE IF NOT EXISTS Users "
                            + "(id VARCHAR(36) not NULL, "
                            + " full_name VARCHAR(255), "
                            + " matric_number VARCHAR(255), "
                            + " password VARCHAR(255), "
                            + " PRIMARY KEY ( id ))";

                    stmt.executeUpdate(sql);
                    System.out.println("Created table in given database...");
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                // Check if the matric number already exists
                try (Connection conn = DriverManager.getConnection(DbUrl, DbUser, DbPassword); Statement stmt = conn.createStatement()) {

                    String checkMatricNumberQuery = "SELECT * FROM Users WHERE matric_number = '" + matricNumber + "'";
                    ResultSet resultSet = stmt.executeQuery(checkMatricNumberQuery);

                    if (resultSet.next()) {
                        // Matric number already exists, show error message
                        JOptionPane.showMessageDialog(
                                new JFrame(),
                                "Matric number already exists, kindly login",
                                "Error",
                                JOptionPane.ERROR_MESSAGE);

                        showLoginScreen();
                    } else {

                        // Generate UUID for the id column
                        String id = UUID.randomUUID().toString();

                        // Encrypt password
                        String encryptedPassword = encryptPassword(password);

                        // Execute a query
                        System.out.println("Inserting records into the table...");
                        String sql = "INSERT INTO Users (id, full_name, matric_number, password) VALUES ('" + id + "', '" + fullName + "', '" + matricNumber + "', '" + encryptedPassword + "')";
                        stmt.executeUpdate(sql);
                        System.out.println("Inserted records into the table...");

                        // Clear input fields;
                        fName.setText("");
                        matricNo.setText("");
                        pwd.setText("");
                        pwd_confirmation.setText("");

                        showMessageDialog(null, "Account created successfully!");

                        showLoginScreen();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        } catch (Exception ex) {
            System.out.println("Error!" + ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null); // Aligns frame to center
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTextField matricNo;
    private javax.swing.JPasswordField pwd;
    private javax.swing.JPasswordField pwd_confirmation;
    // End of variables declaration//GEN-END:variables
}
