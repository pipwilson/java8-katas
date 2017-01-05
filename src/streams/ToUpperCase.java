package streams;

import java.util.List;
import static java.util.stream.Collectors.toList;

public class ToUpperCase {

	public static List<String> transform(List<String> collection) {

		return collection.stream().map(String::toUpperCase).collect(toList());
		
	}

}
