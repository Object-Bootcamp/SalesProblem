package com.bootcamp_new.sales.product;

import com.bootcamp_new.sales.taxStrategy.NoTaxStrategy;

public class MedicineProduct extends Product {
  public MedicineProduct(double price, boolean imported) {
    super(price, imported);
    this.taxStrategy = new NoTaxStrategy();
  }
}
