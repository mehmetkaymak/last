import java.util.ArrayList;

public class practise {
public static void main(String[] args) {

	ArrayList<Integer> numList = new ArrayList<>();
	ArrayList<Integer> numList2 = new ArrayList<>();
	ArrayList<Integer> numList3 = new ArrayList<>();
	for( int i =  0 ; i < 100 ;i++) {
		numList.add(i+1);
	}
	System.out.println(numList);
	
	int sum =0;
	
	for( int  i = 0 ; i < numList.size() ; i ++   ) {
		sum += numList.get(i);
	} 
	
		System.out.println(sum);
		System.out.println(sum/numList.size());

		for( int i =  100 ; i > 0 ;i--) {
			numList2.add(i);
			
		}
		System.out.println(numList2);
		


		
		for( int  i = 0 ; i < numList2.size();i++ ) {
			
			if( numList2.get(i)  % 15 == 0 ) {
				numList3.add(   numList2.get(i)  );
			}
		}
		System.out.println(numList3);

		for( int  i = 0 ; i < numList3.size() ;i++) {
			Integer i1 = numList3.get(i);
			
			numList2.add( i1);
		}
		
		System.out.println(numList2);
 ArrayList<Integer> list5 = new ArrayList<>(numList);
 System.out.println("adding " +  list5);
 ArrayList <String> names =new ArrayList<>();
 names.add("john");
 names.add("james");
 names.add("johnnny");
 
 String str = names.toString();
 System.out.println(str);
}


}
