package org.example;

import org.example.service.ProductService;
import org.example.service.impl.ProductServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class ProductServiceImplTest {

    private ProductService productService;

    public ProductServiceImplTest() {
        productService = new ProductServiceImpl();
    }

    @Test
    public void calculateProductPriceThatShouldReturnPriceWithPromotionalPrice() {
        //Given
        char productKey = 'A';
        int productQuantity = 5;
        double expectedPrice = 5.5;
        //When
        double resultPrice = productService.calculateProductPrice(productKey, productQuantity);
        //Then
        Assertions.assertEquals(expectedPrice, resultPrice, 1e-9);
    }

    @Test
    public void calculateTotalProductPriceThatIncludeDifProductAndReturnPromoPrice() {

        Map<Character, Integer> order = new HashMap<>();
        order.put('A', 3);
        order.put('C', 7);
        double expectedResult = 9.0;

        double resultTotalPrice = productService.calculateTotalPrice(order);

        Assertions.assertEquals(expectedResult, resultTotalPrice, 1e-9);
    }

    @Test
    public void givenInputStringShouldReturnMapOfUppercaseCharactersAndIntegers() {

        String input = "AbbCdDa";
        Map<Character, Integer> expectedResult = Map.of(
                'A', 2, 'B', 2, 'C', 1, 'D', 2);

        Map<Character, Integer> result = productService.orderStringFormat(input);

        Assertions.assertEquals(expectedResult, result);
    }

}
