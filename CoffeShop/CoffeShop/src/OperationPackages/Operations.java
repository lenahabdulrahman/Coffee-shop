package OperationPackages;

import coffeshop.HomePage;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public  class Operations {
    
    public static void OpenHome()
    {

       
        HomePage home = new HomePage();
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home.setMinimumSize(new Dimension(800, 650));
        home.setSize(800, 650);
        home.setVisible(true);
    }
    
    
    public static void OpenNew(JFrame current ,JFrame newf)
    {
       current.dispose();
        newf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newf.setMinimumSize(new Dimension(800, 650));
        newf.setSize(800, 650);
        newf.setVisible(true);
    }
    public static void openRequied()
    {
         JOptionPane.showMessageDialog(null,("Please add all text!"), "Error", JOptionPane.ERROR_MESSAGE);
    }
    public static void openErrorIntRequied()
    {
        JOptionPane.showMessageDialog(null,("Please Enter Number in contact!"), "Error", JOptionPane.ERROR_MESSAGE); 
    }
    public static void openErrorDataBase()
    {
        JOptionPane.showMessageDialog(null,("Cant open database"), "Error", JOptionPane.PLAIN_MESSAGE); 
    }
    public static void openFailedLogin()
    {
         JOptionPane.showMessageDialog(null,("Please Make Sure of username and password"), "Error", JOptionPane.PLAIN_MESSAGE);
    }
    public static void openErrorGenderRequied()
    {
         JOptionPane.showMessageDialog(null,("Please select Gender"), "Error", JOptionPane.PLAIN_MESSAGE);
    }
     public static void SuccessRegister()
    {
         JOptionPane.showMessageDialog(null,("Customer Registerd Successfully"), "Success", JOptionPane.PLAIN_MESSAGE);
    }
      public static void openSuccessLogin()
    {
         JOptionPane.showMessageDialog(null,("Hello, "+OperationsGlobals.userCoffe.getCustomerName()), "Success", JOptionPane.PLAIN_MESSAGE);
    }
     public static void SuccessAdded()
     {
        JOptionPane.showMessageDialog(null,("Added Successfully"), "Success", JOptionPane.INFORMATION_MESSAGE);  
     }
     public static void SuccessUpdated()
     {
        JOptionPane.showMessageDialog(null,("Updatted Successfully"), "Success", JOptionPane.INFORMATION_MESSAGE);  
     }
      public static void SuccessRegisterEmp()
     {
        JOptionPane.showMessageDialog(null,("Emp added Successfully"), "Success", JOptionPane.PLAIN_MESSAGE);  
     }
      public static void SuccessAddedOrder()
     {
        JOptionPane.showMessageDialog(null,("Bill added Successfully"), "Success", JOptionPane.PLAIN_MESSAGE);  
     }
       public static void SuccessSaved(String msg)
     {
        JOptionPane.showMessageDialog(null,(msg), "Great", JOptionPane.PLAIN_MESSAGE);  
     }
     public static void cartEmpty()
     {
        JOptionPane.showMessageDialog(null,("Your cart is empty"), "Great", JOptionPane.QUESTION_MESSAGE);  
     }
     
     
}
