import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Source3 {
	public static void main(String[] args) {
		List<String>lst=Arrays.asList("nishi","nisha","ilango");
		List<String>desg=Arrays.asList("father","mother","daughters");
		List<String>names=new ArrayList<String>();
		names.addAll(lst);
		System.out.println(names);
		names.add("poonguzhali");
		names.addAll(desg);
		System.out.println(names);
		
		
List number=new LinkedList();//non-generic
number.add(19);
number.add(18);
number.add(23);
System.out.println(number);

Collections.sort(names);
System.out.println(names);

names.addAll(number);
System.out.println(names);
	}

}
