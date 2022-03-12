import java.util.Scanner;

public class CONDITIONAL_STATEMENTS {

	public static void main(String[] args) {
		
		
		// it also called "CONTROL STATEMENTS"
		
		System.out.println("AGE IDENTIFIER: IF YOU ARE AN \"ADULT\" || \"MINOR\" ");
		
		Scanner age = new Scanner(System.in);
		int rye = age.nextInt();                   // "&&" means "AND" is use to declare a range value.
		
		if (rye >= 12 && rye <= 18) {              // ">=" and "<=" are the value ranges.
			System.out.println("MINOR!");		   // ">=" and ">=" INCORRECT "<=" and "<=" INCORRECT  *they need to be vice versa
		}										   // "=<" and "=<" INCORRECT * "<" and ">" is always putted first before "=" equal operator
		else if (rye >= 19 && rye <= 30) {
			System.out.println("ADULT!");		  //	IF YOU HAVE MULTIPLE "IF" ITS NECESSARY TO USE "ELSE-IF" because if you put multiple "IF" your program will consider all true not specific.
		} else {                                  //	"ELSE" statement meaning this are the codes that are not written in conditions.
			System.out.println("INVALID!");
		}
		
		
		System.out.println("CHOOSE: RUSSIA OR MONGOLIA");
		Scanner inputCountry = new Scanner(System.in);
		String con = inputCountry.next();
		
		  if (con.equals("MONGOLIA") || con.equals("mongolia")) { // putting "||" means "OR" is you giving them another option type.
			System.out.println("YOUR FAVE COUNTRY IS MONGOLIA");  // variable.equals("WORD")
		} 
		  else if (con.equals("RUSSIA") || con.equals("russia")) {
			System.out.print("YOUR FAVE COUNTRY IS RUSSIA!");
		} 
		  else {
			System.out.print("INVALID!");
		}
		
		
		

	}

}
