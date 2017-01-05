package streams;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;

public class PeopleStatsSpec {

	Person sara = new Person("Sara", 4);
	Person viktor = new Person("Viktor", 40);
	Person eva = new Person("Eva", 42);
	List<Person> collection = asList(sara, eva, viktor);

	@Test
	public void getStatsShouldReturnAverageAge() {
		assertThat(PeopleStats.getStats(collection).getAverage()).isEqualTo((double) (4 + 40 + 42) / 3);
	}

	@Test
	public void getStatsShouldReturnNumberOfPeople() {
		assertThat(PeopleStats.getStats(collection).getCount()).isEqualTo(3);
	}

	@Test
	public void getStatsShouldReturnMaximumAge() {
		assertThat(PeopleStats.getStats(collection).getMax()).isEqualTo(42);
	}

	@Test
	public void getStatsShouldReturnMinimumAge() {
		assertThat(PeopleStats.getStats(collection).getMin()).isEqualTo(4);
	}

	@Test
	public void getStatsShouldReturnSumOfAllAges() {
		assertThat(PeopleStats.getStats(collection).getSum()).isEqualTo(40 + 42 + 4);
	}

}
