package com.example.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Category")

public class Category {

    public Category(){
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    private String categoryName;

//    @OneToMany(mappedBy = "category")
//    private Set<Product> products;

    public long getId() {
        return id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

//    public Set<Product> getProducts() {
//        return products;
//    }
//
//    public void setProducts(Set<Product> products) {
//        this.products = products;
//    }
}
