package com.bootcamp_new.sales;

import com.bootcamp_new.sales.taxStrategy.TaxStrategy;

public abstract class Product {

  protected TaxStrategy taxStrategy;
  private double price;

  public Product(double price) {
    this.price = price;
  }

  public double price() {
    return price;
  }

  public double tax() {
    return this.price * this.taxStrategy.getTax();
  }

  public double priceInclusiveTax(){
    return this.price + this.tax();
  }
}
