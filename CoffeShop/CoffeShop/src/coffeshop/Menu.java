package coffeshop;

import OperationPackages.Operations;
import OperationPackages.OperationsGlobals;
import OperationPackages.Products;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Timer;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.*;
import java.awt.*;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        super("Menu window");
        initComponents();
        initData();
    }
    ArrayList<Products> LoadProds;
    ArrayList<String> arrayList;
    Timer timer;
    Menu menu;

    void initData() {
        LoadProds = Products.SelectAllList();
        arrayList = new ArrayList<>();
        arrayList.add("Cup Cake");
        arrayList.add("Cheese Cake");
        arrayList.add("Donats");
        arrayList.add("Drinks");
        initProducts();
        menu = this;
        Reminder(15);

    }

    public void Reminder(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds * 1000);
    }

    class RemindTask extends TimerTask {

        public void run() {

            timer.cancel(); //Terminate the timer thread

            if (menu.isVisible()) {
                menu.dispose();
                Operations.OpenHome();
            }
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

        tblPanelwsx = new javax.swing.JPanel();
        pane = new javax.swing.JPanel();
        jButton_signup1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton_signup3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton_signup2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tblPanelwsx.setBackground(new java.awt.Color(237, 232, 207));
        tblPanelwsx.setLayout(null);

        pane.setBackground(new java.awt.Color(237, 232, 207));
        pane.setLayout(new java.awt.GridBagLayout());
        tblPanelwsx.add(pane);
        pane.setBounds(10, 10, 750, 490);

        getContentPane().add(tblPanelwsx);
        tblPanelwsx.setBounds(20, 100, 770, 510);

        jButton_signup1.setBackground(new java.awt.Color(255, 255, 255));
        jButton_signup1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton_signup1.setText("Add to Cart");
        jButton_signup1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_signup1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_signup1);
        jButton_signup1.setBounds(380, 20, 200, 60);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 65)); // NOI18N
        jLabel1.setText("Menu");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 0, 320, 100);

        jButton_signup3.setBackground(new java.awt.Color(255, 255, 255));
        jButton_signup3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton_signup3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffeshop/home.png"))); // NOI18N
        jButton_signup3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_signup3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_signup3);
        jButton_signup3.setBounds(40, 20, 70, 60);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffeshop/back_medum.jpeg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, -160, 822, 940);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 0, 0);

        jButton_signup2.setBackground(new java.awt.Color(255, 255, 255));
        jButton_signup2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton_signup2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffeshop/home.png"))); // NOI18N
        jButton_signup2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_signup2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_signup2);
        jButton_signup2.setBounds(30, 20, 70, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_signup1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_signup1ActionPerformed
        // TODO add your handling code here:
        if (OperationsGlobals.userCoffe == null) {
            Operations.OpenNew(this, new SignIn());
        } else {
            Operations.OpenNew(this, new BillFrame());
        }
    }//GEN-LAST:event_jButton_signup1ActionPerformed

    private void jButton_signup2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_signup2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_signup2ActionPerformed

    private void jButton_signup3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_signup3ActionPerformed
        // TODO add your handling code here:
        Operations.OpenNew(this, new HomePage());
    }//GEN-LAST:event_jButton_signup3ActionPerformed
    void initProducts() {

// Setup constraints to future use
        final GridBagConstraints c = new GridBagConstraints();

// Let columns to expand horizontally,
// while keeping the same width
        c.weightx = 1;

// The same for rows
        c.weighty = 1;

// Let the buttons to occupy entire cells
        c.fill = GridBagConstraints.BOTH;

        c.gridy = 0;

        for (int j = 0; j < arrayList.size(); j++) {

            JButton jb = new JButton(arrayList.get(j));
            jb.setBackground(Color.ORANGE);
            pane.add(jb, c);
            c.gridy++;
            ArrayList<Products> list = getProducts(arrayList.get(j));
            for (int i = 0; i < list.size(); i++) {

                JCheckBox jCheckBox = new JCheckBox(list.get(i).getProductName());
                jCheckBox.setSelected(getSelection(list.get(i)));

                prepareCheckbox(jCheckBox, list.get(i));
                pane.add(jCheckBox, c);
                c.gridy++;

            }
            c.gridy++;

        }

    }

    boolean getSelection(Products s) {
        for (int i = 0; i < OperationsGlobals.CartProds.size(); i++) {

            if (OperationsGlobals.CartProds.get(i).getProductNo() == s.getProductNo()) {

                return true;

            }
        }
        return false;
    }

    ArrayList<Products> getProducts(String className) {
        ArrayList<Products> classProductses = new ArrayList<>();
        for (int i = 0; i < LoadProds.size(); i++) {
            if (LoadProds.get(i).getClassName().equals(className)) {
                classProductses.add(LoadProds.get(i));
            }
        }
        return classProductses;
    }

    void prepareCheckbox(JCheckBox jCheckBox, final Products p) {
        jCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                JCheckBox cb = (JCheckBox) event.getSource();
                if (cb.isSelected()) {
                    if (OperationsGlobals.CartProds == null) {
                        OperationsGlobals.CartProds = new ArrayList<>();
                    }
                    if (!isExists(p)) {
                        OperationsGlobals.CartProds.add(p);
                    }

                } else {
                    RemoveFromCart(p);
                }
            }
        });
    }

    void RemoveFromCart(Products p) {
        for (int i = 0; i < OperationsGlobals.CartProds.size(); i++) {
            if (p.getProductNo() == OperationsGlobals.CartProds.get(i).getProductNo()) {
                OperationsGlobals.CartProds.remove(i);
                break;
            }
        }

    }

    boolean isExists(Products p) {
        for (int i = 0; i < OperationsGlobals.CartProds.size(); i++) {
            if (p.getProductNo() == OperationsGlobals.CartProds.get(i).getProductNo()) {
                return true;
            }
        }
        return false;
    }

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_signup1;
    private javax.swing.JButton jButton_signup2;
    private javax.swing.JButton jButton_signup3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pane;
    private javax.swing.JPanel tblPanelwsx;
    // End of variables declaration//GEN-END:variables
}