
public class FOR_LOOP {

	public static void main(String[] args) {
		
		
		//MULTIPLE PRINT IN SPECIFIC FOR LOOP RANGE.
		for(int rye = 0; rye < 10; rye++) {   // NO NEED TO PUT ";" in rye++ , the "10" is the range number.
			System.out.println("\n I LOVE PUSSY"); // "I LOVE PUSSY"  will print x10.
		}
		
		//LISTING NUMBERS
		for(int jon = 0; jon < 10; jon++) {
			System.out.println(jon);
		}
		
		//FOR LOOP ARRAY
		//PLACING VALUE:   0         1          2           3          4     *zero "0" is the first number
		String[] camo = {"GOLD", "PLATINUM", "DAMASCUS", "DIAMOND", "AETHER"};
		//ITEM VALUE       1         2          3           4          5     *literally started in "1"
		
		for(int rye = 0; rye < 4; rye++) {  //the "4" is the 4th item of array  
			System.out.println(camo[rye]);
			
		}
	
		int close [] = {32, 45, 89, 78, 79};
		for(int i = 0; i < close.length; i++) {
			System.out.println(close[3]);   // if you put close[3] it will run "78". 
			System.out.println(close[i]);	// by the aid of for(int.length..) the result is 78, 78, 78, 78, 78, or five times
		}									// because the numbers of arrays are five items. int close[] = {32, 45, 89, 78, 79};
	
											// System.out.println(close[i]); this print statement will be list all the integers.
		
		
		
		
			

		

	
  }
}
