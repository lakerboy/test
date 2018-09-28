import java.util.Arrays;
import java.util.List;

public class StreamExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 40),
				new Person("Lewis", "Carroll", 41),
				new Person("Thomas", "Carlyle", 42),
				new Person("Chrlotte", "Bronte", 43),
				new Person("Matthew", "Arnold", 44)
				
				);
		
		people.stream()
		.filter(p -> p.getLastName().startsWith("C"))
		.forEach(p -> System.out.println(p.getFirstName()));
	}

}
