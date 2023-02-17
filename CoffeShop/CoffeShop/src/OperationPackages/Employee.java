package OperationPackages;

import java.sql.*;


public class Employee {

   
    private String EmployeeName;
    private int EmployeeID;
    private String Email;
    private String Address;
    private int PositionNo;
    private int Salary;
    private int BranchNo;
    private char gender;
    private String city;
    private UserCoffe userCoffe;
    public Employee() {
    }

    public Employee(String EmployeeName, int EmployeeID, String Email, String Address, int PositionNo, int Salary, int BranchNo, char gender, String city) {
        this.EmployeeName = EmployeeName;
        this.EmployeeID = EmployeeID;
        this.Email = Email;
        this.Address = Address;
        this.PositionNo = PositionNo;
        this.Salary = Salary;
        this.BranchNo = BranchNo;
        this.gender = gender;
        this.city = city;
    }

    
    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String EmployeeName) {
        this.EmployeeName = EmployeeName;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getPositionNo() {
        return PositionNo;
    }

    public void setPositionNo(int PositionNo) {
        this.PositionNo = PositionNo;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    public int getBranchNo() {
        return BranchNo;
    }

    public void setBranchNo(int BranchNo) {
        this.BranchNo = BranchNo;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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
         String sql = "INSERT INTO employees(EmployeeName, Gender, Email,City,Salaray,BranchNum) VALUES('"+this.EmployeeName+"','"+this.getGender()
                 +"','"+this.getEmail()+"','"+this.getCity()+"',"+this.Salary+","+this.BranchNo+")";
        try {
          
           stmt = conn.createStatement();
           stmt.executeUpdate(sql);
           String sql2 = "select EmployeeID from employees order by EmployeeID desc";

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
      
      
      
       public static ResultSet SelectAll() {
        ResultSet rs = null;
       Connection conn = DBConnect.DBConnect();
        Statement stmt = null;
        try {
         
            if (conn != null) {

                String sql = "select * from employees";
                PreparedStatement pst = null;
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
              

            }

        } catch (Exception e) {

        }
        return rs;
    }    
}
