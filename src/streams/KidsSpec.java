package streams;

import java.util.List;

import org.junit.Test;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class KidsSpec {

	/*
	 * Get names of all kids (under age of 18)
	 */

    @Test
    public void getKidNameShouldReturnNamesOfAllKidsFromNorway() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        Person anna = new Person("Anna", 5);
        List<Person> collection = asList(sara, eva, viktor, anna);
        assertThat(Kids.getKidNames(collection))
                .contains("Sara", "Anna")
                .doesNotContain("Viktor", "Eva");
    }

}
