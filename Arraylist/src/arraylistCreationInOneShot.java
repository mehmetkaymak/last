import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arraylistCreationInOneShot {
public static void main(String[] args) {
	
	//Arrays.asList(var aRg) can be used to add item while
	// object is being created
	
	// Howver the variable must be a LIST
	//becuase ıt does not return arrayList but List
	 List<Integer>  list  =Arrays.asList(1,2,3,4,5,6);
	 
	List<String> lst2  =Arrays.asList("superman", "batman","spiderman");
	
	//GREAT POWER GREAT LIMITATION
	//IF YOU CHOOSE THIS WAY you can noot add() or remove()
//	list1.add(1)      --- unsopperted operation

//	list1.remove(o);  --- unsopperted operation

// Since we can not remove or dd ıtem we can copy like this
	ArrayList<Integer> myCoolList = new ArrayList<>(list);
// we cam modify anymore
	myCoolList.add(50);
	myCoolList.remove(Integer.valueOf(5));
	System.out.println(myCoolList);

	ArrayList <String> list3 = new ArrayList<>(lst2);
	list3.add("avengers");
	list3.remove(String.valueOf("batman"));
	System.out.println(list3);
	// .basically you can make one shot but unmdofies Arrays.asList();
	//BY copying you are able to modify


}
}
