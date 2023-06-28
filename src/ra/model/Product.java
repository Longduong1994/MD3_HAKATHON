package ra.model;

import ra.config.Config;

import java.util.List;

public class Product {
    private String productId;
    private String productName;
    private double productPrice;
    private String description;
    private int stock;
    private Catalog catalog;
    private boolean status = true;

    public Product() {
    }

    public Product(String productId, String productName, double productPrice, String description, int stock, Catalog catalog, boolean status) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.description = description;
        this.stock = stock;
        this.catalog = catalog;
        this.status = status;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void inputData(List<Catalog> catalogs) {
        System.out.println("Nhập ID:");
        this.productId = Config.getProductID();
        System.out.println("Nhập Name:");
        this.productName = Config.getString();
        System.out.println("Nhập Price:");
        this.productPrice = Config.getDouble();
        System.out.println("Nhập Descripsion:");
        this.description = Config.getString();
        System.out.println("Nhập Stock:");
        this.stock = Config.getInteger();
        for (Catalog catalog : catalogs) {
            if(catalog!=null ){
                System.out.println("--------------------------------------------------");
                System.out.println("ID: " + catalog.getCatalogId()+ " Name:  " + catalog.getCatalogName());
            }
        }

        System.out.println("Chọn Catalog theo ID:");
        while (true){
            int id = Config.getInteger();
            boolean flag = false;
            for (Catalog catalog : catalogs){
                if(catalog!=null && catalog.getCatalogId()==id){
                    flag =true;
                    this.catalog = catalog;
                    break;
                }
            }
            if(!flag){
                System.out.println("ID không đúng, vui lòng nhập lại!!!");
            }else {
                break;
            }
        }
    }
    public void displayData(){
        System.out.println("-----------------------------------------");
        System.out.println( "||" +
                "productId: " + productId +
                " productName: " + productName +
                " productPrice: "+ productPrice +
                " description:" + description +
                " stock: " + stock +
                " catalog: " + catalog +
                " status: " + status +
                "||");
    }

    @Override
    public String toString() {
        return "||" +
                "productId: " + productId +
                " productName: " + productName +
                " productPrice: "+ productPrice +
                " description:" + description +
                " stock: " + stock +
                " catalog: " + catalog +
                " status: " + status +
                "||";
    }
}
