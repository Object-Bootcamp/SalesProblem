package com.bootcamp_new.sales.product;

import com.bootcamp_new.sales.taxStrategy.TaxStrategy;

public abstract class Product {

  protected TaxStrategy taxStrategy;
  private double price;
  private boolean imported;

  public Product(double price, boolean imported) {
    this.imported = imported;
    this.price = price;
  }

  public double tax() {
    return this.price * this.taxStrategy.getTax();
  }

  public double priceInclusiveTax() {
    return this.price + this.tax() + getImportedTax();
  }

  private double getImportedTax() {
    double tax = 0.0;
    if (this.imported)
      tax = this.price * 0.05;
    return tax;
  }

  public void imported() {
    this.imported = true;
  }

  public double price() {
    return this.price;
  }

}
