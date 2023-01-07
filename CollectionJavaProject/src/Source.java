import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Source {
	public static void main(String[] args) {
List lst=new ArrayList();
lst.add(23);
lst.add("Nishi");
lst.add("nishi");
System.out.println(lst);
lst.add(2,"Nisha");
System.out.println(lst);

lst.remove("nishi");
System.out.println(lst);


//loop
for(int i=0;i<lst.size();i++) {
	System.out.println(lst.get(i));
}

//for statement -- enhanced loop
System.out.println("===========");
for(Object x : lst) {
	System.out.println(x);
}
System.out.println("=====using iterator======");
Iterator itr=lst.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
	}

}
