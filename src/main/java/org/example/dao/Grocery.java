package org.example.dao;

import org.example.model.ProductModel;

import java.util.HashMap;
import java.util.Map;

public final class Grocery {

    private final Map<Character, ProductModel> grocery;

    public Grocery() {
        grocery = new HashMap();
        grocery.put('A', new ProductModel('A', 1.25d, 3, 3.00d));
        grocery.put('B', new ProductModel('B', 4.25d, 0, 0d));
        grocery.put('C', new ProductModel('C', 1.00d, 6, 5.00d));
        grocery.put('D', new ProductModel('D', 0.75d, 0, 0d));
    }

    public Map<Character, ProductModel> getGrocery() {
        return grocery;
    }
}
