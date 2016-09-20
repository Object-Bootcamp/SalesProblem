package com.bootcamp.sales;

import com.bootcamp.sales.products.Product;
import com.bootcamp.sales.products.ProductFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReceiptTest {

  @Test
  public void shouldBeAbleToPurchaseSingleProduct() {
    Product book = ProductFactory.Book(12.49);
    Cart cart = new Cart();
    cart.add(new CartItem(book, 1));
    Receipt receipt = Inventory.purchase(cart);

    assertEquals(receipt.amount(), 13.73, 0.01);
    assertEquals(receipt.tax(), 1.24, 0.01);
  }

  @Test
  public void shouldBeAbleToPurchaseMultipleProducts() {
    Product book = ProductFactory.Book(12.49);
    Product medicine = ProductFactory.Medicine(10.49);
    Cart cart = new Cart();
    cart.add(new CartItem(book, 1));
    cart.add(new CartItem(medicine, 1));
    Receipt receipt = Inventory.purchase(cart);

    assertEquals(receipt.amount(), 13.73, 0.01);
    assertEquals(receipt.tax(), 1.24, 0.01);


  }
}

