package streams;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class PeopleStats {

	public static IntSummaryStatistics getStats(List<Person> collection) {
		return collection.stream().collect(Collectors.summarizingInt(Person::getAge));
	}

}
