package ListProcessor;

import java.util.function.Function;

import io.vavr.Function1;
import io.vavr.collection.List;
import io.vavr.control.Option;

public class ListProcessor {

    // Définir les fonctions addOne, square et isEven ici
	// addOne..
	public static Function1<Integer, Integer> addOne = null;
	// square..

	// isEven..
	
	
    public static List<Object> processList(List<Integer> inputList) {
        // Implémenter la composition des fonctions et le levage ici ...
        Function1<Integer, Integer> addOneAndSquare = null;
        Function1<Integer, Option<Boolean>> isEvenLifted = Function1.lift(null);

        List<Object> resultList = List.of(
            inputList.map(addOne),
            inputList.map(addOneAndSquare),
            inputList.map(isEvenLifted)
        ).flatMap(Function.identity());
        return resultList;
    }

    public static void main(String[] args) {
        List<Integer> inputList = List.of(1, 2, 3, 4, 5);
        List<Object> resultList = processList(inputList);
        System.out.println(resultList);
        // Résultat attendu : List(2, 3, 4, 5, 6, 4, 9, 16, 25, 36, Some(false), Some(true), Some(false), Some(true), Some(false))
    }
}
