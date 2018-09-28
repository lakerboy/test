import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class Unit1ExcerceseSolutionJava7 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 40),
				new Person("Lewis", "Carroll", 41),
				new Person("Thomas", "Carlyle", 42),
				new Person("Chrlotte", "Bronte", 43),
				new Person("Matthew", "Arnold", 44)
				
				);
		
		// Step 1: sort list by last name
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {				
				return o1.getLastName().compareTo(o2.getLastName());
			}
			
		});
	
		// Step 2: create method that prints all elements in the list
		System.out.println("Printing all persons");
		printAll(people);
		
		// Step 3: Create method that prints all the people that have last name beginning with C
		System.out.println("Printing all persons with last name beginning with C");
		printConditionally(people, new Condition(){

			@Override
			public Boolean test(Person p) {
				return p.getLastName().startsWith("C");
			}
			
		});
		
		System.out.println("Printing all persons with FIRST name beginning with C");
		
		printConditionally(people, new Condition(){

			@Override
			public Boolean test(Person p) {
				return p.getFirstName().startsWith("C");
			}
			
		});
		
	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for(Person p : people){
			if(condition.test(p)){
				System.out.println(p);
			}
		}		
	}

	private static void printAll(List<Person> people) {

		for(Person p : people){
			System.out.println(p);
		}
	}

	
	interface Condition{
		Boolean test(Person p);
	}
	
	
}
