package streams;

import static java.util.Arrays.asList;
import static streams.ToUpperCase.transform;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;


public class ToUpperCaseSpec {

    @Test
    public void transformShouldConvertCollectionElementsToUpperCase() {
        List<String> collection = asList("My", "name", "is", "John", "Doe");
        List<String> expected = asList("MY", "NAME", "IS", "JOHN", "DOE");
        Assert.assertEquals(expected, transform(collection));
    }

}
