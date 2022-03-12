import java.util.Scanner;

public class WHILE_LOOP_PASSWORD {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("ENTER YOUR PASSWORD:");
		String password = input.next();
		
		while(!password.equals("ryebriz513")) {
			System.out.println("INCORRECT PASSWORD, PLEASE TRY AGAIN");
			password = input.next();
			System.out.println("2ND ATTEMPT");
			password = input.next();
			System.out.println("LAST ATTEMPT");
			password = input.next();
		}
		
		System.out.println("WELCOME!");
		
		System.out.println("TYPE THIS SENTENCE TO PROCEED: \"RYE BSCS PhD\"");
		String typeKeyword = input.nextLine();
		
		while(!typeKeyword.equals("RYE BSCS PhD")) {
			System.out.println("PLEASE TRY AGAIN!");
			typeKeyword = input.nextLine();
		} 
		
		System.out.println("WELCOME!");
		
		
		
	}
}