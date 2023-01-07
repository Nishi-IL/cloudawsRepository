import java.util.ArrayList;                   //tree//
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
class NameSorting implements Comparator<Employee>{
@Override
public int compare(Employee o1,Employee o2) {
return o1.getEmployeeName().compareTo(o2.getEmployeeName());
}
}
public class Source6 {
	public static void main(String[] args) {
		Set<Employee>empSet=new TreeSet<>();
		Employee emp1=new Employee(105,"Suji",3729,28,"Developer");
		Employee emp2=new Employee(105,"Nisha",3729,28,"Team Leader");
		Employee emp3=new Employee(105,"Jenifer",3729,28,"Clerk");
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		empSet.add(new Employee(1002,"Raj",15000,21,"Analyst"));
		empSet.add(new Employee(1010,"Adithiya",65000,23,"HR"));
		System.out.println("===Sorting by id by default===");
		Iterator itr= empSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("===Sort by name anonymously===");
		TreeSet<Employee>tsName=new TreeSet<>(new NameSorting());
		tsName.addAll(empSet);
		for(Employee e:tsName) {
			System.out.println(e);
		}
		System.out.println("===Sorting by Designation using lambda Expression===");
		TreeSet<Employee>tsDes=new TreeSet<Employee>((o1,o2)->o1.getdesignation().compareTo(o2.getdesignation()));
		tsDes.addAll(empSet);
		for(Employee e:tsDes) {
			System.out.println(e);
		}
		
		
		}


}
