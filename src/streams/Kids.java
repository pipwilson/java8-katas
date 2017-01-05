package streams;

import java.util.List;
import static java.util.stream.Collectors.toList;

public class Kids {

	public static List<String> getKidNames(List<Person> collection) {
		return collection.stream().filter(kid -> kid.getAge() < 18).map(Person::getName).collect(toList());
	}

}
