import java.util.ArrayList;
/**
 * Write a description of class IndexEntry here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IndexEntry
{
    private String word;
    private ArrayList<Integer> numsList;
    
    public IndexEntry(String givenWord){
        word = givenWord.toUpperCase();
        numsList = new ArrayList<Integer>();
    }
    public void add(int num){
        Integer num2 = new Integer(num);
        if(!numsList.contains(num2)){
            numsList.add(num2);
        }
    }
    public String getWord(){
        return word;
    }
    public String toString(){
        return word + " " + numsList.toString().substring(1, numsList.toString().length() - 1);
    }
}


































//import java.util.ArrayList;
//public class IndexEntry {
//	private String word;
//	private ArrayList<Integer> numsList;
//	
//	public IndexEntry(String w) {
//		word = w.toUpperCase();
//		numsList = new ArrayList<Integer>();
//	}
//	
//	
//	
//	public void add(int num) {
//		Integer num1 = new Integer(num);
//		if(!numsList.contains(num1)) {
//			numsList.add(num1);
//		}
//	}
//
//	public String getWord() {
//		return word;
//	}
//
//	public String toString() {
//		return word + numsList.toString()
//										.substring(1, numsList.size()-1);
//	}
//}
