package com.bootcamp.sales.products;

public class ProductFactory {

  public static Product Book(double price) {
    return new BookProduct(price);
  }

  public static Product Medicine(double price) {
    return new MedicineProduct(price);
  }
}
