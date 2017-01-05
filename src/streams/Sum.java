package streams;

import java.util.List;

public class Sum {

	public static int calculate(List<Integer> numbers) {
		return numbers.stream().reduce(0, Integer::sum).intValue();
	}

}
