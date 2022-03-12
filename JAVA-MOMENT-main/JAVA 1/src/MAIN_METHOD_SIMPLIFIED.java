import java.util.Scanner;

public class MAIN_METHOD_SIMPLIFIED {
	public static void main(String[] args) {
	
	

	sayNice();	
	sayThis("LOOK");
	
	methodPlain();
	methodString("RYE BSCS");
	methodInteger(100);
	
	int[] nums = {102, 898, 531, 3515, 796};
	methodArray(nums);
	
	methodScanner();
	
	
	}
	
	
	
	static void sayNice() {
		
		Scanner input = new Scanner(System.in);	
		String rye = input.nextLine();
		
		System.out.println(rye);
	}
	
	/* putting "PUBLIC" before static void is you giving access to another class file.
	 * Scanner syntax is literally put in specific method
	 * 
	 * if you make another method e.g. static void sayNice() *don't need to put ";"
	 * type "  sayNice();  " in main method to work this on console.
	 * 
	 */
	
	static void sayThis(String hello) {
		System.out.println(hello);
	}
	
	static void sayNumbers(Integer nums) {
		System.out.println(nums);
	}
	
	/* static void sayNumbers(Integer nums) - same
	 * static void sayNumbers(int nums) - same
	 * 
	 * if you declare a scanner just make it under a new method and erase the data type
	 */
		
		static void methodPlain() {
			System.out.println("JUST A PLAIN MAH BRO");
		}
		
		static void methodString(String text) {
			System.out.println(text);
		}
		
		static void methodInteger(int num) {
			System.out.println(num);
		}
		
		static void methodArray(int nums[]) {
			for(int i = 0; i < nums.length; i++) {
				System.out.println(nums[i]);
		}
		}
			
		static void methodScanner() {
			Scanner input = new Scanner(System.in);
			String text = input.nextLine();
			System.out.println(text);		
			
		}
		
	
	}