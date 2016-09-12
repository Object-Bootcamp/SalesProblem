package com.bootcamp.sales.products;

public abstract class Product {

  protected final double price;

  public Product(double price) {
    this.price = price;
  }

  public double price() {
    return this.price * this.tax();
  }

  public abstract double tax();
}
