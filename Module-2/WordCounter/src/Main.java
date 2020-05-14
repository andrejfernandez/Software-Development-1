import java.util.*;

public class Main {

	public static void main(String[] args) {	
		
		
		String p = "Once upon a midnight dreary, while I pondered, weak and weary,\n" + 
				"Over many a quaint and curious volume of forgotten lore—\n" + 
				"While I nodded, nearly napping, suddenly there came a tapping,\n" + 
				"As of some one gently rapping, rapping at my chamber door.\n" + 
				"\"'Tis some visitor,\" I muttered, \"tapping at my chamber door—\n" + 
				"Only this and nothing more.\"\n";

		ArrayList<Word> sortedList = Methods.getTopWordList(p);
		
		System.out.println("\nTop 20...");
		for(int i =0; i < 20; i++) {
			int temp = i+1;
			System.out.println(temp + ". " + sortedList.get(i));
		}
	
		System.out.println("\nEntire List...");
		for(Word w: sortedList)
			System.out.println(w);
		


		//Sort List
		
		//Print Top 20

	} //end main()
	

} //end TestClass
