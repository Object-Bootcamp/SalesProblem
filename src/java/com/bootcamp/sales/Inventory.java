package com.bootcamp.sales;

public class Inventory {
  public static Receipt purchase(Cart cart) {

    return new Receipt(cart);
  }
}
