package com.bootcamp_new.sales;

import com.bootcamp_new.sales.product.BookProduct;
import com.bootcamp_new.sales.product.OtherProduct;
import com.bootcamp_new.sales.product.Product;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
  @Test
  public void cartShouldGenerateReceiptFor() {
//    •	1 book at 12.49
//•	1 music CD at 14.99
//•	1 chocolate bar at 0.85
    Product book = new BookProduct(12.49,false);
    Product music = new OtherProduct(14.99, false);
    Product chocolateBar = new OtherProduct(0.85, false);

    Cart cart = new Cart();
    cart.addItem(book);
    cart.addItem(music);
    cart.addItem(chocolateBar);

    assertEquals(cart.total(), 29.83, 0.01);

  }
}
