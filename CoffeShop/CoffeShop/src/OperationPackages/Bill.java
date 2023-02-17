package OperationPackages;

import java.sql.*;
import java.util.Date;

public class Bill {

    private int BillNo;
    private Date PurchaseDate;
    private String ProductName;
    private int Price;
    private double Tax;
    private double Total;
    private String Location;
    private int custId;

    public Bill() {
    }

    public Bill(int BillNo, Date PurchaseDate, String ProductName, int Price, double Tax, double Total, String Location, int custId) {
        this.BillNo = BillNo;
        this.PurchaseDate = PurchaseDate;
        this.ProductName = ProductName;
        this.Price = Price;
        this.Tax = Tax;
        this.Total = Total;
        this.Location = Location;
        this.custId = custId;
    }

    public int getBillNo() {
        return BillNo;
    }

    public void setBillNo(int BillNo) {
        this.BillNo = BillNo;
    }

    public Date getPurchaseDate() {
        return PurchaseDate;
    }

    public void setPurchaseDate(Date PurchaseDate) {
        this.PurchaseDate = PurchaseDate;
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

    public double getTax() {
        return Tax;
    }

    public void setTax(double Tax) {
        this.Tax = Tax;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public int AddBill() {
        int billId = 0;

        try {
            Bill item = this;
            Connection conn = DBConnect.DBConnect();
            Statement stmt = null;
            String sql = "INSERT INTO bills(PurchaseDate, Tax,TotalPrice,BranchNum,CustId) VALUES('" + this.PurchaseDate + "'," + this.getTax()
                    + "," + this.getTotal() + "," + this.getBillNo() + "," + this.getCustId() + ")";

            stmt = conn.createStatement();

            if (stmt.executeUpdate(sql) == 1) {

            } else {

            }
            String sql2 = "select BiilNo from bills order by BiilNo desc";

            try {
                PreparedStatement pst1;
                pst1 = conn.prepareStatement(sql2);

                ResultSet rsr = pst1.executeQuery();

                if (rsr.next()) {
                    billId = (int) rsr.getLong(1);
                }
            } catch (SQLException ex) {

            }

            return billId;

        } catch (Exception we) {

        }
        return billId;
    }

    public static ResultSet SelectBillsById(int id) {
        ResultSet rs = null;
        Connection conn = DBConnect.DBConnect();

        try {

            if (conn != null) {

                String sql = "select * from Bills where CustID =" + id;
                PreparedStatement pst1;

                pst1 = conn.prepareStatement(sql);

                rs = pst1.executeQuery();

            }

        } catch (Exception e) {

        }
        return rs;
    }

    public static ResultSet SelectAll() {
        ResultSet rs = null;
        Connection conn = DBConnect.DBConnect();

        try {

            if (conn != null) {

                String sql = "select * from Bills";
                PreparedStatement pst1;

                pst1 = conn.prepareStatement(sql);

                rs = pst1.executeQuery();

            }

        } catch (Exception e) {

        }
        return rs;
    }

}
