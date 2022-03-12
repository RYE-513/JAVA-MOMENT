import java.util.ArrayList;
import java.util.Scanner;

public class ARRAYLIST_WHILE_STRING {   //COMBINATION OF ARRAY AND WHILE WITH COMA

	public static void main(String[] args) {
	
		 String sentence = "MATH ROCK AND DREAM POP";
		 Scanner scan = new Scanner(sentence);
		 ArrayList<String> words = new ArrayList<String>();
		 
		 while(scan.hasNext()) {
			 words.add(scan.next());
		 }
		 
		 System.out.println(words);

	}

}
