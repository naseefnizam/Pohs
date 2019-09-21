package com.example.pohs.DashBoard.Modals;

public class UploadModal {
    private String id;
    private  String ProductName;
    private  String ProductID;
    private  String ProductSize;
    private  String ProductType;
    private  String ProductPrice;
    private  String Descreption;



    public UploadModal(){

    }

    public UploadModal(String productName, String productID, String productSize, String productType, String productPrice, String descreption,String id) {
        ProductName = productName;
        ProductID = productID;
        ProductSize = productSize;
        ProductType = productType;
        ProductPrice = productPrice;
        Descreption = descreption;
    }

    public String getProductName() {
        return ProductName;
    }

    public String getProductID() {
        return ProductID;
    }

    public String getProductSize() {
        return ProductSize;
    }

    public String getProductType() {
        return ProductType;
    }

    public String getProductPrice() {
        return ProductPrice;
    }

    public String getDescreption() {
        return Descreption;
    }

    public String getId() {
        return id;
    }
}
