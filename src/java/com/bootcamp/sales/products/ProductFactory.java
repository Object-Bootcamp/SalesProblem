package com.bootcamp.sales;

public class ProductFactory {


  public static Product Book(double price) {
    return new BookProduct(price);
  }
}
