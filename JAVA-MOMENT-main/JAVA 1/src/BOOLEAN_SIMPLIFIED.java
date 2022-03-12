public class BOOLEAN_SIMPLIFIED {
	public static void main(String[] args) {
		
		// BOOLEAN FEAT CONDITION STATEMENT
		
		/*  "<" LESS THAN
		 *  ">" GREATER THAN
		 *  "==" EQUAL
		 *  "!=" NOT EQUAL
		 */
		
		boolean rye = true;
		boolean bscs = false;
		
		if(rye) {
			System.out.println("IT SHOWS \"TRUE\""); //IF STATEMENT RUN ONLY TRUE
		} else {
			System.out.println("VICE VERSA"); // ELSE STATEMENT IS THE OPPOSITE OF IF/ELSE IF
		}
		
		// BOOLEAN FEAT INTEGER COMPARISON
		
			int ryeBalance = 56;
			int bscsBalance = 68;
		
			boolean result = (ryeBalance <= 72);
			System.out.println(result);
		
		// *COMBINE WITH SYSOUT. *DIRECT*
		
			System.out.println(ryeBalance==bscsBalance);
		
		// adding "!" makes the answer vice versa.
		
			boolean resultt = !(ryeBalance <= 72);
			System.out.println(resultt);
		
		// adding "!" is not work directly below this syntax.

			System.out.println(ryeBalance==bscsBalance);
	}
}