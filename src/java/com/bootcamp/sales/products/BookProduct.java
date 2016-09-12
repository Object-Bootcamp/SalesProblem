package com.bootcamp.sales;

public class BookProduct extends Product {
  public static final double TAX_CHARGE = 0.10;
  private double tax;


  public BookProduct(double price) {
    super(price);
  }

  public double price() {
    return price + this.tax() ;
  }

  public double tax() {
    this.tax = price * TAX_CHARGE;
    return tax;
  }
}
