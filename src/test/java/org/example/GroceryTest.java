package org.example;

import org.example.dao.Grocery;
import org.example.model.ProductModel;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GroceryTest {

    private static Grocery grocery;

    @BeforeAll
    public static void setUp() {
        grocery = new Grocery();
    }

    @Test
    public void testContainsGrocery() {

        Map<Character, ProductModel> resultGrocery = grocery.getGrocery();

        assertNotNull(resultGrocery);
        assertEquals(4, resultGrocery.size());
        assertEquals(1.25d, resultGrocery.get('A').getPrice());
        assertEquals(3, resultGrocery.get('A').getPromotionalCount());
        assertEquals(3, resultGrocery.get('A').getPromotionalPrice());
        assertEquals(4.25, resultGrocery.get('B').getPrice());
        assertEquals(0, resultGrocery.get('B').getPromotionalCount());
        assertEquals(0, resultGrocery.get('B').getPromotionalPrice());
        assertEquals(1, resultGrocery.get('C').getPrice());
        assertEquals(6, resultGrocery.get('C').getPromotionalCount());
        assertEquals(5, resultGrocery.get('C').getPromotionalPrice());
        assertEquals(0.75, resultGrocery.get('D').getPrice());
        assertEquals(0, resultGrocery.get('D').getPromotionalCount());
        assertEquals(0, resultGrocery.get('D').getPromotionalPrice());
    }
}
