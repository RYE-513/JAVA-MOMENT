import java.util.Scanner;

public class MULTIPLICATION_TABLE_GENERATOR {

	public static void main(String[] args) {
		
		Scanner multip = new Scanner(System.in);
		
		int R, B;
		System.out.println("ENTER TABLE NUMBER");
		B = multip.nextInt();
		R = 0;
			while(R<=10) {
				System.out.println(R+"*"+B+"="+R*B);
				R++;

	}

}
}
