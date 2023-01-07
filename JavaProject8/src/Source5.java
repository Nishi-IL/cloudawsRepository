import java.util.Arrays;
import java.util.List;

public class Source5 {
	public static void main(String[] args) {
		List<Integer> number=Arrays.asList(45,67,23,54,16,8,9,4,26,98,13,98,98,76,23,18,19);
		System.out.println("==number is unique==");
		number.stream()
		.distinct()
		.sorted()
		.forEach((t)->System.out.println(t));
		
		System.out.println("====count of number====");
		long count=number.stream()
				.distinct().count();
		System.out.println(count);
				
	}

}
