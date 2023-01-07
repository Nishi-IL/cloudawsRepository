import java.util.Arrays;         //sorted order in number(distinct)
import java.util.List;

public class Source2 {
	public static void main(String[] args) {
		List<String>names=Arrays.asList("Nisha","Nishi","Ilango","poonguzhali");
		names.stream()
		.filter((t)->t.length()<=5)
		.forEach((t)->System.out.println(t));            //to filter the length 
		
		
		//Stream<Integer>numbers=Stream.of(6,7,4,9,3,7,4)      is directly a stream
		                                                //     no need of converting it again   
		
		
        List<Integer>numbers=Arrays.asList(6,4,8,3,2,9,1,5,6,9,2,0);
		System.out.println("===Distinct even no in sorted order===");
		numbers.stream()
		.distinct()                     //it give unique elements
		.filter((t)->t%2==0)
		.sorted()
		.forEach((t)->System.out.println(t));
	}
		

}
