package com.bootcamp.sales;

public class ReceiptItem {

    private final Product product;
    private final int quantity;

    public ReceiptItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getTotalPriceWithoutTax() {
        return (product.getPrice() * quantity);
    }

    public double applyImportedTax() {
        Double total=getTotalPriceWithoutTax();
        return total*0.05+total;
    }
}