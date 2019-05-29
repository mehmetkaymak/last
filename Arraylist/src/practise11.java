import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class practise11 {
public static void main(String[] args) {
	List<Integer> numList = new ArrayList<>();
	numList.add(1);
	numList.add(3);
	numList.add(5);
	numList.add(7);
	numList.add(9);
	System.out.println(numList);
	
	//Arrays.asList return fixed size list and return type List
	// so taht ıt has bo stored in lis variabe
	//great power great limitation
	//you can not remove and add
	List<Integer> list2 = Arrays.asList(13,23,5223,73,94);
	
	Integer temp = list2.get(0);
	list2.set(0,list2.get(4));
	list2.set(4, temp);
	
	

	
	System.out.println("after reversed");
	System.out.println(list2);
	
	
	Collections.reverse(list2);
	
	for(  Integer i : list2 ) {
		System.out.println(i);
	}
	
	
	
	ArrayList<Integer> list3 = new ArrayList<>(list2);
	System.out.println("list 4 is rigth below me");
	ArrayList<Integer> list4= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
	System.out.println(list4);
	System.out.println("list 3 is right below me");
System.out.println(list3);	
	
	for(int i = 0 ;i< numList.size();i++) {
		int curDouble = numList.get(i)*2;
		numList.set(i,curDouble );
	}

	System.out.println(numList);
	
	List<Integer> reversed= new ArrayList<>();
	for( int i= 0 ; i < numList.size();i++) {
		int curNum = numList.get(numList.size()- (1+i ) );
		reversed.add(curNum);
	}
	System.out.println(reversed);
}
}
