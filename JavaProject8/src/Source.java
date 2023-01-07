
import java.util.*;
import java.util.List;
import java.util.Arrays;
public class Source{
	public static void main(String[] args) {
		List<String>names=Arrays.asList("Nisha","Nishi","Ilango","poonguzhali");
		names.stream()
		.filter((t)->t.startsWith("N"))         //for filter
		.forEach((t)->System.out.println(t));
	
	}
}








