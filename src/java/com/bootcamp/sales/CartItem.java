package com.bootcamp.sales;

import com.bootcamp.sales.products.Product;

public class CartItem {

  private final Product product;
  private final int quantity;

  public CartItem(Product product, int quantity) {
    this.product = product;
    this.quantity = quantity;
  }

  public double price() {
    return product.price() * quantity;
  }

  public double tax() {
    return product.tax();
  }
}

