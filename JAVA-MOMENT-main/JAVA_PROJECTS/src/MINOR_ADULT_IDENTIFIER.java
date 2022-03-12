import java.util.Scanner;

public class MINOR_ADULT_IDENTIFIER {

		public static void main(String[] args) {
		Scanner min = new Scanner(System.in);
		
		System.out.println("---ADULT MINOR GENERATOR---");
		System.out.println(" ");
		System.out.println("ENTER UR AGE TO KNOW IF U ARE NOT A MINOR");
		
		int age = min.nextInt();
		
		if(age >= 19 && age <=100) {
			System.out.print("  ADULT!?");
		} else if(age >=12 && age <=18) {
			System.out.print("  a MINOR!?");
		} else {
			System.out.println(" INVALID AGE");
		}
	}

}
