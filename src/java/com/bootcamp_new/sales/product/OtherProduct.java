package com.bootcamp_new.sales.product;

import com.bootcamp_new.sales.taxStrategy.BasicSalesTaxStrategy;

public class OtherProduct extends Product {
  public OtherProduct(double price, boolean imported) {
    super(price, imported);
    this.taxStrategy = new BasicSalesTaxStrategy();
  }
}
