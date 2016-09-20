package com.bootcamp_new.sales;

import com.bootcamp_new.sales.taxStrategy.BasicSalesTaxStrategy;

public class OtherProduct extends Product {
  public OtherProduct(double price) {
    super(price);
    this.taxStrategy = new BasicSalesTaxStrategy();
  }
}
