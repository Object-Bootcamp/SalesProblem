package com.bootcamp_new.sales.product;


import java.util.*;

public class ProductFactory {

  static HashMap<ProductCategory, List<String>> categoryProductNameMapper;

  public static Product createProduct(String category, double price) {
    Product product = null;
    switch (getCategory(category)) {
      case BOOK:
        product = new BookProduct(price, false);
        break;
      case MEDICAL:
        product = new MedicineProduct(price, false);
        break;
      case FOOD:
        product = new FoodProduct(price, false);
        break;
      case OTHER:
        product = new OtherProduct(price, false);
        break;
    }
    return product;
  }

  private static ProductCategory getCategory(String productDescription) {
    System.out.println("product description: "+ productDescription);
    for (Map.Entry<ProductCategory, List<String>> entry : categoryProductNameMapper.entrySet()) {
      List<String> values = entry.getValue();
      if (values.contains(productDescription))
        return entry.getKey();
    }
    return ProductCategory.OTHER;
  }


  public static void builldWordMapper() {
    categoryProductNameMapper = new HashMap<>();
    categoryProductNameMapper.put(ProductCategory.BOOK, Arrays.asList("book", "books"));
    categoryProductNameMapper.put(ProductCategory.OTHER, Arrays.asList("music CD", "perfume"));
    categoryProductNameMapper.put(ProductCategory.FOOD, Arrays.asList("chocolates"));
    categoryProductNameMapper.put(ProductCategory.MEDICAL, Arrays.asList("pills"));
  }


}
