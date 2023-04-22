package org.example;

import org.example.service.ProductService;
import org.example.service.impl.ProductServiceImpl;

public class App {

    public static void main(String[] args) {
        ProductService productService = new ProductServiceImpl();
        System.out.println(productService.calculateProductPrice('A', 11));
        System.out.println(productService.calculateTotalPrice(productService.orderStringFormat("abcdaba")));
    }
}
