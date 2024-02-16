package SumEvenSquares;

import io.vavr.control.Either;
import io.vavr.control.Try;
// Vous pouvez utilisez Array pour parcourir l'array numbers
import java.util.Arrays;

public class SumEvenSquares {
    public static void main(String[] args) {
        Integer[] nums1 = {1, 2, 3, 4, 5};
        Either<String, Try<Integer>> result1 = sumOfEvenSquares(nums1);
        System.out.println("Result 1: " + result1);

        Integer[] nums2 = {1, 3, 5, 7};
        Either<String, Try<Integer>> result2 = sumOfEvenSquares(nums2);
        System.out.println("Result 2: " + result2);
    }

    public static <T extends Number> Either<String, Try<Integer>> sumOfEvenSquares(T[] numbers) {
    	// Implementer la fonction ...
        return Either.left("Aucun nombre pair trouvé");
    }
}

