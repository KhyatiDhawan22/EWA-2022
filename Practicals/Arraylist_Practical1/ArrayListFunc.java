import java.util.*;
public class ArrayListFunc {
   public static void main(String args[]) {
      
      ArrayList<String> obj = new ArrayList<String>();
      
      /*This is how we add elements to an ArrayList*/
      obj.add("Ajeet");
      obj.add("Harry");
      obj.add("Chaitanya");
      obj.add("Steve");
      obj.add("Anuj");
      
      // Displaying elements
      System.out.println("Original ArrayList:"+obj );
      
 //Add element at the given index
      obj.add(0, "Rahul");
      obj.add(1, "Justin");
      
      
      // Displaying elements
      System.out.println("ArrayList after add operation:" + obj);
      
      //Remove elements from ArrayList like this
      obj.remove("Chaitanya"); 
      obj.remove("Harry"); 
      
      
      // Displaying elements
      System.out.println("ArrayList after remove operation:"+ obj);
      
      
//Remove element from the specified index
      obj.remove(1); //Removes Second element from the List
      
      // Displaying elements
      System.out.println("Final ArrayList:"+obj);
      
   }
}
