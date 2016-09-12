package com.bootcamp.sales;

import java.util.ArrayList;
import java.util.List;

public class Cart {
  private List<CartItem> cartItems;

  public Cart() {
    this.cartItems = new ArrayList<CartItem>();
  }

  public void add(CartItem cartItem) {
    this.cartItems.add(cartItem);
  }

  public double getTotal() {
    double total = 0.0;
    for (CartItem cartItem : cartItems) {
      total = total + cartItem.price();
    }
    return total;
  }

  public double getTotalTax() {
    double totalTax = 0.0;
    for (CartItem cartItem : cartItems) {
      totalTax = totalTax + cartItem.tax();
    }
    return totalTax;
  }

}
