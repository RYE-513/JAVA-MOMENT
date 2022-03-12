
public class ARRAY_MULTIPLE_NESTEDFORLOOPS {
	public static void main(String[] args) {
		
		
		// DOUBLE ARRAY FEAT NESTED FOR LOOPS:
		// *"var.length" is not necesssary only i < "2" && j < "3".
		
														  //ROW
		String[][] myFaveColors = {{"1", "2", "3"}, 	  //ROW 1
								  {"1.1", "1.2", "1.3"}}; //ROW 2 for(int i = 0; i < 2; i++) 
		
		for(int i = 0; i < 2; i++) {         // i < 2; the "2" is the set of row
			for(int j = 0; j < 3; j++) {     // j < 3; the "3" items in rows
				System.out.println(myFaveColors[i][j]);
			}
		}
		
		// TRIPLE ARRAY FEAT TRIPLE NESTED LOOP
		// String[][][] is not existing only String[][]
		
		String[][] myFaveColorss = {{"RED", "GREEN", "BLUE"},
								  {"GREY", "BLACK", "WHITE"},
								  {"PINK", "BLUE", "BROWN"}};

		for(int i = 0; i < 3; i++) {   // if you add more rows the i < 3; "3" will be increased depends on how many rows you added.
			for(int j = 0; j < 3; j++) {
			// for(int k = 0; k < 4 ; k++) { this syntax is not existing.
				//(myFaveColorss[i][j][k]); this triple [i][j][k] is not existing only [i][j]. 
				System.out.println(myFaveColorss[i][j]);

				}
			}
		
		// REVIEW
		
		String[][] setOfCountries = {{"MAHARLIKA","VIETNAM","SINGAPORE","INDONESIA","MALAYSIA"},
									 {"JAPAN","NOKOR","SOKOR","CHINA","TAIWAN"},
									 {"RUSSIA","ASTRAKHAN","ST.PETERSBURG","MOSCOW","STALINGRAD"},
									 {"MONGOLIA", "ULANBATOR","DARKHAN","ERDENET","BOOV"}};
		
									 for(int r = 0; r < 4; r++) {
										 for(int y = 0; y < 5; y++) {
											 System.out.println(setOfCountries[r][y]);
										 }
									 }
		
		

		
		
	}
}