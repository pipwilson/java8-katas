package streams;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class OldestPersonSpec {

	@Test
	public void getOldestPersonShouldReturnOldestPerson() {
		Person sara = new Person("Sara", 4);
		Person viktor = new Person("Viktor", 40);
		Person eva = new Person("Eva", 42);
		List<Person> collection = Arrays.asList(sara, eva, viktor);
		assertEquals(eva, OldestPerson.getOldestPerson(collection));
	}

}
