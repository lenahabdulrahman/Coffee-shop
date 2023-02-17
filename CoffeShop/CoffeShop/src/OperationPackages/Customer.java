package OperationPackages;

import java.sql.*;

public class Customer {
    private int CustomerID;
    private String CustomerName;
    private int ContactNo;
    private int BillNo;
    private String City;
    private UserCoffe userCoffe;
    private char gender;
     
    public Customer() {
    }

    public Customer(int CustomerID, String CustomerName, int ContactNo, int BillNo, String City, UserCoffe userCoffe, char gender) {
        this.CustomerID = CustomerID;
        this.CustomerName = CustomerName;
        this.ContactNo = ContactNo;
        this.BillNo = BillNo;
        this.City = City;
        this.userCoffe = userCoffe;
        this.gender = gender;
    }

    
    
    
    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int CustomerID) {
        this.CustomerID = CustomerID;
    }

    /**
     * @return the CustomerName
     */
    public String getCustomerName() {
        return CustomerName;
    }

    /**
     * @param CustomerName the CustomerName to set
     */
    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    /**
     * @return the ContactNo
     */
    public int getContactNo() {
        return ContactNo;
    }

    /**
     * @param ContactNo the ContactNo to set
     */
    public void setContactNo(int ContactNo) {
        this.ContactNo = ContactNo;
    }

   
    public int getBillNo() {
        return BillNo;
    }

  
    public void setBillNo(int BillNo) {
        this.BillNo = BillNo;
    }

  
    public String getCity() {
        return City;
    }

   
    public void setCity(String City) {
        this.City = City;
    }

    
    public UserCoffe getUserCoffe() {
        return userCoffe;
    }

   
    public void setUserCoffe(UserCoffe userCoffe) {
        this.userCoffe = userCoffe;
    }
   public int addNew()
    {
        int id=0;
        Connection conn = DBConnect.DBConnect();
        Statement stmt = null;
         String sql = "INSERT INTO Customers(CustomerName, Gender, PhomeNo,City) VALUES('"+this.CustomerName+"','"+this.getGender()+"','"+this.getContactNo()+"','"+this.getCity()+"')";
        try {
          
           stmt = conn.createStatement();
           stmt.executeUpdate(sql);
           String sql2 = "select CustomerID from Customers order by CustomerID desc";

                try {
                    PreparedStatement pst1;
                    pst1 = conn.prepareStatement(sql2);

                    ResultSet rsr = pst1.executeQuery();

                    if (rsr.next()) {
                        id = (int) rsr.getLong(1);
                    }
                } catch (SQLException ex) {
                    id = 0;
                }
         
          
           
       } catch(Exception ex) {
           System.out.println("Error: "+ex);
       }
        return id;
    }

    /**
     * @return the gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(char gender) {
        this.gender = gender;
    }
    
      public static ResultSet SelectAll() {
        ResultSet rs = null;
       Connection conn = DBConnect.DBConnect();
        Statement stmt = null;
        try {
         
            if (conn != null) {

                String sql = "select * from Customers";
                PreparedStatement pst = null;
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
              

            }

        } catch (Exception e) {

        }
        return rs;
    }    
}
