package streams;

import static org.junit.Assert.*;

import java.util.List;
import static java.util.Arrays.asList;
import static streams.FilterCollection.*;

import org.junit.Test;

public class FilterCollectionSpec {

    @Test
    public void transformShouldFilterCollection() {
        List<String> collection = asList("My", "name", "is", "John", "Doe");
        List<String> expected = asList("My", "is", "Doe");
        assertEquals(expected, transform(collection));
    }

}
