import java.util.Scanner;

public class SCANNER_INPUT {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);  //it shown error because you not declaring "import java.util.Scanner;" it always putted in upper public class.
			//use "input" variable to look formal and easy to recognize.
		
		
		//String word = input.next();    IF YOU TYPE: RYAN BRIZ BSCS it shown only "RYAN", it only consider the first word you type
		//String word = input.nextLine(); IF YOU TYPE: RYAN BRIZ BSCS it shown "RYAN BRIZ BSCS" because you put "Line" in input.next, it shown those spaces
		
		System.out.println("TYPE ANY 3 WORDS");   // .nextLine is only first to place than .next only
		String words = input.nextLine();
		
		System.out.println("WHAT IS YOU'RE NAME?");
		String name = input.next();
		
		System.out.println("HOW OLD ARE YOU?");
		int age = input.nextInt();
		
		System.out.println("FAVORITE LETTER");
		char let = input.next().charAt(0);
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(let);
		System.out.println(words);

	}

}
