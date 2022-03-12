import java.util.Scanner;

public class BOOLEAN_SCANNER {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("IS PHILIPPINE AN ARCHIPELAGO COUNTRY? TRUE || FALSE");
		boolean rye = input.nextBoolean();
	
		if(rye) {          // ".equals" is use only in Strings
			System.out.println("+100");
		} else {
			System.out.println("-999");
		}
		
		
		
		
		
		
		
	}
}