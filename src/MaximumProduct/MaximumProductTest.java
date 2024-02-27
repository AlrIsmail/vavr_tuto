package MaximumProduct;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import io.vavr.collection.List;

public class MaximumProductTest {

    @Test
    void testMaximumProductWithPositiveNumbers() {
        List<Integer> nums = List.of(1, 2, 3, 4);
        assertEquals(24, MaximumProduct.maximumProduct(nums));
    }

    @Test
    void testMaximumProductWithNegativeNumbers() {
        List<Integer> nums = List.of(-1, -2, -3, -4);
        assertEquals(-6, MaximumProduct.maximumProduct(nums));
    }

    @Test
    void testMaximumProductWithZeros() {
        List<Integer> nums = List.of(0, 1, 2, 3);
        assertEquals(6, MaximumProduct.maximumProduct(nums));
    }

    @Test
    void testMaximumProductWithMixedNumbers() {
        List<Integer> nums = List.of(2, -1, 1, 2, 3, -4, 100);
        assertEquals(600, MaximumProduct.maximumProduct(nums));
    }


    @Test
    void testMaximumProductWithAllNegativeNumbers() {
        List<Integer> nums = List.of(-10, -20, -30, -40);
        assertEquals(-10 * -20 * -30, MaximumProduct.maximumProduct(nums));
    }

    @Test
    void testMaximumProductWithLargeNumbers() {
        List<Integer> nums = List.of(1000, 2000, 3000, 4000);
        assertEquals(1705032704, MaximumProduct.maximumProduct(nums));
    }

    @Test
    void testMaximumProductWithDuplicateElements() {
        List<Integer> nums = List.of(2, 2, 2, 2);
        assertEquals(8, MaximumProduct.maximumProduct(nums));
    }
}
