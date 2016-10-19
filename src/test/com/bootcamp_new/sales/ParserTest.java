package com.bootcamp_new.sales;

import com.bootcamp_new.sales.product.ProductFactory;
import org.junit.Test;

public class ParserTest {
  @Test
  public void shouldParseInput()  {
    String input = "1 book at 12.49";
    ProductFactory.builldWordMapper();

    CartItem cartItem = InputParser.parse(input);
    System.out.println(cartItem);
  }
}
