package org.example.service.impl;

import org.example.dao.Grocery;
import org.example.model.ProductModel;
import org.example.service.ProductService;

import java.util.HashMap;
import java.util.Map;

public class ProductServiceImpl implements ProductService {

    private final Grocery grocery;

    public ProductServiceImpl() {
        this.grocery = new Grocery();
    }

    @Override
    public double calculateProductPrice(char product, int quantity) {
        ProductModel productModel = grocery.getGrocery().get(product);
        double price;
        int promotionalCount = productModel.getPromotionalCount();
        double promotionalPrice = productModel.getPromotionalPrice();
        double unitPrice = productModel.getPrice();
        if (promotionalCount > 0 && promotionalPrice > 0) {
            int discountedQuantity = quantity / promotionalCount;
            int regularQuantity = quantity % promotionalCount;
            price = discountedQuantity * promotionalPrice + regularQuantity * unitPrice;
        } else {
            price = quantity * unitPrice;
        }
        return price;
    }

    @Override
    public double calculateTotalPrice(Map<Character, Integer> purchase) {
        double totalPrice = purchase.entrySet().stream()
                .mapToDouble(entry -> calculateProductPrice(entry.getKey(), entry.getValue()))
                .sum();
        return totalPrice;
    }

    @Override
    public Map<Character, Integer> orderStringFormat(String productFormat) {
        Map<Character, Integer> products = new HashMap<>();
        for(char c : productFormat.toUpperCase().toCharArray()) {
            products.put(c, products.getOrDefault(c, 0) + 1);
        }
        return products;
    }
}
