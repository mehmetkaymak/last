import java.util.ArrayList;
import java.util.List;

public class morepractise2 {
public static void main(String[] args) {
	
	System.out.println(returnInteger(10));
	
}

public static List<Integer> returnInteger (int num){
	List<Integer> lst = new ArrayList<>();
	
	for( int i =  1 ; i < num;i++  ) {
		lst.add(i);
	}
	
	return lst;
	
}

}
