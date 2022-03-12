
public class PRIMITIVE_INTEGER_TYPES {

	public static void main(String[] args) {
		
		/* PRIMITIVE DATA TYPES: INT, BYTE, LONG, SHORT, BOOLEAN, CHAR, DOUBLE, FLOAT
		 * they are "purple bold text" it means they are primitive simple means "primary"
		 * 
		 * "String" is "non-purple bold text" because its contains series of text.
		 * 
		 */
		
		
		/*
		 * byte		-128 .. 127             
		 * short	-32,768 .. 32,767
		 * int		-2,147,483,648 .. 2,147,483,647
		 * long		-9,223,372,036,854,775,808 .. 9,223,372,036,854,775,807   "you need to put "L" before ";" to make it long data type. like this, long number = 126173461872L;
		 * float	 3.40282347 x 1038, 1.40239846 x 10-45 "you need to put "F" before ";" to make it float data type. like this, long number = 128.016F;
		 * double	 1.7976931348623157 x 10308, 4.9406564584124654 x 10-324 
		 * 
		 */
		
		// AUTO COMPUTE
		int AA = 46;
		int BB = 89;
		int CC = 98;
		int DD = -678;
		int EE = AA + BB;
		System.out.println("ANSWER  " +EE);
		
		// SPECIFIC COMPUTE
		int AAA = 43;
		int BBB = 89;
		int CCC = 98;
		int DDD = -678;
		int EEE = AA + BB;
		System.out.println("ANSWER  " +AAA + BBB); //you can find the answer immediately.
		
		// LONG, SHORT && BYTE COMBINE
		long ABC = 1288568L;
		short CDE = 88;
		byte FGH = 1;
		System.out.println("ANSWER  " +ABC + CDE + FGH);
		
		// INT && FLOAT COMBINE
		int Q = 444;
		float R = 44.4F;
		float S = Q + R;
		System.out.println("ANSWER  " +S);
		
		// DOUBLE && FLOAT COMBINE
		float A = 13.8F, B = 148;    //you can type multiple value in one data type.
		double C = 13.89;
		double D = B + A + C;
		System.out.println("ANSWER  " +D);
		
		// MULTIPLE OPERATOR IN ONE DATA TYPE
		int X = 13+8/2;
		int Y = 45;
		int Z = X + Y;
		System.out.println("ANSWER  " +Z);
		
		// MULTIPLE INT +VAR+VAR+VAR
		int age = 23;
		age = age+age+age/24+1211;
		System.out.println("ANSWER  " +age);

	}

}
