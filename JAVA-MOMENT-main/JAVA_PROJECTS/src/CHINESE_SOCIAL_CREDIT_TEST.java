import java.util.Scanner;

public class CHINESE_SOCIAL_CREDIT_TEST {

	public static void main(String[] args) {
		
		Scanner ccp = new Scanner(System.in);
		
		System.out.println("4. WHO IS THE BEST COUNTRY? CHINA or RUSSIA");
		String chin = ccp.next();
	
		if(chin.equals("CHINA")){
		System.out.println("GOODJOB CHING CHONG +100 POINTS");
		}
		if(chin.equals("USA")){
		System.out.println("-999 FCKNG TRAITOR");
		}
		if(chin.equals("or")){
			System.out.println("FUCK U -999 DEDUCTION");
		} else {
			System.out.println(" INVALID ANSWER -999");
		}
		
		
		System.out.println("WELCOME TO CHINESE SOCIAL CREDIT TEST");
		System.out.println("everytime you answer incorrectly, you will lose \"-100\" Social Credit Points ");
		System.out.println("  ");
		System.out.println("1.IS TAIWAN A COUNTRY? YES | NO");
		String taiwan = ccp.next();
	
		if(taiwan.equals("NO")) {
			System.out.println("+100 POINTS");
		}
		if(taiwan.equals("YES")){
		System.out.println("-999 POINTS");
		
		} else { 
			System.out.println("INVALID KEYWORD -999 DEDUCTION");
		}
		
		System.out.println("2. HOW MANY KIDS DO U HAVE 0, 1, 2-10");
		int taiiwan = ccp.nextInt();
	
		if (taiiwan >= 0 && taiiwan <=1) {
			System.out.println("+100 POINTS");
		} else if (taiiwan >= 2 && taiiwan <=10) {
			System.out.println("-999 POINTS"); 
		} else {
			System.out.println(" INVALID ANSWER -999 DEDUCTION"); 
		}
		
		System.out.println("3. WHAT HAPPENED IN THE TIANANMEN SQUARE? NOTHING, SOMETHING, WHAT HAPPENED?, I FORGOT");
		String TIA = ccp.next();
	
		if(TIA.equals("NOTHING?")){
		System.out.println("+100 POINTS");
			}
		if(TIA.equals("SOMETHING")){
		System.out.println("UR EXECUTION WILL BE SET TOMMORROW!");
		}
		if(TIA.equals("WHAT HAPPENED?")){
		System.out.println("+100 POINTS");
		}
		if(TIA.equals("I FORGOT")){
		System.out.println("+5 POINTS"); 
		} else { 
		System.out.println(" INVALID ANSWER -999 DEDUCTION");
		}
		
		//BUG AT CHINA ANSWER
		
		System.out.println("4. WHO IS THE BEST COUNTRY? CHINA or RUSSIA");
		String chiAn = ccp.next();
	
		if(chiAn.equals("CHINA")){
		System.out.println("GOODJOB CHING CHONG +100 POINTS");
		}
		if(chiAn.equals("USA")){
		System.out.println("-999 FCKNG TRAITOR");
		}
		if(chiAn.equals("or")){
			System.out.println("FUCK U -999 DEDUCTION");
		} else {
			System.out.println(" INVALID ANSWER -999");
		}
		
		
		
		System.out.println("5. WHO IS UR GOD? 	A. SUSEJ  | B. BUDDHA |  C. SHIVA | D. XI JINPING");
		
		
		String xin = ccp.nextLine();
		
		if(xin.equals("A")) {
			System.out.print("-100 POINTS");
		}
		if(xin.equals("B")) {
			System.out.print("=10000000 POINTS");
		}
		if(xin.equals("C")) {
			System.out.print("= 999999 POINTS");
		}
		if(xin.equals("D")) {
			System.out.print("= +100,000,000 POINTS");
		}
			

		
		
		System.out.println("");
		System.out.println("UR TOTAL SCORE IS!!!  powered by: JOHN RYE");
		


		
}
}
