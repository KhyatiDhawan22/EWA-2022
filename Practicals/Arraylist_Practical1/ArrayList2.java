import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		//Printing Array element is a tedious job to do
	String[] F = new String[2];
	F[0]="Mango";
	F[1]="Apple";
	int m = F.length;
	System.out.println(m);
	for(int i=0;i<m ;i++){
		System.out.println(F[i]);
	}
	//But by using arraylist this can be made easy 
	ArrayList<String> FruitList=new ArrayList<String>();
	FruitList.add("Apple");
	FruitList.add("mango");
	System.out.println(FruitList);
	//It is Easier to print an ArrayList than to Print an Array
	}

}
//In array you always need to change the length in order to add elements into it 
//But in arraytlist it does not care about the length , it can expand as much as you want 
