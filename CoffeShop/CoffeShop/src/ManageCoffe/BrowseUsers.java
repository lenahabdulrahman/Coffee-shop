package ManageCoffe;

import OperationPackages.Customer;
import OperationPackages.Employee;
import OperationPackages.Operations;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class BrowseUsers extends javax.swing.JFrame {

    public BrowseUsers() {
        super("Customers List");
        initComponents();
         Browse();
        
    }
 void Browse()
    {
         try
        {
        ProductsTbl1.setModel(DbUtils.resultSetToTableModel(Customer.SelectAll())); 
        }
        catch(Exception e)
        {
         JOptionPane.showMessageDialog(null,("Error access to datbase :("), "Error", JOptionPane.PLAIN_MESSAGE,new ImageIcon(getClass().getResource("../smallLogo.png")));
        }
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
        jButton_signup1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ProductsTbl1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 305, -1, -1));

        jButton_signup1.setBackground(new java.awt.Color(255, 255, 255));
        jButton_signup1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton_signup1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffeshop/home.png"))); // NOI18N
        jButton_signup1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_signup1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_signup1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 70, 60));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 65)); // NOI18N
        jLabel2.setText("Customers");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 396, -1));

        jPanel2.setBackground(new java.awt.Color(237, 232, 207));
        jPanel2.setLayout(null);

        ProductsTbl1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 204)));
        ProductsTbl1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        ProductsTbl1.setForeground(new java.awt.Color(0, 0, 153));
        ProductsTbl1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        ProductsTbl1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        ProductsTbl1.setDoubleBuffered(true);
        ProductsTbl1.setGridColor(new java.awt.Color(0, 51, 102));
        ProductsTbl1.setSelectionBackground(new java.awt.Color(204, 204, 204));
        ProductsTbl1.setShowHorizontalLines(false);
        ProductsTbl1.setShowVerticalLines(false);
        ProductsTbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductsTbl1mouseclick(evt);
            }
        });
        jScrollPane4.setViewportView(ProductsTbl1);

        jPanel2.add(jScrollPane4);
        jScrollPane4.setBounds(10, 20, 780, 440);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 790, 584));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffeshop/back_medum.jpeg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_signup1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_signup1ActionPerformed
        // TODO add your handling code here:
        Operations.OpenNew(this, new Managment());
    }//GEN-LAST:event_jButton_signup1ActionPerformed

    private void ProductsTbl1mouseclick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductsTbl1mouseclick
        // TODO add your handling code here:
        int row = ProductsTbl1.getSelectedRow();
        String id = (ProductsTbl1.getModel().getValueAt(row, 0).toString());

    }//GEN-LAST:event_ProductsTbl1mouseclick

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
            java.util.logging.Logger.getLogger(BrowseUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BrowseUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BrowseUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BrowseUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new BrowseUsers().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ProductsTbl1;
    private javax.swing.JButton jButton_signup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}