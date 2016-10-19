package com.bootcamp_new.sales;

import com.bootcamp_new.sales.product.*;
import java.util.ArrayList;

public class Cart {

  private final ArrayList<Product> bucket;

  public Cart() {
    this.bucket = new ArrayList<>();
  }

  public void addItem(Product product) {
    this.bucket.add(product);
  }

  public int size() {
    return this.bucket.size();
  }

  public double total() {
    double total = 0;
    for (Product product : bucket) {
      total = total + product.price();
    }
    return total;
  }

  public double tax() {
    double tax = 0;
    for (Product product : bucket) {
      tax = tax + product.tax();
    }
    return tax;

  }
}
