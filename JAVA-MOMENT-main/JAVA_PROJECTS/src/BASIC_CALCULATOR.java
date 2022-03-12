import java.util.Scanner;

public class BASIC_CALCULATOR {
	
	public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	int num1,num2,num3,num4,num5,add;
	
	System.out.print("MDAS CALCULATOR");
	
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("");	

	num1=s.nextInt();
	num2=s.nextInt();
	num3=s.nextInt();
	num4=s.nextInt();
	num5=s.nextInt();

	add=num1*num2/num3+num4-num5;
	System.out.println("ANSWER  "+add);
	
	
	
	}

}
