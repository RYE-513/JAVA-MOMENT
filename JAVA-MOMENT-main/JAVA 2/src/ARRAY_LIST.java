import java.util.ArrayList;

public class ARRAY_LIST {

	public static void main(String[] args) {
		
		//MANUAL ARRAYLIST 
		
		String[] camo = new String[5]; //in regular ArrayList if you add another item you will change
		camo[0] = "GOLD";				//this new String[4]; to new String[5];
		camo[1] = "PLATINUM";
		camo[2] = "DAMASCUS";
		camo[3] = "DIAMOND";
		camo[4] = "AETHER";
		System.out.println(camo[2]); //if you only print (camo) wihtout specific array e.g. [0];
										//it will print the java memory [Ljava.lang.String;@1eb44e46
		//PRINTING ARRAYLIST
		
		ArrayList camoList = new ArrayList();
		
		camoList.add("GOLD");
		camoList.add("PLATINUM");
		camoList.add("DAMASCUS");
		camoList.add("DIAMOND");
		camoList.add("AETHER");  //if you add another list it will show automatically.
		camoList.add("OBSIDIAN");
		
		camoList.remove("DAMASCUS"); //this syntax is use to remove specific item rather than putting "//"
		//camoList.clear(); //this syntax will remove all the item shown in console.
		System.out.println(camoList);
		
		System.out.println(camoList.contains("MYTHIC")); //it shows "False" because this item is not in arraylist.
		
		//ARRAYLIST<STRING>
		
		ArrayList<String> list = new ArrayList<String>(); //CORRECT: ArrayList WRONG: Array"l"ist.
		list.add("RYE"); //no. 0
		list.add("BSCS"); //no. 1
		list.add("RUSSIA"); //no. 2
		
		System.out.println(list.get(1)); // this syntax is an ArrayList but with no {" ", " ", " "}, format
										 // this print syntax will be "list.get(0)"
		
		//ARRAYLIST<INTEGER>
		
		ArrayList<Integer> numsList = new ArrayList<Integer>();
		
		numsList.add(54);
		numsList.add(525);
		numsList.add(54);
		
		// ArrayList<Integer> doesn't recognize ".remove"
		
		System.out.println(numsList);
		
	}

}
