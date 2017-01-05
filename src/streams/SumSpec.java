package streams;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SumSpec {

    @Test
    public void transformShouldConvertCollectionElementsToUpperCase() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(1 + 2 + 3 + 4 + 5, Sum.calculate(numbers));
    }

}
