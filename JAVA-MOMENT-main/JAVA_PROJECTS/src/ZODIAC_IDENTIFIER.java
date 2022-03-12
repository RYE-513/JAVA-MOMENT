import java.util.Scanner;

class ZODIAC_IDENTIFIER {

	public static void main(String[] args) {
		
		//FIX THIS!!!
		
		Scanner zodiac = new Scanner(System.in);
	
		System.out.println("ENTER A YEAR BETWEEN 1924-2031");
		int year = zodiac.nextInt();
		System.out.println("YOU ENTERED:	"+year);
		
		if(year >=1924 && year <= 2031) {
			System.out.printf("YOUR CHINESE ZODIAC SIGN is", getZodiac(year));
	} else {
			System.out.print("INVALID");
	}
		
	
	
}
{
}

		public static String getZodiac(int year) {
				int zodiacNum = (year - 1924) % 12;
				
				if(zodiacNum == 0) {
					return "RAT";
				} else {
					return "LLAMA";
				}
				
		
		
		
		

		
}
}		

