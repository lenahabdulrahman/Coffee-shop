package OperationPackages;

import java.util.Date;

public class ImportProduct {

     private int ProductNo;
    private String ProductName;
    private String ImportingCountry;
    private int Weight;
    private Date ExpireDate;

    public ImportProduct() {
    }

    public ImportProduct(int ProductNo, String ProductName, String ImportingCountry, int Weight, Date ExpireDate) {
        this.ProductNo = ProductNo;
        this.ProductName = ProductName;
        this.ImportingCountry = ImportingCountry;
        this.Weight = Weight;
        this.ExpireDate = ExpireDate;
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

    public String getImportingCountry() {
        return ImportingCountry;
    }

    public void setImportingCountry(String ImportingCountry) {
        this.ImportingCountry = ImportingCountry;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int Weight) {
        this.Weight = Weight;
    }

    public Date getExpireDate() {
        return ExpireDate;
    }

    public void setExpireDate(Date ExpireDate) {
        this.ExpireDate = ExpireDate;
    }
   
    
}