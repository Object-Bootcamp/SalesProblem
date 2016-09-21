package com.bootcamp_new.sales;


import com.bootcamp_new.sales.taxStrategy.NoTaxStrategy;

public class ProductBook extends Product {

  public ProductBook(double price) {
    super(price);
    this.taxStrategy = new NoTaxStrategy();
  }
}
