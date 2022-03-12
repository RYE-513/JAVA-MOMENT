
public class BOOLEAN_COMPARISON {

	public static void main(String[] args) {
		
		//BOOLEAN has only "TRUE" && "FALSE".
		
		int jonBalance = 35;
		int ryeBalance = 14;
		int brizBalance = 6;
		

		
		boolean result =  (jonBalance < 40);
			System.out.println(result); //TRUE. because "40" is bigger number than jonBalance = "35"
			
		boolean results = (ryeBalance > 16);
			System.out.println(results); //FALSE. because ryeBalance = "14" is smaller than "16".
			
		boolean resultsa = (brizBalance == 6); //"==" this is correct equal operator. not this "=".
			System.out.println(resultsa); //TRUE.  because they are both equal.
		
		boolean resultsas = (brizBalance != 10); // "!=" this is not equal operator.
			System.out.println(resultsas); //TRUE.  because they are not equal.
			
		boolean resultsass = !(brizBalance == 6); // putting "!" in first syntax
			System.out.println(resultsass); //TRUE BECOMES FALSE.  because "!" make the answer vice versa.
			
	}

}
