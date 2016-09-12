package com.bootcamp.sales;

public class Receipt {
  private final double amount;
  private final Cart cart;

  public Receipt(Cart cart) {
    this.cart = cart;
    this.amount = cart.getTotal();
  }

  public double amount() {
    return amount;
  }

  public double tax() {
    return this.cart.getTotalTax();
  }
}
