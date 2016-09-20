package com.bootcamp_new.sales;

import com.bootcamp_new.sales.taxStrategy.NoTaxStrategy;

public class FoodProduct extends Product {
  public FoodProduct(double price) {
    super(price);
    this.taxStrategy = new NoTaxStrategy();
  }
}
