
public class INCREMENT_DECREMENT {

	public static void main(String[] args) {
		
		/* INCREMENT = "Incre" to Increase.
		 * DECREMENT = "Decre" to Decrease.
		 */
		
		for(int i = 0; i < 5; i++) {  // "i++" addition sign
			System.out.println(i);	  // this syntax shown the specific range.
		}
		
		for(int i = 0; i < 5; i--) {  // "i--" subtraction sign
			System.out.println(i);	  // this syntax shown like a while loop in negative numbers.
		}

		
	// PRE-INCREMENT (BEFORE) "x++;"
        // POST-INCREMENT (AFTER) "++x;"
        
        int x = 10;
        
        System.out.println(x++); // 10
        System.out.println(++x); // 12 this post increment will add 1
        
        int xx = 10;
        
        System.out.println(++xx); // 11
        System.out.println(xx++); // 11
        
        int y = 10;
        
        System.out.println(y--); // 10
        System.out.println(--y); // 8 this post decrement will subtract 2
        
        int yy = 10;
        
        System.out.println(--yy); // 9
        System.out.println(yy--); // 9
		
	}
}
