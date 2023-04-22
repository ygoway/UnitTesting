package org.example.service;

import java.util.Map;

public interface ProductService {

    double calculateProductPrice(char product, int quantity);

    double calculateTotalPrice(Map<Character, Integer> purchase);

    Map<Character, Integer> orderStringFormat(String productFormat);
}
