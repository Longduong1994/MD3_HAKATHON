package ra.model;

import ra.config.Config;

public class Catalog {
    private int catalogId;
    private String catalogName;

    public Catalog() {
    }

    public Catalog(int catalolId, String catalogName) {
        this.catalogId = catalolId;
        this.catalogName = catalogName;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public void  inputData(){
        System.out.println("Nhập ID:");
        this.catalogId = Config.getInteger();
        System.out.println("Nhập Name:");
        this.catalogName = Config.getString();
    }
    public void displayData(){
        System.out.println("-------------------------------------");
        System.out.println("||" +
                " catalolId: " + catalogId +
                "  catalogName: " + catalogName +
                "||");
    }

    @Override
    public String toString() {
        return "||" +
                " catalolId: " + catalogId +
                "  catalogName: " + catalogName +
                "||";
    }
}
