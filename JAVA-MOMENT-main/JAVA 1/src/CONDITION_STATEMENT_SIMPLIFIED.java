import java.util.Scanner;

public class CONDITION_STATEMENT_SIMPLIFIED {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	// CONDITION STATEMENT + SCANNER INTEGER = input.nextInt();
	
	// == && .equals are same in condition statements. "==" use in single whole number. e.g. age==20
	
	System.out.println("PLEASE TYPE YOUR AGE");
	int age = input.nextInt();
	
	if(age <= 13 && age >= 19) {
		System.out.println("TEENAGER!");
	} else if(age >= 20 && age <= 100) {
		System.out.println("OLD!");
	} else {
		System.out.println("INVALID AGE");
	}
	
	// CONDITION STATEMENT + SINGLE WORD STRING = input.next();
	
	System.out.println("CHOOSE A GUN: A. AK47 | B. M16 | C. M60 | D. SPAS-12");
	String gun = input.next();
	
	if(gun.equals("A") || (gun.equals("a"))) {
		System.out.println("YOU CHOOSE \"AK47\"");
	} else if(gun.equals("B") || (gun.equals("b"))) {
		System.out.println("YOU CHOOSE \"M16\"");
	} else if(gun.equals("C") || (gun.equals("c"))) {
		System.out.println("YOU CHOOSE \"M60\"");
	} else if(gun.equals("D") || (gun.equals("d"))) {
		System.out.println("YOU CHOOSE \"SPAS-12\"");
	} else {
		System.out.println("INVALID KEYWORD");
	}
	
	// CONDITION STATEMENT + MULTIPLE WORDS TYPING = input.nextLine();
	System.out.println("TYPE THIS WORD TO CONFIRM DELETION \"DELETE ALL FILES\"");
	String confirm = input.nextLine();
	
	if(confirm.equals("DELETE ALL FILES")) {
		System.out.println("SUCCESFULLY DELETED!");
	}else {
		System.out.println("INVALID KEYWORD TRY AGAIN!");
		
	}
	
	//* to repeat the loop if you put wrong sentence use while loop.
	
	
	
   }
}