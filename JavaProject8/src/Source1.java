import java.util.*;                  //collecter
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
public class Source1{
	//private static char[] cointainI;

	public static void main(String[] args) {
		List<String>names=Arrays.asList("Nisha","Nishi","Ilango","poonguzhali");
		System.out.println("===collect names cointaing letter i===");
	
		List<String> containI=names.stream()
		.filter((t)->t.contains("i"))
		.collect(Collectors.toList());
		System.out.println(containI);
		
	}
}

        
		
	
	


