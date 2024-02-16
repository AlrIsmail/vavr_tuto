package SumEvenSquares;

import io.vavr.control.Either;
import io.vavr.control.Try;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumEvenSquaresTest {

    @Test
    void testSumOfEvenSquares_WithEvenNumbers() {
        Integer[] nums = {1, 2, 3, 4, 5};
        Either<String, Try<Integer>> result = SumEvenSquares.sumOfEvenSquares(nums);
        assertEquals("Right(Success(20))", result.toString());
    }

    @Test
    void testSumOfEvenSquares_WithNoEvenNumbers() {
        Integer[] nums = {1, 3, 5, 7};
        Either<String, Try<Integer>> result = SumEvenSquares.sumOfEvenSquares(nums);
        assertEquals("Left(Aucun nombre pair trouvé)", result.toString());
    }

    @Test
    void testSumOfEvenSquares_WithEmptyArray() {
        Integer[] nums = {};
        Either<String, Try<Integer>> result = SumEvenSquares.sumOfEvenSquares(nums);
        assertEquals("Left(Aucun nombre pair trouvé)", result.toString());
    }

    @Test
    void testSumOfEvenSquares_WithNullArray() {
        Integer[] nums = null;
        Either<String, Try<Integer>> result = SumEvenSquares.sumOfEvenSquares(nums);
        assertEquals("Left(Aucun nombre pair trouvé)", result.toString());
    }

    @Test
    void testSumOfEvenSquares_WithNegativeNumbers() {
        Integer[] nums = {-2, -4, -6};
        Either<String, Try<Integer>> result = SumEvenSquares.sumOfEvenSquares(nums);
        assertEquals("Right(Success(56))", result.toString());
    }
}
