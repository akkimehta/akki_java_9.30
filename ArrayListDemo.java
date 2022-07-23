import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(10.10);
		al.add("tops");
		al.add('t');
		al.add(true);
		al.add(null);
		al.add(10);
		System.out.println(al);
		System.out.println(al.contains(11));
		System.out.println(al.get(4));
		System.out.println(al.indexOf('t'));
		System.out.println(al.remove(0));
		System.out.println(al);
		System.out.println(al.isEmpty());
		al.set(2,20);
		System.out.println(al);
		System.out.println(al.size());
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
