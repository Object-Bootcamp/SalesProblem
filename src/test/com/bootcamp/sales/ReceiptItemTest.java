package com.bootcamp.sales;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReceiptItemTest {

    @Test
    public void getTotalPrice() {
        Product p = new Product("book", 12.0);
        p.markAsImported();
        ReceiptItem item = new ReceiptItem(p, 2);
        assertEquals(24.0, item.getTotalPriceWithoutTax(), 0.01);
    }
}
