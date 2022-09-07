/*In the example below, we have implemented 
 * the previous() and previousIndex() methods of the ListIterator 
 * interface in an array list.*/
import java.util.*;

public class List_Iterator1 {

	public static void main(String[] args) {
//_______________Creating LinkedList_______________
		LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        System.out.println("LinkedList: " + numbers);
//_______________Creating an instance of ListIterator_______________
        ListIterator<Integer> iterate = numbers.listIterator();
        
       iterate.next(); //Iterator is like a cursor 1|
       iterate.next(); //Iterator is like a cursor 3|
       
//_______________Using the previous() method_______________
        int number1 = iterate.previous();
        System.out.println("Previous Element: " + number1);
        
//_______________Using the previousIndex() method_______________
        int index1 = iterate.previousIndex();
        System.out.println("Position of the Previous element: " + index1); 

	}

}
