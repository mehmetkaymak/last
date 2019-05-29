import java.util.ArrayList;
import java.util.List;

public class morePractise {
public static void main(String[] args) {
	
	
	List<String> lst = new ArrayList<>();
	lst.add("james");
	lst.add("micheal");
	lst.add("terry");
	
	printItems(lst);
}
public static void printItems( List<String> lst ) {
	for(  String str : lst) {
	System.out.println(str);
	}
	
}
}
