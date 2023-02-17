package OperationPackages;

import java.sql.*;
import java.util.ArrayList;

public class Branches {
    private int BranchNo;
    private String city;
    private String contactNo;

    public Branches() {
    }

    public Branches(int BranchNo, String city, String contactNo) {
        this.BranchNo = BranchNo;
        this.city = city;
        this.contactNo = contactNo;
    }

    public int getBranchNo() {
        return BranchNo;
    }
    
    public void setBranchNo(int BranchNo) {
        this.BranchNo = BranchNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
   public static ArrayList<Branches>selectAll()
    {
         ArrayList<Branches>brancheses=new ArrayList<>();
          Connection conn = DBConnect.DBConnect();
        Statement stmt = null;
        
        try {
          
           stmt = conn.createStatement();
           
     
           String sql2 = "select * from branchs";
                try {
                    PreparedStatement pst1;
                    
                    pst1 = conn.prepareStatement(sql2);
                  
                    ResultSet rsr = pst1.executeQuery();

                    while (rsr.next()) {
                        
                        int id =  rsr.getInt("BranchNo");
                        String city=rsr.getString("City");
                        String Contactdo=rsr.getString("ContactNo");
                      Branches branches=new Branches(id, city, Contactdo);
                      brancheses.add(branches);
                    }
                    }
                 catch (SQLException ex) {
                  
                }
         
          
           
       } catch(Exception ex) {
          
       }
         return brancheses;
    }
           
    
}
