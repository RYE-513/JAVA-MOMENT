
public class BOOLEAN_CONDITION_STATEMENT {

	public static void main(String[] args) {
		
		boolean russiaBigCountry = true;
		boolean mongoliaBiggerCountry = false;
		
		if (russiaBigCountry){
			System.out.println("THATS TRUE!");
		}
		if (mongoliaBiggerCountry) {
			System.out.println("FALSE!, RUSSIA IS BIGGER COUNTRY");
		}
		else {
			System.out.println("invalid");
		}
		
		// IF THERE IS NO "ELSE IF" the both true boolean will run *if they declare only "true"*
		// MUCH BETTER THERE IS "ELSE IF" IF THE STATMENTS "IF" EXCEEDED TO ONE. THEN USE "ELSE IF" NOT "IF"
		
		System.out.println("");
		
		boolean russiaBigCountrys = true;
		boolean mongoliaBiggerCountrys = true;
		
		if (russiaBigCountrys){
			System.out.println("THATS TRUE!");
		}
		else if (mongoliaBiggerCountrys) {
			System.out.println("FALSE!, RUSSIA IS BIGGER COUNTRY");
		}
		else {
			System.out.println("invalid");
		}
		
		//IN THIS SECOND ANALOGY THERE IS "ELSE IF" 
		//but the "mongoliaBiggerCountrys" is not shown, even that the boolean is declare a "true"
		//because only "IF" shown as a true.
		


	}

}
