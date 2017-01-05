package streams;

import java.util.List;
import java.util.stream.Collectors;

public class FilterCollection {

	public static List<String> transform(List<String> collection) {
		return collection.stream().filter(word -> word.length() <= 3).collect(Collectors.toList());
	}

}
