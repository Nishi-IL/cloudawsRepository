import java.util.Arrays;         //to seperate odd number(filter)
import java.util.List;
import java.util.stream.Stream;

public class Source3 {
	public static void main(String[] args) {
		List<String>names=Arrays.asList("Nisha","Nishi","Ilango","poonguzhali");
		System.out.println("=== display names whose character length ===");
		
		Stream<Integer> numbers=Stream.of(34,24,56,87,34,56,98,19,73,39);
		numbers.filter((t)->t%2!=0)
		.forEach((t)->System.out.println(t));
	}
}
		
		
