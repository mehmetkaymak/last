import java.util.ArrayList;
import java.util.Collections;

public class Collection {
public static void main(String[] args) {
	ArrayList<String> lst = new ArrayList<>();
			
lst.add("james");
lst.add("herk");
lst.add("matt");
System.out.println(lst);
// sorting arraylist using sort method of Collection class
Collections.sort(lst);
System.out.println(lst);

int i = Collections.binarySearch(lst, "herk");
System.out.println(i);
Collections.reverse(lst);
System.out.println(lst);
// let sshuffle inside list
Collections.shuffle(lst);
System.out.println(lst);

}
}
