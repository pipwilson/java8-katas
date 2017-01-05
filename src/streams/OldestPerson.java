package streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OldestPerson {

	public static Person getOldestPerson(List<Person> collection) {
		return collection.stream().max(Comparator.comparing(Person::getAge)).get();
	}

}
