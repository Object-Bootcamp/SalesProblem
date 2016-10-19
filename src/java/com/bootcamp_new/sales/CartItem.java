package com.bootcamp_new.sales;

import com.bootcamp_new.sales.product.Product;

public class CartItem {
  private final Product product;
  private final int quantity;

  public CartItem(Product product, int quantity) {
    this.product = product;
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return "CartItem{" +
        "product=" + product +
        ", quantity=" + quantity +
        '}';
  }
}
