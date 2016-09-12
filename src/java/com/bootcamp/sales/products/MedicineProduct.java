package com.bootcamp.sales.products;

public class MedicineProduct extends Product {
  public static final double TAX_CHARGE = 0.10;

  public MedicineProduct(double price) {
    super(price);
  }

  @Override
  public double tax() {
    return this.price * TAX_CHARGE ;
  }
}
