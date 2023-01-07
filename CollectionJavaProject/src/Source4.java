import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Source4 {
	
	public static void main(String[] args) {
		Set ts=new TreeSet();
		ts.add(2);
		ts.add(21);
		ts.add(2);
		ts.add(8);
		ts.add(1);
		ts.add(44);
		System.err.println(ts);
		
		
		TreeSet<Integer> ts2=new TreeSet<Integer>();
		ts2.add(55);
		ts2.add(5);
		ts2.add(23);
		ts2.add(7);
		ts2.add(11);
		
		
		ts.addAll(ts2);
		System.err.println(ts2.descendingSet());
		System.err.println(ts.size());
		
		
		
		
		
		
		
	}

}
