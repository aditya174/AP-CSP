
import java.util.ArrayList;

public class ALTester {
	public static void main(String[] args)
	{
		ArrayList<String> cityList = new ArrayList<String>(10);
		System.out.println(cityList.isEmpty());
		
		cityList.add("San Ramon");
		System.out.println(cityList.isEmpty());
		System.out.println(cityList.size());
		cityList.add("Tokyo");
		cityList.add("San Fransisco");
		cityList.add("San Ramon");
		System.out.println(cityList.isEmpty());
		System.out.println(cityList.size());
		
		System.out.println(cityList);
		
		System.out.println(cityList.get(2));
		System.out.println(cityList.indexOf("Tokyo"));
		
		cityList.set(3, "San Jose");
		System.out.println(cityList);		
		cityList.remove(2);
		System.out.println(cityList);
		cityList.trimToSize();
		System.out.println(cityList);
		
		cityList = new ArrayList<String>(10);
		insertIncreasingOrder(cityList, "San Francisco");
		insertIncreasingOrder(cityList, "Chicago");
		insertIncreasingOrder(cityList, "New York");
		insertIncreasingOrder(cityList, "Dublin");
		insertIncreasingOrder(cityList, "Los Angeles");
		insertIncreasingOrder(cityList, "San Ramon");
		insertIncreasingOrder(cityList, "Chicago");
		insertIncreasingOrder(cityList, "Dublin");
		System.out.println(cityList);
		
		cityList = new ArrayList<String>(10);
		insertDecreasingOrderUnique(cityList, "San Francisco");
		insertDecreasingOrderUnique(cityList, "Chicago");
		insertDecreasingOrderUnique(cityList, "New York");
		insertDecreasingOrderUnique(cityList, "Dublin");
		insertDecreasingOrderUnique(cityList, "Los Angeles");
		insertDecreasingOrderUnique(cityList, "San Ramon");
		insertDecreasingOrderUnique(cityList, "Chicago");
		insertDecreasingOrderUnique(cityList, "Dublin");
		System.out.println(cityList);
	}
	public static void insertIncreasingOrder(ArrayList<String> arrayList, 
											 String itemToInsert)
	{
		int indexToInsert = -1;
		for (int i = 0; i < arrayList.size(); i++)
		{
			if (itemToInsert.compareTo(arrayList.get(i)) <= 0)
			{
				indexToInsert = i;
				break;
			}
		}
		if (indexToInsert >= 0)
			arrayList.add(indexToInsert, itemToInsert);
		else
			arrayList.add(itemToInsert);
	}
	public static void insertDecreasingOrderUnique(ArrayList<String> arrayList, 
			 String itemToInsert)
	{
		int indexToInsert = -1;
		boolean toBeAdded = true;
		for (int i = 0; i < arrayList.size(); i++)
		{
			if (itemToInsert.compareTo(arrayList.get(i)) <= 0)
			{
				if (itemToInsert == arrayList.get(i))
				{
					toBeAdded = false;
					break;
				}
			}
			else if (itemToInsert.compareTo(arrayList.get(i)) > 0)
			{
				indexToInsert = i;
				break;
			}
		}
		if (toBeAdded)
		{
			if (indexToInsert >= 0)
				arrayList.add(indexToInsert, itemToInsert);
			else
				arrayList.add(itemToInsert);
		}
	}
}





//import java.util.ArrayList;
//public class ALTester {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ArrayList<String> cityList = new ArrayList<String>();
//		cityList.add("San Ramon");
//		cityList.add("San Ramon");
//		cityList.add("Dublin");
//		cityList.add("Danville");
//		System.out.println(cityList);
//		System.out.println("Size: " + cityList.size());
//
////		cityList.get(cityList.size());
////		cityList.get(cityList.size() + 1);
//		System.out.println(cityList.get(cityList.size()-1));
//		System.out.println(cityList.indexOf("Danville"));
//		
//		cityList.set(3, "England"); 
//		System.out.println(cityList);
//		cityList.remove(3); 
//		System.out.println(cityList);
//		System.out.println("Size: " + cityList.size());
//		
//		cityList.trimToSize();
//		System.out.println(cityList);
//		System.out.println("Size: " + cityList.size());
//
//	}
//
//}
