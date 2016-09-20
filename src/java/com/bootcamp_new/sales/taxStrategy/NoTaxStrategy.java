package com.bootcamp_new.sales.taxStrategy;

public class NoTaxStrategy implements TaxStrategy{

  @Override
  public double getTax() {
    return 0;
  }
}
