import java.util.Scanner;

public class CODM_GUNSMITH {

	public static void main(String[] args) {
		System.out.println("CHOOSE PRIMARY WEAPON: AR, SMG, SNIPER, SHOTGUN, LMG");
		Scanner codm = new Scanner(System.in);
		String prime = codm.next();
		
		if (prime.equals("AR") || prime.equals("ar")) {
			System.out.print("ASSAULT RIFLE: TYPE-25, M16, AK47, M4A1, ASM-10");
			String ar = codm.next();
				if (ar.equals("TYPE-25"))
					System.out.println("YOU CHOOSE: TYPE-25");
				else if (ar.equals("M16"))
					System.out.println("YOU CHOOSE: M16");
				else if (ar.equals("AK47"))
					System.out.println("YOU CHOOSE: AK47");
						System.out.print("CHOOSE CAMO: GOLD, PLATINUM, DAMASCUS, DIAMOND, AETHER");
						String arcamo = codm.next();
							if (arcamo.equals("GOLD"))
								System.out.println("1ST WEAPON: AK47 GOLD");
							else if (arcamo.equals("PLATINUM"))
								System.out.println("1ST WEAPON: AK47 PLATINUM");
							else if (arcamo.equals("DAMASCUS"))
								System.out.println("1ST WEAPON: AK47 DAMASCUS");
							else if (arcamo.equals("DIAMOND"))
								System.out.println("1ST WEAPON: AK47 DIAMOND");
							else if (arcamo.equals("AETHER"))
								System.out.println("1ST WEAPON: AK47 AETHER");
								
				
				else if (ar.equals("M4A1"))
					System.out.println("YOU CHOOSE: M4A1");
				else if (ar.equals("ASM-10"))
					System.out.println("YOU CHOOSE: ASM-10");
				else {
					System.out.print("INVALID AR");
				}
		}
			
				
		else if (prime.equals("SMG") || prime.equals("smg")) {
					System.out.print("SMG: MP5, MP7, SKORPION, VECTOR, P90");
					String smg = codm.next();
				if (smg.equals("MP5"))
					System.out.println("YOU CHOOSE: MP5");
				else if (smg.equals("MP7"))
					System.out.println("YOU CHOOSE: MP7");
				else if (smg.equals("SKORPION"))
					System.out.println("YOU CHOOSE: SKORPION");
				else if (smg.equals("VECTOR"))
					System.out.println("YOU CHOOSE: VECTOR");
				else if (smg.equals("P90"))
					System.out.println("YOU CHOOSE: P90");
				else {
					System.out.print("INVALID SMG");
				}
		}
		
		else if (prime.equals("SNIPER") || prime.equals("sniper")) {
					System.out.print("SNIPER: NA-45, RYTEC AMR, DLQ, ARTIC-50, OUTLAW");
						String snp = codm.next();
				if (snp.equals("NA-45"))
						System.out.println("YOU CHOOSE: NA-45");
				else if (snp.equals("RYTEC AMR"))
						System.out.println("YOU CHOOSE: RYTEC AMR");
				else if (snp.equals("DLQ"))
						System.out.println("YOU CHOOSE: DLQ");
				else if (snp.equals("ARTIC-50"))
						System.out.println("YOU CHOOSE: ARTIC-50");
				else if (snp.equals("OUTLAW"))
						System.out.println("YOU CHOOSE: OUTLAW");
				else {
						System.out.print("INVALID SNIPER");
				}
		}
		
		else if (prime.equals("SHOTGUN") || prime.equals("shotgun")) {
					System.out.print("SHOTGUN: BY15, KRM, STRIKER, AA-12, HS2126 ");
						String sg = codm.next();
				if (sg.equals("BY15"))
						System.out.println("YOU CHOOSE: BY15");
				else if (sg.equals("KRM"))
						System.out.println("YOU CHOOSE: KRM");
				else if (sg.equals("STRIKER"))
						System.out.println("YOU CHOOSE: STRIKER");
				else if (sg.equals("AA-12"))
						System.out.println("YOU CHOOSE: AA-12");
				else if (sg.equals("HS2126"))
						System.out.println("YOU CHOOSE: HS2126");
				else {
						System.out.print("INVALID SHOTGUN");
				}
		}
		
		else if (prime.equals("LMG") || prime.equals("lmg")) {
					System.out.print("LMG: S36, M4LMG, UL736, CHOPPER, RPD ");
						String sg = codm.next();
						if (sg.equals("S36"))
								System.out.println("YOU CHOOSE: S36");
						else if (sg.equals("M4LMG"))
								System.out.println("YOU CHOOSE: M4LMG");
						else if (sg.equals("UL736"))
								System.out.println("YOU CHOOSE: UL736");
						else if (sg.equals("CHOPPER"))
								System.out.println("YOU CHOOSE: CHOPPER");
						else if (sg.equals("RPD"))
								System.out.println("YOU CHOOSE: RPD");
						else {
								System.out.print("INVALID LMG");
				}
		}
		
		System.out.println(" ");
		System.out.println("CHOOSE ANOTHER PRIMARY WEAPON: AR, SMG, SNIPER, SHOTGUN, LMG");
		String sprime = codm.next();
		
		if (sprime.equals("AR") || sprime.equals("ar")) {
			System.out.print("ASSAULT RIFLE: TYPE-25, M16, AK47, M4A1, ASM-10");
			String ar = codm.next();
				if (ar.equals("TYPE-25"))
					System.out.println("YOU CHOOSE: TYPE-25");
				else if (ar.equals("M16"))
					System.out.println("YOU CHOOSE: M16");
				else if (ar.equals("AK47"))
					System.out.println("YOU CHOOSE: AK47");
						System.out.print("CHOOSE CAMO: GOLD, PLATINUM, DAMASCUS, DIAMOND, AETHER");
						String arcamo = codm.next();
							if (arcamo.equals("GOLD"))
								System.out.println("AK47 GOLD");
							else if (arcamo.equals("PLATINUM"))
								System.out.println("AK47 PLATINUM");
							else if (arcamo.equals("DAMASCUS"))
								System.out.println("AK47 DAMASCUS");
							else if (arcamo.equals("DIAMOND"))
								System.out.println("AK47 DIAMOND");
							else if (arcamo.equals("AETHER"))
								System.out.println("AK47 AETHER");
								
				
				else if (ar.equals("M4A1"))
					System.out.println("YOU CHOOSE: M4A1");
				else if (ar.equals("ASM-10"))
					System.out.println("YOU CHOOSE: ASM-10");
				else {
					System.out.print("INVALID AR");
				}
		}
			
				
		else if (sprime.equals("SMG") || sprime.equals("smg")) {
					System.out.print("SMG: MP5, MP7, SKORPION, VECTOR, P90");
					String smg = codm.next();
				if (smg.equals("MP5"))
					System.out.println("YOU CHOOSE: MP5");
				else if (smg.equals("MP7"))
					System.out.println("YOU CHOOSE: MP7");
				else if (smg.equals("SKORPION"))
					System.out.println("YOU CHOOSE: SKORPION");
				else if (smg.equals("VECTOR"))
					System.out.println("YOU CHOOSE: VECTOR");
				else if (smg.equals("P90"))
					System.out.println("YOU CHOOSE: P90");
				else {
					System.out.print("INVALID SMG");
				}
		}
		
		else if (sprime.equals("SNIPER") || sprime.equals("sniper")) {
					System.out.print("SNIPER: NA-45, RYTEC AMR, DLQ, ARTIC-50, OUTLAW");
						String snp = codm.next();
				if (snp.equals("NA-45"))
						System.out.println("YOU CHOOSE: NA-45");
				else if (snp.equals("RYTEC AMR"))
						System.out.println("YOU CHOOSE: RYTEC AMR");
				else if (snp.equals("DLQ"))
						System.out.println("YOU CHOOSE: DLQ");
				else if (snp.equals("ARTIC-50"))
						System.out.println("YOU CHOOSE: ARTIC-50");
				System.out.print("CHOOSE CAMO: GOLD, PLATINUM, DAMASCUS, DIAMOND, AETHER");
				String snpcamo = codm.next();
					if (snpcamo.equals("GOLD"))
						System.out.println("2ND WEAPON: ARTIC-50 GOLD");
					else if (snpcamo.equals("PLATINUM"))
						System.out.println("2ND WEAPON: ARTIC-50 PLATINUM");
					else if (snpcamo.equals("DAMASCUS"))
						System.out.println("2ND WEAPON: ARTIC-50 DAMASCUS");
					else if (snpcamo.equals("DIAMOND"))
						System.out.println("2ND WEAPON: ARTIC-50 DIAMOND");
					else if (snpcamo.equals("AETHER"))
						System.out.println("2ND WEAPON: ARTIC-50 AETHER");
				else if (snp.equals("OUTLAW"))
						System.out.println("YOU CHOOSE: OUTLAW");
				else {
						System.out.print("INVALID SNIPER");
				}
		}
		
		else if (sprime.equals("SHOTGUN") || sprime.equals("shotgun")) {
					System.out.print("SHOTGUN: BY15, KRM, STRIKER, AA-12, HS2126 ");
						String sg = codm.next();
				if (sg.equals("BY15"))
						System.out.println("YOU CHOOSE: BY15");
				else if (sg.equals("KRM"))
						System.out.println("YOU CHOOSE: KRM");
				else if (sg.equals("STRIKER"))
						System.out.println("YOU CHOOSE: STRIKER");
				else if (sg.equals("AA-12"))
						System.out.println("YOU CHOOSE: AA-12");
				else if (sg.equals("HS2126"))
						System.out.println("YOU CHOOSE: HS2126");
				else {
						System.out.print("INVALID SHOTGUN");
				}
		}
		
		else if (sprime.equals("LMG") || sprime.equals("lmg")) {
					System.out.print("LMG: S36, M4LMG, UL736, CHOPPER, RPD ");
						String sg = codm.next();
						if (sg.equals("S36"))
								System.out.println("YOU CHOOSE: S36");
						else if (sg.equals("M4LMG"))
								System.out.println("YOU CHOOSE: M4LMG");
						else if (sg.equals("UL736"))
								System.out.println("YOU CHOOSE: UL736");
						else if (sg.equals("CHOPPER"))
								System.out.println("YOU CHOOSE: CHOPPER");
						else if (sg.equals("RPD"))
								System.out.println("YOU CHOOSE: RPD");
						else {
								System.out.print("INVALID LMG");
				}
		}
		
		
		
		
		
		
			
		System.out.println(" ");
		System.out.print("CHOOSE SECONDARY WEAPON: MELEE, LAUNCHER, HANDGUN");
		String sec = codm.next();
		
		if (sec.equals("MELEE") || sec.equals("melee")) {
			System.out.print("MELEE: KATANA, AXE, KARAMBIT");
			String mel = codm.next();
				if (mel.equals("KATANA"))
					System.out.print("YOU CHOOSE: KATANA");
				else if (mel.equals("AXE"))
					System.out.print("YOU CHOOSE: AXE");
				else if (mel.equals("KARAMBIT"))
					System.out.print("YOU CHOOSE: KARAMBIT");
				else {
					System.out.print("INVALID MELEE");
				}
				
		} else if (sec.equals("LAUNCHER") || sec.equals("launcher")) {
			System.out.print("LAUNCHER: SMRS, FHJ-18, RPG");
			String laun = codm.next();
				if (laun.equals("SMRS"))
						System.out.print("YOU CHOOSE: SMRS");
				else if (laun.equals("FHJ-18"))
					System.out.print("YOU CHOOSE: FHJ-18");
				else if (laun.equals("RPG"))
					System.out.print("YOU CHOOSE: RPG");
				else {
					System.out.print("INVALID LAUNCHER");
				}
		} else if (sec.equals("HANDGUN") || sec.equals("handgun")) {
			System.out.print("HANDGUN: MAUSER, DEAGLE, M118, J358, RENETTI");
			String hand = codm.next();
				if (hand.equals("MAUSER"))
					System.out.print("YOU CHOOSE: MAUSER");
				else if (hand.equals("DEAGLE"))
					System.out.println("YOU CHOOSE: DEAGLE");
					System.out.println("CHOOSE CAMO: GOLD, PLATINUM, DAMASCUS, DIAMOND, AETHER");
						String arcamo = codm.next();
					if (arcamo.equals("GOLD"))
						System.out.println("SECONDARY WEAPON: DEAGLE GOLD");
					else if (arcamo.equals("PLATINUM"))
						System.out.println("SECONDARY WEAPON: DEAGLE PLATINUM");
					else if (arcamo.equals("DAMASCUS"))
						System.out.println("SECONDARY WEAPON: DEAGLE DAMASCUS");
					else if (arcamo.equals("DIAMOND"))
						System.out.println("SECONDARY WEAPON: DEAGLE DIAMOND");
					else if (arcamo.equals("AETHER"))
						System.out.println("SECONDARY WEAPON: DEAGLE AETHER");
					
				
				else if (hand.equals("M118"))
					System.out.print("YOU CHOOSE: M118");
				else if (hand.equals("J358"))
					System.out.print("YOU CHOOSE: J358");
				else if (hand.equals("RENETTI"))
					System.out.print("YOU CHOOSE: RENETTI");
					
					
				
			
				// AMMO ROUNDS
				// STATS
				// YOUR WEAPONS ARE

	}

}
}
