package com.bootcamp_new.sales.taxStrategy;

public class BasicSalesTaxStrategy implements TaxStrategy {

  public static final double TEN_PERCENTAGE = 0.10;

  @Override
  public double getTax() {
    return TEN_PERCENTAGE;
  }
}
