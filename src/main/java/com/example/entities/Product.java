package com.example.entities;

import javax.persistence.*;

@Entity
@Table(name = "Product")
public class Product {

    public Product(){
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    private String productName;

//    @ManyToOne
//    @JoinColumn(name = "categoryId")
//    private Category category;
    private long categoryId;
    private double price;
    private String description;
    private String picturePath;

    public long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

//    public Category getCategory() {
//        return category;
//    }
//
//    public void setCategory(Category category) {
//        this.category = category;
//    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }
}
