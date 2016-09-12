package com.bootcamp.sales;

public abstract class Product {

  protected final double price;

  public Product(double price) {
    this.price = price;
  }

  abstract public double price();

  public abstract double tax();
}
