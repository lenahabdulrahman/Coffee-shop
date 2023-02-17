package ManageCoffe;

import OperationPackages.Operations;
import OperationPackages.Products;
import coffeshop.HomePage;

public class AddProduct extends javax.swing.JFrame {

    public AddProduct() {
        super("Add Product");
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField_price = new javax.swing.JTextField();
        jComboBox_class = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jButton_signup2 = new javax.swing.JButton();
        jButton_signup1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(237, 232, 207));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Name");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 10, 70, 29);

        jTextField_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nameActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField_name);
        jTextField_name.setBounds(210, 10, 254, 38);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Price");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 60, 180, 29);
        jPanel2.add(jTextField_price);
        jTextField_price.setBounds(210, 60, 254, 38);

        jComboBox_class.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cup Cake", "Cheese Cake", "Donats", "Drinks" }));
        jComboBox_class.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_classActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox_class);
        jComboBox_class.setBounds(210, 120, 254, 42);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("Class");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(10, 130, 140, 29);

        jButton_signup2.setBackground(new java.awt.Color(255, 255, 255));
        jButton_signup2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton_signup2.setText("Save");
        jButton_signup2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_signup2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_signup2);
        jButton_signup2.setBounds(130, 200, 210, 60);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 490, 320));

        jButton_signup1.setBackground(new java.awt.Color(255, 255, 255));
        jButton_signup1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton_signup1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffeshop/home.png"))); // NOI18N
        jButton_signup1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_signup1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_signup1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 70, 60));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 65)); // NOI18N
        jLabel1.setText("New Product");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 440, 100));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffeshop/back_medum.jpeg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 800, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nameActionPerformed

    private void jComboBox_classActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_classActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_classActionPerformed

    private void jButton_signup2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_signup2ActionPerformed
        // TODO add your handling code here:
        if ((jTextField_price.getText().toString().equals(""))
                || (jTextField_name.getText().toString().equals(""))
              ) {
            Operations.openRequied();
        } else {
            Products prod = new Products();
            prod.setClassName(jComboBox_class.getSelectedItem().toString());
             prod.setProductName(jTextField_name.getText().toString());
            try {
                prod.setPrice(Integer.parseInt(jTextField_price.getText().toString()));
            } catch (Exception exception) {
                Operations.openErrorIntRequied();
                return;
            }
            try{
               prod.AddNew(this); 
            }
            catch(Exception s)
            {
                Operations.openErrorDataBase();
            }
        }
    }//GEN-LAST:event_jButton_signup2ActionPerformed

    private void jButton_signup1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_signup1ActionPerformed
        // TODO add your handling code here:
        Operations.OpenNew(this, new Managment());
    }//GEN-LAST:event_jButton_signup1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new AddProduct().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_signup1;
    private javax.swing.JButton jButton_signup2;
    private javax.swing.JComboBox<String> jComboBox_class;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField_name;
    private javax.swing.JTextField jTextField_price;
    // End of variables declaration//GEN-END:variables
}
