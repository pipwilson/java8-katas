package streams;

import java.util.List;
import java.util.stream.Collectors;

public class Joining {

	public static String namesToString(List<Person> collection) {
		return collection.stream().map(Person::getName).collect(Collectors.joining(", ", "Names: ", "."));
	}

}
