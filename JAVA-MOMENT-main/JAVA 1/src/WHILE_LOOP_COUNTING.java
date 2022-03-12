import java.util.Scanner;

public class WHILE_LOOP_COUNTING {
	public static void main(String[] args) {
	
		//countUp();
		//countDown();
		manualCounter();
		
		
	}	
	
	public static void countUp() {
	
	Scanner input = new Scanner(System.in);
		
	System.out.println("COUNTING UP: TYPE ANY NUMBER!");
	int firstNumber = input.nextInt();
	
	System.out.println("TYPE LAST NUMBER!");
	int lastNumber = input.nextInt();  // if you want to fix the range change it to... int lastNumber = 100;
	
	
	while(firstNumber <= lastNumber) {
		System.out.println(firstNumber);
		firstNumber = firstNumber +1;
	}
	
	}
	
	
	public static void countDown() {
		
	Scanner input = new Scanner(System.in);
		
	System.out.println("COUNTING DOWN: TYPE ANY NUMBER!");
	int belowFirstNumber = input.nextInt();
	
	System.out.println("TYPE LAST NUMBER");
	int belowLastNumber = input.nextInt();
	
	while(belowFirstNumber >= belowLastNumber) {
		System.out.println(belowFirstNumber);
		belowFirstNumber = belowFirstNumber -1;
	}	
	}
	
	public static void manualCounter() {
		
		int num = 0; // this is the first step to make this syntax  
		
		while(num <= 10) { // while(0 <= 10) { it will run unspecific-endless int value.
			System.out.println(num);
			num++; // without this increment it will run endless specific integer value.
		
		 // THESE ARE BOTH SAME.
		 // num++;
		 // num = num +1;
			
		// adding more increment in this syntax.
			
		/* 2nd increment num++; * shows even numbers.
		 * 3rd increment num++;	* shows odd numbers.
		 * 4th increment... num++; * divisible numbers.
		 * 
		 * 
		 */
	
		
		
		
		}
		
		
		
		
		
		
		
	}
		
		
	
}
