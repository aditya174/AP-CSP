import java.util.ArrayList;

public class DocumentIndex extends ArrayList<IndexEntry>{
	public DocumentIndex()
	{
		super();
	}
	public DocumentIndex(int initCapacity)
	{
		super(initCapacity);
	}
	public void addWord(String word, int num)
	{
		this.get(foundOrInserted(word)).add(num);
	}
	public void addAllWords(String str, int num)
	{
		String[] strArr = str.split("\\W+");
		for (String word : strArr)
		{
			if (!word.equals(""))
				addWord(word, num);
		}
	}
	private int foundOrInserted(String word)
	{
		for (int i = 0; i < this.size(); i++)
		{
			if (word.compareToIgnoreCase(this.get(i).getWord()) <= 0)
			{
				if (!word.equalsIgnoreCase(this.get(i).getWord()))
					this.add(i, new IndexEntry(word));
				return i;
			}
		}
		this.add(new IndexEntry(word));
		return this.size() - 1;
	}
}





































//import java.util.ArrayList;
//public class DocumentIndex extends ArrayList<IndexEntry>{
//
//	private ArrayList<IndexEntry> entry;
//	
//	public DocumentIndex() {
//		entry = new ArrayList<IndexEntry>();
//	}
//
//	public DocumentIndex(int capacity) {
//		entry = new ArrayList<IndexEntry>(capacity);
//	}
//	
//	public void addWord(String word, int num) {
//		IndexEntry a = new IndexEntry(word);
//		a.add(num);
//		
//	}
//}
