public class FOR_LOOP_SIMPLIFIED {

	public static void main(String[] args) {
		
		// FOR LOOP: PRINTING MULTIPLE WORDS. int "i" is always use. idk why.
		
		for(int i = 0; i < 10; i++) {
			System.out.println("RYE, PhD.");
		}
		
		// FOR LOOP: LISTING A NUMBER *its complex because "0" consider as first number.
		
		for(int j = 0; j < 10; j++) {
			System.out.println(j);
		}

		// FOR LOOP: .length SINGLE ARRAY PRINTING
		
		String[] name = {"JOHN", "RYAN", "JOSON", "NRIZ"};
		
		for(int k = 0; k < name.length; k++) {
			System.out.println(name[k]);
		}
		
		int[] nums = {83, 85, 93, 96, 90};
		
		for(int h = 0; h < nums.length; h++) {
			System.out.println(nums[h]);
		}

	}

}
