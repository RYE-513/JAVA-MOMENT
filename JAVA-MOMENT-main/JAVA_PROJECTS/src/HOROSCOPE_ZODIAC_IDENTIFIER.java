import java.util.Scanner;

public class HOROSCOPE_ZODIAC_IDENTIFIER {

	public static void main(String[] args) {
		
		System.out.println("WELCOME TO ZODIAC IDENTIFIER");
		System.out.println("");
		
		Scanner zs = new Scanner(System.in);
		
		System.out.print("WHAT IS YOUR BIRTH MONTH");
		String zsa = zs.next();
		
		if (zsa.equals("JANUARY") || zsa.equals("january") || zsa.equals("jan") || zsa.equals("JAN")) {
			System.out.print("WHAT IS YOU BIRTHDATE");
				int jan = zs.nextInt();  //JAN 20 TO FEB 18
					if(jan >= 20 && jan <= 31 || jan >= 1 && jan <= 18) {
						System.out.print("YOU ARE AQUARIUS");
					} else {
						System.out.print("INVALID DATE");
					}
		} 
		else if (zsa.equals("FEBRUARY") || zsa.equals("february") || zsa.equals("FEB") || zsa.equals("feb")) {
			System.out.print("WHAT IS YOU BIRTHDATE");
			int feb = zs.nextInt(); //FEB 19-MARCH 20
				if(feb >= 19 && feb <= 28 || feb >= 1 && feb <= 20 ) {
					System.out.print("YOU ARE PISCES");
				} else {
					System.out.print("INVALID DATE");
				}
				
		} 
		else if (zsa.equals("MARCH") || zsa.equals("march")) {
			System.out.print("WHAT IS YOU BIRTHDATE");
			int mar = zs.nextInt();
				if(mar >= 21 && mar <= 31 || mar >= 1 && mar <= 19) {
					System.out.print("YOU ARE ARIES");
				} else {
					System.out.print("INVALID DATE");
				}
			
		} 
		else if (zsa.equals("APRIL") || zsa.equals("april")) {
			System.out.print("WHAT IS YOU BIRTHDATE");
			int apr = zs.nextInt();
				if(apr >= 20 && apr <= 30 || apr >= 1 && apr <= 20) {
					System.out.println("YOU ARE TAURUS");
				} else {
					System.out.print("INVALID DATE");
				}
				
				
		}
		else if (zsa.equals("MAY") || zsa.equals("may")) {
			System.out.print("WHAT IS YOU BIRTHDATE");
			int my = zs.nextInt();
				if(my >= 20 && my <= 30 || my >= 1 && my <= 20) {
					System.out.println("YOU ARE TAURUS");
				} else {
					System.out.print("INVALID DATE");
				}

		}
		else if (zsa.equals("JUNE") || zsa.equals("june")) {
			System.out.print("WHAT IS YOU BIRTHDATE");
			int jn = zs.nextInt();
				if(jn >= 21 && jn <= 31 || jn >= 1 && jn <= 20) {
					System.out.println("YOU ARE GEMINI");
				} else {
					System.out.print("INVALID DATE");
				}
		}
		else if (zsa.equals("JULY") || zsa.equals("july")) {
			System.out.print("WHAT IS YOU BIRTHDATE");
			int jl = zs.nextInt();
				if(jl >= 21 && jl <= 30 || jl >= 1 && jl <= 22) {
					System.out.println("YOU ARE CANCER");
				} else {
					System.out.print("INVALID DATE");
				}
		}
		else if (zsa.equals("AUGUST") || zsa.equals("august") || zsa.equals("AUG") || zsa.equals("aug"))  {
			System.out.print("WHAT IS YOU BIRTHDATE");
			int aug = zs.nextInt();
				if(aug >= 23 && aug <= 31 || aug >= 1 && aug <= 22) {
					System.out.println("YOU ARE LEO");
				} else {
					System.out.print("INVALID DATE");
				}
		}
		else if (zsa.equals("SEPTEMBER") || zsa.equals("september") || zsa.equals("SEP") || zsa.equals("sep")) {
			System.out.print("WHAT IS YOU BIRTHDATE");
			int sp = zs.nextInt();
				if(sp >= 23 && sp <= 31 || sp >= 1 && sp <= 22) {
					System.out.print("YOU ARE VIRGO");
				} else {
					System.out.print("INVALID DATE");
				}
		}
		else if (zsa.equals("OCTOBER") || zsa.equals("october") || zsa.equals("OCT") || zsa.equals("oct")) {
			System.out.print("WHAT IS YOU BIRTHDATE");
			int ot = zs.nextInt();
				if(ot >= 23 && ot <= 30 || ot >= 1 && ot <= 22) {
					System.out.print("YOU ARE LIBRA");
				} else {
					System.out.print("INVALID DATE");
				}
		}
		else if (zsa.equals("NOVEMBER") || zsa.equals("november") || zsa.equals("NOV") || zsa.equals("nov")) {
			System.out.print("WHAT IS YOU BIRTHDATE");
			int nv = zs.nextInt();
				if(nv >= 23 && nv <= 31 || nv >= 1 && nv <= 21) {
					System.out.print("YOU ARE SCORPIO");
				} else {
					System.out.print("INVALID DATE");
				}
		}
		else if (zsa.equals("DECEMBER") || zsa.equals("december") || zsa.equals("DEC") || zsa.equals("dec")) {
			System.out.print("WHAT IS YOU BIRTHDATE");
			int sp = zs.nextInt();
				if(sp >= 22 && sp <= 30 || sp >= 1 && sp <= 21) {
					System.out.print("YOU ARE SAGITTARIUS");
				} else {
					System.out.print("INVALID DATE");
				}
		}
		else if (zsa.equals("DECEMBER") || zsa.equals("december") || zsa.equals("DEC") || zsa.equals("dec")) {
			System.out.print("WHAT IS YOU BIRTHDATE");
			int sp = zs.nextInt();
				if(sp >= 22 && sp <= 31 || sp >= 1 && sp <= 19) {
					System.out.print("YOU ARE VIRGO");
				} else {
					System.out.print("INVALID DATE");
				}
		} else {
			System.out.print("INVALID MONTH");
			
		}
			
				
		
		
		
		
	
}
}
