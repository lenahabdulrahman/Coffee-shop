package coffeshop;

import OperationPackages.Operations;
import OperationPackages.OperationsGlobals;


public class HomePage extends javax.swing.JFrame {

    public HomePage() {
        super("Welcome To SHOT");
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

        jButtonMenu = new javax.swing.JButton();
        jButton_cart = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        SignUp_button = new javax.swing.JButton();
        jButtonInvoicres = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButtonMenu.setBackground(new java.awt.Color(255, 255, 255));
        jButtonMenu.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonMenu.setText(" Menu");
        jButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMenu);
        jButtonMenu.setBounds(10, 400, 230, 60);

        jButton_cart.setBackground(new java.awt.Color(255, 255, 255));
        jButton_cart.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton_cart.setText("Cart");
        jButton_cart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cartActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_cart);
        jButton_cart.setBounds(270, 400, 240, 60);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 35)); // NOI18N
        jLabel2.setText("Choose what do you want?");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 310, 470, 50);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 65)); // NOI18N
        jLabel1.setText("Welcome");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(290, 210, 320, 100);

        SignUp_button.setBackground(new java.awt.Color(255, 255, 255));
        SignUp_button.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        SignUp_button.setText("Sign Up");
        SignUp_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUp_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(SignUp_button);
        SignUp_button.setBounds(270, 490, 240, 60);

        jButtonInvoicres.setBackground(new java.awt.Color(255, 255, 255));
        jButtonInvoicres.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonInvoicres.setText("Invoice");
        jButtonInvoicres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInvoicresActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInvoicres);
        jButtonInvoicres.setBounds(10, 490, 230, 60);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffeshop/SHOT- Logo.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 40, 200, 180);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffeshop/back_medum.jpeg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, -30, 800, 680);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 0, 0);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuActionPerformed
        // TODO add your handling code here:
         Operations.OpenNew(this, new Menu());
    }//GEN-LAST:event_jButtonMenuActionPerformed

    private void jButton_cartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cartActionPerformed
        // TODO add your handling code here:
        if(OperationsGlobals.CartProds==null)
        {
             Operations.cartEmpty();
        }
        else
        {
           if(OperationsGlobals.userCoffe==null)
        {
             Operations.OpenNew(this, new SignIn());
        }
        else
        {
            Operations.OpenNew(this, new BillFrame());
        }
        }
    }//GEN-LAST:event_jButton_cartActionPerformed

    private void SignUp_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUp_buttonActionPerformed
        // TODO add your handling code here:
        Operations.OpenNew(this, new Signup());
    }//GEN-LAST:event_SignUp_buttonActionPerformed

    private void jButtonInvoicresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInvoicresActionPerformed
        // TODO add your handling code here:
        if(OperationsGlobals.userCoffe==null)
        {
             Operations.OpenNew(this, new SignIn());
        }
        else
        {
            Operations.OpenNew(this, new MyInvoices());
        }
    }//GEN-LAST:event_jButtonInvoicresActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SignUp_button;
    private javax.swing.JButton jButtonInvoicres;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JButton jButton_cart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
