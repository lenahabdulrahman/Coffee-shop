package coffeshop;

import ManageCoffe.Managment;
import OperationPackages.Operations;
import OperationPackages.OperationsGlobals;
import OperationPackages.UserCoffe;

public class SignIn extends javax.swing.JFrame {


    public SignIn() {
        super("SingIn window");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        combobox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jTextField_UserName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField_password = new javax.swing.JPasswordField();
        jButton_signup = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton_signup1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 0, 0);

        jPanel2.setBackground(new java.awt.Color(237, 232, 207));
        jPanel2.setLayout(null);

        combobox.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        combobox.setForeground(new java.awt.Color(102, 102, 102));
        combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose ", "Employee", "Customer" }));
        combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxActionPerformed(evt);
            }
        });
        jPanel2.add(combobox);
        combobox.setBounds(160, 240, 250, 35);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("UserName");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(18, 126, 126, 29);
        jPanel2.add(jTextField_UserName);
        jTextField_UserName.setBounds(160, 120, 250, 38);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Role");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(30, 240, 53, 29);

        jPasswordField_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_passwordActionPerformed(evt);
            }
        });
        jPanel2.add(jPasswordField_password);
        jPasswordField_password.setBounds(160, 180, 250, 40);

        jButton_signup.setBackground(new java.awt.Color(255, 255, 255));
        jButton_signup.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton_signup.setText("Sign In");
        jButton_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_signupActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_signup);
        jButton_signup.setBounds(130, 300, 240, 60);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Password");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(20, 180, 144, 29);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(60, 110, 490, 390);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 65)); // NOI18N
        jLabel2.setText("Log In");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 20, 320, 100);

        jButton_signup1.setBackground(new java.awt.Color(255, 255, 255));
        jButton_signup1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton_signup1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffeshop/home.png"))); // NOI18N
        jButton_signup1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_signup1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_signup1);
        jButton_signup1.setBounds(60, 40, 70, 60);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffeshop/back_medum.jpeg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, -30, 800, 680);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 65)); // NOI18N
        jLabel1.setText("Sign up");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 0, 320, 100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_passwordActionPerformed

    private void jButton_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_signupActionPerformed
        // TODO add your handling code here:
        if(
            (jTextField_UserName.getText().toString().equals(""))
           ||
            (jPasswordField_password.getText().toString().equals(""))
           ||
           (combobox.getSelectedIndex()==0)   
                
        )
        {
            Operations.openRequied();
        }
        else
        {
            UserCoffe userCoffe;
             if(combobox.getSelectedIndex()==1)
             {
                   userCoffe=new UserCoffe(jTextField_UserName.getText().toString(),jPasswordField_password.getText().toString(),1,3);
             }
             else
                 userCoffe=new UserCoffe(jTextField_UserName.getText().toString(),jPasswordField_password.getText().toString(),1,combobox.getSelectedIndex());  
           
          
            try
            {
                int role=combobox.getSelectedIndex();
                
                OperationsGlobals.userCoffe=  userCoffe.getLoggedIn();
               
                if(OperationsGlobals.userCoffe==null)
                {
                    Operations.openFailedLogin();
                }
                else
                {
                   
                    if(OperationsGlobals.userCoffe.getUserCoffe().getRole()==1)
                    {
                        Operations.OpenNew(this,new Managment());
                    }
                    else if(OperationsGlobals.userCoffe.getUserCoffe().getRole()==3)
                    {
                        OperationsGlobals.userCoffe=null;
                        Operations.OpenNew(this,new Managment());
                        
                    }
                    else
                     Operations.openSuccessLogin();
                }
                
                
              
            }
            catch(Exception exception)
            {
                Operations.openErrorDataBase();
            }
        }

    }//GEN-LAST:event_jButton_signupActionPerformed

    private void comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxActionPerformed

    }//GEN-LAST:event_comboboxActionPerformed

    private void jButton_signup1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_signup1ActionPerformed
        // TODO add your handling code here:
        Operations.OpenNew(this, new HomePage());
    }//GEN-LAST:event_jButton_signup1ActionPerformed

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
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combobox;
    private javax.swing.JButton jButton_signup;
    private javax.swing.JButton jButton_signup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField_password;
    private javax.swing.JTextField jTextField_UserName;
    // End of variables declaration//GEN-END:variables
}
