package com.bootcamp_new.sales;

import com.bootcamp_new.sales.product.Product;
import com.bootcamp_new.sales.product.ProductFactory;

public class InputParser {

  public static CartItem parse(String input) {
    String[] tokens = input.split(" ");
    int quantity = Integer.parseInt(tokens[0]);
    double price = Float.parseFloat(tokens[tokens.length - 1]);
    Product product = ProductFactory.createProduct(tokens[1], price);
    CartItem cartItem = new CartItem(product, quantity);

    return cartItem;
  }

}
