package ListProcessor;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import io.vavr.collection.List;
import io.vavr.control.Option;

public class ListProcessorTest {

    @Test
    void testProcessList() {
        List<Integer> inputList = List.of(1, 2, 3, 4, 5);
        List<Object> expected = List.of(2, 3, 4, 5, 6, 4, 9, 16, 25, 36, Option.some(false), Option.some(true), Option.some(false), Option.some(true), Option.some(false));

        List<Object> result = ListProcessor.processList(inputList);

        assertEquals(expected, result);
    }

    @Test
    void testProcessList_EmptyInput() {
        List<Integer> inputList = List.empty();
        List<Object> expected = List.empty();

        List<Object> result = ListProcessor.processList(inputList);

        assertEquals(expected, result);
    }

    @Test
    void testProcessList_AllEven() {
        List<Integer> inputList = List.of(2, 4, 6, 8, 10);
        List<Object> expected = List.of(3, 5, 7, 9, 11, 9, 25, 49, 81, 121, Option.some(true), Option.some(true), Option.some(true), Option.some(true), Option.some(true));

        List<Object> result = ListProcessor.processList(inputList);

        assertEquals(expected, result);
    }

    @Test
    void testProcessList_AllOdd() {
        List<Integer> inputList = List.of(1, 3, 5, 7, 9);
        List<Object> expected = List.of(2, 4, 6, 8, 10, 4, 16, 36, 64, 100, Option.some(false), Option.some(false), Option.some(false), Option.some(false), Option.some(false));

        List<Object> result = ListProcessor.processList(inputList);

        assertEquals(expected, result);
    }
}
