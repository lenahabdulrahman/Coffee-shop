package OperationPackages;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JFrame;


public class Products {

   private int  ProductNo;
   private String ProductName;
   private int Price;
   private String className;
   public int productsQuantity=0;
    public Products() {
    }

    public Products(int ProductNo, String ProductName, int Price) {
        this.ProductNo = ProductNo;
        this.ProductName = ProductName;
        this.Price = Price;
    }
    public int getProductNo() {
        return ProductNo;
    }

   
    public void setProductNo(int ProductNo) {
        this.ProductNo = ProductNo;
    }

   
    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public int getPrice() {
        return Price;
    }

 
    public void setPrice(int Price) {
        this.Price = Price;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
  
  public  void  AddNew(JFrame frame)
    {
        Connection conn = DBConnect.DBConnect();
        Statement stmt = null;
         String sql = "INSERT INTO products(ProductName, price, className) VALUES('"+this.ProductName+"',"+this.Price+",'"+this.className+"'"+")";
        try {
          
           stmt = conn.createStatement();
           
          stmt.executeUpdate(sql);
            
         Operations.SuccessAdded();
           
       } catch(Exception ex) {
           System.out.println("Error: "+ex);
       }
    }
  
  
    public static ResultSet SelectProducts() {
        ResultSet rs = null;
       Connection conn = DBConnect.DBConnect();
        Statement stmt = null;
        try {
         
            if (conn != null) {

                String sql = "select * from Products";
                PreparedStatement pst = null;
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
              

            }

        } catch (Exception e) {

        }
        return rs;
    }
   public void getProductById(int id)
    {
        Connection conn = DBConnect.DBConnect();
        Statement stmt = null;
        
        try {
          
           stmt = conn.createStatement();
           
     
 String sql2 = "select * from Products where ProudctsNo="+id;
                try {
                    PreparedStatement pst1;
                    
                    pst1 = conn.prepareStatement(sql2);
                  
                    ResultSet rsr = pst1.executeQuery();

                    if (rsr.next()) {
                        id = id;
                        int price =  rsr.getInt("Price");
                        String name=rsr.getString("ProductName");
                        String className=rsr.getString("className");
                       this.setProductNo(id);
                       this.setProductName(name);
                       this.setPrice(price);
                       this.setClassName(className);
                    }
                    }
                 catch (SQLException ex) {
                  
                }
         
          
           
       } catch(Exception ex) {
          
       }
      
        
    }
   
   public void UpdateProd()
   {
        Connection conn = DBConnect.DBConnect();
        Statement stmt = null;

        
        
         String sql = "UPDATE products SET ProductName='"+this.ProductName+"', className='"+this.className+"', price='"+this.Price+"' WHERE ProudctsNo = "+this.ProductNo+"";
        try {
          
           stmt = conn.createStatement();
           
          if(stmt.executeUpdate(sql) == 1){
            
          } else {
              
          }
            Operations.SuccessUpdated();
       } catch(Exception ex) {
           System.out.println("Error: "+ex);
       }
   }
  public static ArrayList<Products> SelectAllList()
    {
         ArrayList<Products>arrayList=new ArrayList<>();
          ResultSet rs = null;
       Connection conn = DBConnect.DBConnect();
        Statement stmt = null;
        try {
         
            if (conn != null) {

                String sql = "select * from products";
                PreparedStatement pst = null;
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
              
                  while (rs.next()) {
                        
                        Products products=new Products();
                        int price =  rs.getInt("price");
                        int id =  rs.getInt("ProudctsNo");
                        String name=rs.getString("ProductName");
                        String className=rs.getString("className");
                       products.setProductNo(id);
                       products.setProductName(name);
                       products.setPrice(price);
                       products.setClassName(className);
                       arrayList.add(products);
                    }
            }

        } catch (Exception e) {

        }
        
         return arrayList;
    }
            
}