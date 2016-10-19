package com.bootcamp_new.sales;

import com.bootcamp_new.sales.product.BookProduct;
import com.bootcamp_new.sales.product.OtherProduct;
import com.bootcamp_new.sales.product.Product;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductTest {
  @Test
  public void shouldCalculateTaxForAProduct() {
    Product product = new OtherProduct(10.10, false);
    assertEquals(product.tax(), 1.01, 0.01);
  }

  @Test
  public void taxShouldNotBeApplicableToBookCategory() {
    Product product = new BookProduct(12.49, false);
    assertEquals(product.tax(), 0.0, 0.01);
  }

  @Test
  public void shouldReturnProductPriceAlongWithTax() {
    Product product = new OtherProduct(14.99, false);
    assertEquals(product.priceInclusiveTax(), 16.49, 0.01);
  }

  @Test
  public void shouldReturnImportedProductPriceWithImportedTax() {
    Product book = new OtherProduct(40.00, true);

    assertEquals(46.00, book.priceInclusiveTax(), 0.01);
  }
}
