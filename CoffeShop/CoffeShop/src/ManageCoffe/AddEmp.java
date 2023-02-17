package ManageCoffe;

import OperationPackages.Branches;
import OperationPackages.Employee;
import OperationPackages.Operations;
import OperationPackages.UserCoffe;
import java.util.ArrayList;

public class AddEmp extends javax.swing.JFrame {

    public AddEmp() {
        super("Add Employee");
        initComponents();
        initBranches();

    }
    ArrayList<Branches> list;

    void initBranches() {
        list = Branches.selectAll();
        for (int i = 0; i < list.size(); i++) {
            jComboBox_branches.addItem(list.get(i).getCity());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton_signup1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField_UserName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField_password = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_salary = new javax.swing.JTextField();
        jComboBox_branches = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jRadioButton_male = new javax.swing.JRadioButton();
        jRadioButton_female = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jButton_signup2 = new javax.swing.JButton();
        jTextField_Email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBox_city1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Employee");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 65)); // NOI18N
        jLabel1.setText("Add Emp");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 440, 100));

        jButton_signup1.setBackground(new java.awt.Color(255, 255, 255));
        jButton_signup1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton_signup1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffeshop/home.png"))); // NOI18N
        jButton_signup1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_signup1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_signup1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 70, 60));

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
        jLabel5.setText("UserName");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 60, 198, 29);
        jPanel2.add(jTextField_UserName);
        jTextField_UserName.setBounds(210, 60, 254, 38);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Password");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 110, 198, 29);

        jPasswordField_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_passwordActionPerformed(evt);
            }
        });
        jPanel2.add(jPasswordField_password);
        jPasswordField_password.setBounds(210, 110, 260, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Salary");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 340, 100, 29);

        jTextField_salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_salaryActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField_salary);
        jTextField_salary.setBounds(210, 340, 260, 38);

        jComboBox_branches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_branchesActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox_branches);
        jComboBox_branches.setBounds(210, 400, 260, 42);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("Branch");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(10, 400, 110, 29);

        jRadioButton_male.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRadioButton_male.setText("Male");
        jRadioButton_male.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton_maleMouseClicked(evt);
            }
        });
        jRadioButton_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_maleActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton_male);
        jRadioButton_male.setBounds(210, 280, 71, 29);

        jRadioButton_female.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRadioButton_female.setText("Female");
        jRadioButton_female.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton_femaleMouseClicked(evt);
            }
        });
        jRadioButton_female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_femaleActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton_female);
        jRadioButton_female.setBounds(300, 280, 133, 29);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setText("Gender");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(10, 280, 100, 29);

        jButton_signup2.setBackground(new java.awt.Color(255, 255, 255));
        jButton_signup2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton_signup2.setText("Save");
        jButton_signup2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_signup2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_signup2);
        jButton_signup2.setBounds(252, 450, 198, 36);

        jTextField_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_EmailActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField_Email);
        jTextField_Email.setBounds(210, 160, 260, 38);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Email");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 160, 198, 29);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("City");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(10, 220, 47, 29);

        jComboBox_city1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dammam", "Dhahran", "Riyadh", " " }));
        jComboBox_city1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_city1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox_city1);
        jComboBox_city1.setBounds(210, 220, 254, 42);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 490, 500));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffeshop/back_medum.jpeg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 864, 684));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_signup1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_signup1ActionPerformed
        // TODO add your handling code here:
        Operations.OpenNew(this, new Managment());
    }//GEN-LAST:event_jButton_signup1ActionPerformed

    private void jTextField_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nameActionPerformed

    private void jPasswordField_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_passwordActionPerformed

    private void jTextField_salaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_salaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_salaryActionPerformed

    private void jComboBox_branchesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_branchesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_branchesActionPerformed

    private void jRadioButton_maleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton_maleMouseClicked
        // TODO add your handling code here:
        if (jRadioButton_male.isSelected()) {
            jRadioButton_female.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton_maleMouseClicked

    private void jRadioButton_maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_maleActionPerformed

    private void jRadioButton_femaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton_femaleMouseClicked
        // TODO add your handling code here:
        if (jRadioButton_female.isSelected()) {
            jRadioButton_male.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton_femaleMouseClicked

    private void jRadioButton_femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_femaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_femaleActionPerformed

    private void jButton_signup2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_signup2ActionPerformed
        // TODO add your handling code here:
        if ((jTextField_UserName.getText().toString().equals(""))
                || (jTextField_name.getText().toString().equals(""))
                || (jTextField_salary.getText().toString().equals(""))
                || (jPasswordField_password.getText().toString().equals(""))) {
            Operations.openRequied();
        } else {
            Employee customer = new Employee();
            customer.setEmployeeName(jTextField_name.getText().toString());
            try {
                customer.setEmail(jTextField_Email.getText());
            } catch (Exception exception) {
                Operations.openErrorIntRequied();
                return;
            }
            if ((!jRadioButton_male.isSelected()) && (jRadioButton_male.isSelected())) {
                Operations.openErrorGenderRequied();
                return;
            }
            char gender = 'M';
            if (jRadioButton_male.isSelected()) {
                customer.setGender('M');
            } else {
                customer.setGender('F');
            }
            try {
                customer.setSalary(Integer.parseInt(jTextField_salary.getText().toString()));
            } catch (Exception s) {
                Operations.openErrorIntRequied();
            }
            customer.setBranchNo(list.get(jComboBox_branches.getSelectedIndex()).getBranchNo());
            customer.setCity(jComboBox_branches.getSelectedItem().toString());
            UserCoffe userCoffe = new UserCoffe(jTextField_UserName.getText().toString(), jPasswordField_password.getText().toString(), 1, 1);
            customer.setUserCoffe(userCoffe);
            try {
                int id = customer.addNew();
                userCoffe.setCustomerId(id);
                userCoffe.setRole(3);
                userCoffe.addNew();
                Operations.SuccessRegisterEmp();
            } catch (Exception exception) {
                Operations.openErrorDataBase();
            }
        }
    }//GEN-LAST:event_jButton_signup2ActionPerformed

    private void jTextField_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_EmailActionPerformed

    private void jComboBox_city1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_city1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_city1ActionPerformed

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
            java.util.logging.Logger.getLogger(AddEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new AddEmp().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_signup1;
    private javax.swing.JButton jButton_signup2;
    private javax.swing.JComboBox<String> jComboBox_branches;
    private javax.swing.JComboBox<String> jComboBox_city1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField_password;
    private javax.swing.JRadioButton jRadioButton_female;
    private javax.swing.JRadioButton jRadioButton_male;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_UserName;
    private javax.swing.JTextField jTextField_name;
    private javax.swing.JTextField jTextField_salary;
    // End of variables declaration//GEN-END:variables
}
