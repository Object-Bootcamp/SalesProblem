package com.bootcamp_new.sales.product;


import com.bootcamp_new.sales.taxStrategy.NoTaxStrategy;

public class BookProduct extends Product {

  public BookProduct(double price, boolean imported) {
    super(price, imported);
    this.taxStrategy = new NoTaxStrategy();
  }
}
