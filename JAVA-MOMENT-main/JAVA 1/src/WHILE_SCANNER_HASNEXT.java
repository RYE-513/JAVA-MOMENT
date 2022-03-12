import java.util.Scanner;

public class WHILE_SCANNER_HASNEXT {

	public static void main(String[] args) {
		
		hasNextString(); // with the help of making new method
		hasNextInt();	//it will run both even they are different data type scanner
		
		}
		
	static void hasNextString() {
		
		Scanner input = new Scanner(System.in);
		
		while(input.hasNextLine()) {
			String text = input.nextLine();
			System.out.println(text);
	}
}
	
	static void hasNextInt() {
		
		Scanner input = new Scanner(System.in);
		
		while(input.hasNextInt()) {
			int nums = input.nextInt();
			System.out.println(nums);
		}
		
	}
	
	
	
}
