package OperationPackages;

import java.sql.Connection;
import java.sql.Statement;

public class BillDetails {

    private int detailsId;
    private int orderId;
    private int productId;
    private double quantity;

    public BillDetails() {
    }

    public BillDetails(int detailsId, int orderId, int productId, double quantity) {
        this.detailsId = detailsId;
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
    }

    public int getDetailsId() {
        return detailsId;
    }

    public void setDetailsId(int detailsId) {
        this.detailsId = detailsId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void AddNew(int idBill) {
        int id = 0;
        Connection conn = DBConnect.DBConnect();
        Statement stmt = null;
        String sql = "INSERT INTO billdetails(ProudctsNo, quantity, billNo) VALUES(" + this.productId + "," + this.quantity + "," + idBill + ")";
        try {

            stmt = conn.createStatement();

            if (stmt.executeUpdate(sql) == 1) {

            } else {

            }

        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
    }
}
