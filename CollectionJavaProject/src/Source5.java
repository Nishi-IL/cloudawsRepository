import java.util.ArrayList;                           //list//
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class SortByName implements Comparator<Employee>{
@Override
public int compare(Employee o1,Employee o2) {
return o1.getEmployeeName().compareTo(o2.getEmployeeName());
}
}

class SortByAge implements Comparator<Employee>{
@Override
public int compare(Employee o1, Employee o2) {

return o1.getEmployeeAge()-o2.getEmployeeAge();
}
}
public class Source5 {

public static void main(String[] args) {
List<Employee> lstemp=new ArrayList<Employee>();
Employee emp1=new Employee(105,"Suji",3729,28,"Developer");
lstemp.add(emp1);
    lstemp.add(new Employee(109,"ramya",37209,23,"Developer"));
    lstemp.add(new Employee(104,"abi",2729,21,"Developer"));
    lstemp.add(new Employee(101,"preethi",10000,20,"Developer"));

    
System.out.println("=======Raw List =========");    
for(Employee employee:lstemp)
System.out.println(employee);

System.out.println("======= List sorted By employeeid as default========");
Collections.sort(lstemp);
for(Employee employee: lstemp)
    System.out.println(employee);


Collections.sort(lstemp,new SortByName());
System.out.println("=========List by Name in Ascending Order=========");
for(Employee employee:lstemp)
System.out.println(employee);


Collections.sort(lstemp,new SortByAge());
System.out.println("=========List by EmployeeAge in Ascending Order=========");
for(Employee employee:lstemp)
System.out.println(employee);


}

}

