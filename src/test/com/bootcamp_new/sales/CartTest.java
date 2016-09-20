package com.bootcamp_new.sales;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CartTest {

  @Test
  public void shouldBeAbleToAddItemToCart() {
    Product product = mock(Product.class);
    Cart cart = new Cart();
    cart.addItem(product);
    assertEquals(cart.size(), 1);
  }

  @Test
  public void shouldBeAbleToGetTotalForSingleProduct() {
    Product product = mock(Product.class);
    when(product.price()).thenReturn(10.12);

    Cart cart = new Cart();
    cart.addItem(product);
    assertEquals(cart.total(), 10.12, 0.01);
  }

  @Test
  public void shouldBeAbleToGetTotalForMultipleProducts() {
    Product productOne = mock(Product.class);
    Product productTwo = mock(Product.class);

    when(productOne.price()).thenReturn(10.12);
    when(productTwo.price()).thenReturn(20.12);

    Cart cart = new Cart();
    cart.addItem(productOne);
    cart.addItem(productTwo);
    assertEquals(cart.total(), 30.24, 0.01);
  }

  @Test
  public void shouldBeAbleToGetTaxForSingleProduct() {
    Product product = mock(Product.class);
    when(product.tax()).thenReturn(10.0);

    Cart cart = new Cart();
    cart.addItem(product);
    assertEquals(cart.tax(), 10, 0.01);

  }


}
