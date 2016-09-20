package com.bootcamp_new.sales;

import com.bootcamp_new.sales.taxStrategy.NoTaxStrategy;

public class ProductMedicine extends Product {
  public ProductMedicine(double price) {
    super(price);
    this.taxStrategy = new NoTaxStrategy();
  }
}
