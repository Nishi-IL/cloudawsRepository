import java.util.*;
import java.util.List;
import java.util.Arrays;
public class Source4{
	public static void main(String[] args) {
		List<String>names=Arrays.asList("Nisha","Nishi","Ilango","poonguzhali");
		names.stream()
		.forEach((t)->System.out.println(t));
	}
}
