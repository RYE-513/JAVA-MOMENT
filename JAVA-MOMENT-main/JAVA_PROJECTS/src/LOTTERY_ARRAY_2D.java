public class LOTTERY_ARRAY_2D {

	public static void main(String[] args) {
		  //COLUMNS (VERTICAL)  //0 //1 //2 //3      // *IN COLUMNS: keep in mind that zero "0" is the "first number".*
		int [][] lotterycard = { {20,15, 7, 65}, //1  //0 
								 {8, 7, 19, 43}, //2  //1	
								 {7, 13, 47, 02},//3  //2
								 {4, 69, 135, 8},//4  //3	
								 {76, 56, 34, 53}//5  //4    ROWS LISTING *START COUNTING IN 0*	
								 				 //ROWS
								 				//COUNTING IN [5][5]
		};

		int [][] lotterycard2 = new int [5][5]; //this [5][5] these are the numbers of ROWS "above" it will start
												//counting by "1" NOT zero "0".
				   //R  C
		lotterycard2[0][0] = 20;				//in terms of listing those numbers it will literally start by "0"	
		lotterycard2[0][1] = 15;
		lotterycard2[0][2] = 7;
		lotterycard2[0][3] = 65;

		lotterycard2[1][0] = 8;
		lotterycard2[1][1] = 7;
		lotterycard2[1][2] = 19;
		lotterycard2[1][3] = 43;

		lotterycard2[2][0] = 7;
		lotterycard2[2][1] = 13;
		lotterycard2[2][2] = 47;
		lotterycard2[2][3] = 02;

		lotterycard2[3][0] = 4;
		lotterycard2[3][1] = 69;
		lotterycard2[3][2] = 135;
		lotterycard2[3][3] = 8;

		lotterycard2[4][0] = 76;
		lotterycard2[4][1] = 56;
		lotterycard2[4][2] = 34;
		lotterycard2[4][3] = 53;

//		System.out.println(lotterycard2[2][2]);  //it will run in specific array
//		System.out.println("");

		for(int rye = 0; rye < 4; rye++ ) {       //the console will be shown as 20, 7, 47, 8 it reads diagonal constant
			System.out.println(lotterycard[rye][rye]);  //if the range is exceeded in "rye < like"5"; rye++" it will error

		}   //for(int rye = "0" zero is the constant number if you changed it...
			//....IN >>int rye = "1" or "2"<< the first number will not be shown like 7, 47, 8

			// for(int rye = 2 or 3; rye < 2 or 3; rye++ )....if they are same range the console will not be shown
			//for(int rye = 0; rye < "4"; rye++ ) the 4 of it is the number of range diagonal 
													//if you change it to other numbers it will not be shown.


//		System.out.println("---------------------------");		
//		for(int i = 0; i < 3; i++) {
//			for(int j = 0; j < 3; j++) {
//				System.out.println(lotterycard[i][j]);
//			}
//		}
//		System.out.println("---------------------------");
//		for(int j = 0; j < 3; j++) {
//			for(int k = 0;  k < 3; k++) {
//				System.out.println(lotterycard[j][k]);
//			}
//		}





	}

}