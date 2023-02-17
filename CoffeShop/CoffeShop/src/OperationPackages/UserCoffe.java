package OperationPackages;

import java.sql.*;


public class UserCoffe {

   
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    private String UserName;
    private String password;
    private int userId;
    private int role;
    private int customerId;
    private Customer customer;
    public UserCoffe() {
    }

    public UserCoffe(String UserName, String password, int userId, int role) {
        this.UserName = UserName;
        this.password = password;
        this.userId = userId;
        this.role = role;
    }
    
 
    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
        
   public void addNew()
    {
        int id=0;
        Connection conn = DBConnect.DBConnect();
        Statement stmt = null;
         String sql = "INSERT INTO Log_in(CustomerID, UserName, PassWord,Position) VALUES("+this.customerId+",'"+this.UserName+"','"+this.password+"',"+this.role+")";
        try {
          
           stmt = conn.createStatement();
           
          if(stmt.executeUpdate(sql) == 1){
            
          } else {
            
          }
           
       } catch(Exception ex) {
           System.out.println("Error: "+ex);
       }
       
    }
   public Customer getLoggedIn()
   {
       UserCoffe userCoffe=null;
       Customer user=null;
       int id=0;
        Connection conn = DBConnect.DBConnect();
        Statement stmt = null;
        
        try {
          
           stmt = conn.createStatement();
         
 String sql2 = "select * from log_In where UserName='"+this.UserName+"' and "+"password='"+this.password+"' and Position="+this.role; 
                try {
                    PreparedStatement pst1;
                    
                    pst1 = conn.prepareStatement(sql2);
                  
                    ResultSet rsr = pst1.executeQuery();

                    if (rsr.next()) {
                        id = (int) rsr.getInt("UserID");
                        String name=this.UserName;
                        String pass=this.password;
                        
                        int custId= (int) rsr.getInt("CustomerID");
                        userCoffe=new UserCoffe();
                        userCoffe.setUserId(id);
                        userCoffe.setUserName(name);
                        userCoffe.setPassword(pass);
                        userCoffe.setRole( rsr.getInt("Position"));
                        if(userCoffe.getRole()==3)
                        {
                            return new Customer(-1, UserName, 1, 1, "", userCoffe, 'f');
                        }
                        String sql3 = "select * from Customers where CustomerID="+custId;
                         PreparedStatement pst2;
                         pst2 = conn.prepareStatement(sql3);

                        ResultSet rsr3 = pst2.executeQuery();
                          if (rsr3.next()) {
                        
                        String custname=rsr3.getString("CustomerName");
                        int number=Integer.parseInt(rsr3.getString("PhomeNo"));
                        String gender=rsr3.getString("Gender");
                        String city=rsr3.getString("City");
                        char g='F';
                        if(gender.equals("M"))
                            g='M';
                       Customer customer=new Customer(custId, custname, number, id, city, userCoffe, g);
                        return customer;
                    }
                    }
                } catch (SQLException ex) {
                    id = 0;
                    String nn=ex.getMessage();
                    user=null;
                }
         
          
           
       } catch(Exception ex) {
           System.out.println("Error: "+ex);
            user=null;
       }
       return user;
   }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
