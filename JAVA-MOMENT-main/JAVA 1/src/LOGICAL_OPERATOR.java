public class LOGICAL_OPERATOR {
		public static void main(String[] args) {


			// "&&" it means "AND".
			// "||" it means "OR".
			// "!" it means "NOT".

			// && - is majority *FALSE*
			// e.g. TRUE && FALSE = FALSE
			//		FALSE && TRUE && FALSE = FALSE
			//		TRUE && TRUE && TRUE && FALSE = FALSE
			//		TRUE && TRUE = TRUE   *because they are same no majority here*
			// 		FALSE && FALSE = FALSE

			// || - is majority *TRUE*
			// e.g. TRUE && FALSE = TRUE
			//		FALSE && TRUE && FALSE = TRUE
			//		FALSE && FALSE && FALSE && TRUE = TRUE
			//		TRUE && TRUE = TRUE   
			// 		FALSE && FALSE = FALSE *because they are same no majority here*


			int jon = 8;
			int rye = 13;
			int russia = 89;
			int telets = 513;

			// T, T = T
			// T, F = F

			// boolean bscs = !(8 < 13 || jon == 8) && (rye != 8 && 135 < jon);

			//T, F = F
			//F, T = T

			// boolean bscsII = !(8 == 45 && russia > 90) || (jon == russia || !(-564.56 < rye));

			//F, T = T 
			//F, F = F
			//F, T = F


			boolean bscsIII = (-98.6 == jon || !(russia < rye)) && !(telets == telets && (1.678 > telets)) || (telets < jon && !(45 < rye));

			System.out.println(bscsIII);






		}


	} 