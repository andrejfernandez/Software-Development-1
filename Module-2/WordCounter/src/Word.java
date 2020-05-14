
public class Word implements Comparable<Word> {

	// Fields ///////////////////////////////////////////////////////
	String text;
	int count;
	

	// Constructors /////////////////////////////////////////////////
	public Word(String text, int count) {
		setText(text);
		this.count = count;
	}

	public Word() {
		newWord();
	}

	
	// Getters and Setters //////////////////////////////////////////
	public String getText() {
		return text;
	}

	public void setText(String text) {
		char fletter = Character.toUpperCase(text.charAt(0));
		String result = fletter + text.substring(1);
		this.text = result;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	

	// toString /////////////////////////////////////////////////////
	public String toString() {
		String result = text;

		int diff = 12 - text.length();

		for (int i = 0; i < diff; i++)
			result += " ";

		result += "|   Count: " + count;

		return result;
	}// end toString()
	

	// Methods //////////////////////////////////////////////////////
	public void newWord() {
		String temp = " ";
		setText(temp);
		setCount(0);
	}// end newWord()

	@Override
	  public int compareTo(Word w) {
		return Integer.compare(this.getCount(), w.getCount());
    } //end compareTo()

	
}//end Word
























