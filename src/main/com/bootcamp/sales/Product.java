package com.bootcamp.sales;

public class Product {
    private final String name;
    private final double price;
    private boolean imported;


    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.imported = false;
    }

    public double getPrice() {
        return price;
    }

    public void markAsImported() {
        this.imported = true;
    }
}
