class Word
{
	
	private String word;
	private int index;
	private int partLength;
	private String subWord;
	public Word()
	{}

	public String getsubWord(String word, int index, int partLength)
	{
		subWord=word.substring(index,partLength+1);
		return subWord;
	}
	public void printPartOfWord(String subWord)
	{
	System.out.println(subWord);
	}
}