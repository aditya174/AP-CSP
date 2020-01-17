import java.util.ArrayList;

/**
 * Write a description of class Person here.
 *
 * @author (Aditya Agrawal)
 * @version (1/14/2020)
 */
public class Person {
	private String ownName;
	private int ownAge;
	private ArrayList<String> friendsNames;

	public Person(String givenName, int givenAge) {
		ownName = givenName;
		ownAge = givenAge;
		friendsNames = new ArrayList<String>();
	}

	public String getOwnName() {
		return ownName;
	}

	public int getOwnAge() {
		return ownAge;
	}

	public int getFriendCount() {
		return friendsNames.size();
	}

	public String getAllFriendsNames() {
		String names = friendsNames.toString();
		return names.substring(1, names.length() - 1);
	}

	public String get1FriendsName(int index) {
		return friendsNames.get(index);
	}

	public void setOwnAge(int givenAge) {
		ownAge = givenAge;
	}

	public void addFriend(Person aFriend) {
		if (!friendsNames.contains(aFriend)) {
			// add the name check alpha order
			for (String person : friendsNames) {
				String nameOfFriend = aFriend.getOwnName();
				if (person.compareToIgnoreCase(nameOfFriend) > 0) {
					friendsNames.add(friendsNames.indexOf(person) + 1, nameOfFriend);

				}
			}
		}

	}

	public double calcAvgNameLength() {
		double total = 0.0, size = getFriendCount();
		for (int i = 0; i < size; i++) {
			int length = friendsNames.get(i).length();
			total += length;
		}
		return total / size;
	}

	public void unfriend(String friend) {
		if (friendsNames.contains(friend)) {
			friendsNames.remove(friend);
		}
	}

	public String toString() {
		return ownName + ": " + friendsNames.toString().substring(1, friendsNames.size()-1);
	}
	
}