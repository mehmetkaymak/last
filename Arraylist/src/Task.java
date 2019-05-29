import java.util.ArrayList;

public class Task {
public static void main(String[] args) {
	ArrayList<String> list1 = new ArrayList<>();
	ArrayList<String> list2 = new ArrayList<>();
	list1.add("john");
	list1.add("woman");
	list1.add("bale");
	
	list2.add("karim");
	list2.add("paul");
	list2.add("pogba");
	
	list1.addAll(2, list2);
	//list1.addAll(list2);
	System.out.println(list1);
	
	
	//creating arrayList with all the items from another list
	ArrayList<String> list3 = new ArrayList<>(list1);
	
	System.out.println(list3);//COPIED 
	
}
}
