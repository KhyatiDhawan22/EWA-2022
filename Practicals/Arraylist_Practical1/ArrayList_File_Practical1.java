import java.io.*;
import java.util.*;
public class ArrayList_File_Practical1 {

	public static void main(String args[]) throws Exception{
		
//_______________EXTRACTING WORDS_______________
		
        File file = new File("C:\\Users\\Admin\\OneDrive - The Northcap university\\Desktop\\hello.txt");
        
        BufferedReader br = new BufferedReader(new FileReader(file));
        ArrayList<String> arr = new ArrayList<String>();
        
        String st;
        while ((st = br.readLine()) != null) {
        String[] words = st.split(" "); //words Extracted
       
        for(String word:words) {
        arr.add(word);
          }//for
       
        }//while
        System.out.println(arr);//Display all words in ArrayList
        int m= arr.size();
        
        System.out.println(m);//Size of the ArrayList
        
        
//_______________PRINTING REVERSED_______________ 
        for(int i=m-1; i>=0;i--){
        System.out.print(arr.get(i)+" ");
        
        }//for
        System.out.println();
        ArrayList<String> arr1=new ArrayList<String>();
        
        
//_______________PLURAL WORDS_______________
        for(int i=0;i<m;i++) {
        	String word = arr.get(i)+"s";
        	
        	arr1.add(word);
        
        	}//for end
        System.out.println("List with Plural words="+ arr1); 
        
//_______________REMOVING PLURALS_____________
        for(int i=m-1;i>=0;i--) {
        	String word= arr1.get(i);
        
        	if(word.substring(word.length()-1).equals("s")) {
        		arr1.remove(i);
        		
        	}
        	
        }
        System.out.println("Word Removed!");
        System.out.println(arr1.size());
        
        }//main
         
       
}//class
               
	    
        




