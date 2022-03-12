
public class COMMENTS_ESCAPE_SEQUENCES {

	public static void main(String[] args) {
	
		
	   // THIS IS COMMENT TYPE. IF YOU PUT DOUBLE SLASHES "//" THEN THE TEXT TURN "GREEN"
	   // IT USED TO TURN OFF THE SYNTAX AND TO NOT SHOWN IN CONSOLE.
		
	   /* THIS IS SECOND TYPE OF COMMENT. TYPE "/" then "shift+F8" and press enter to expand.
	    * IT USED TO EASILY DECLARE ANOTHER COMMENT.
	    * 
	    * TO LESS DIFFICULT TO TYPE "//" IN EVERY LINE MANUALLY.
	    */
		
		
		//   \"FAT GUY?\" EXPLANATION: putting backslashes "\" with "" is used to put quotation marks in print statements.
		System.out.println("WHAT DO YOU MEAN \"FAT GUY?\"  ");
		
		//  \\ProgramFilesx86\\Users\\Ryan\\Desktop EXPLANATION: use double backslashes "\\" in print statements if you talking about the file location.
		System.out.println("THE MATH ROCK SONGS WAS LOCATE AT \\ProgramFilesx86\\Users\\Ryan\\Desktop");
		
		//   \t EXPLANATION: backslashes with "t" means TAB. it use to adjust the spaces if you want long spaces. it is easy than long spacing type "               ".
		System.out.println("TAB BAR \t     HEHE");
		
		//  \n EXPLANATION: backslashes with "n" means ENTER SPACE.
		System.out.println(" LUCY \n LUCY \n");
		
		// putting addition "+" is used to connect two words.
		System.out.println("HOT" + "DOG");
		
		
		System.out.println("My Favorite \"Genre\" is ____ and ____ also my favorite album of the band ____ is ____");  //BLANK SENTENCES
		
		String Genre = "Math Rock";
		String GenreII = "Dream Pop";
		String Band = "Turnover";
		String Album = "Peripheral Vision";
		
		System.out.println("My Favorite \"Genre\" is "+Genre+" and "+GenreII+" also my favorite album of the band "+Band+" is "+Album+" "); 
		//putting "+variable+" is used to add string in this sentences.
		
		int girlFriends = 16;
		int studioAlbum = 4;
		int computer = 2;
		
		System.out.println("\n I HAVE "+girlFriends+" girlfriends, "+studioAlbum+" discography album and two "+computer+" laptops");

	}

}
