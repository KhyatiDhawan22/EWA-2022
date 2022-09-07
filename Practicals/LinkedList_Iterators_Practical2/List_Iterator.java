/*In the example below, we have implemented the next(), 
 * nextIndex() and hasNext() methods of the ListIterator interface 
 * in a Linked list.*/
import java.util.*;
public class List_Iterator {

	public static void main(String[] args) {
//_______________Creating Linked List_______________
		LinkedList<String> Linky=new LinkedList<String>();
		Linky.add("Hello");
		Linky.add("Hey");
		Linky.add("Bye");
		Linky.add("Sayonara");
//_______________Creating Iterator Instance_______________
		ListIterator<String> itr= Linky.listIterator();

//_______________Use of next() method_______________
		String m =itr.next();
		System.out.println("Next Element ="+ m);
//_______________Use of nextIndex() method_______________
		int n = itr.nextIndex();
		System.out.println("Next Element Index ="+ n);
//_______________Use of hasNext() method_______________
		
		System.out.println("Is there any Next element ="+itr.hasNext());
		
//______________To print all elements_______________
		
		//Loop started with 1 as zeroth index value is already printed in above next()
		
		for(int i=1;i<(Linky.size());i++) {
			String ele= itr.next();
			System.out.println("Element "+i +" in List are ="+ ele);
		}
		
	}

}
