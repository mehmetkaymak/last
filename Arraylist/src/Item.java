import java.util.ArrayList;

public class Item {
public static void main(String[] args) {
	

	ArrayList<String> names = new ArrayList<>();

	names.add("james");
	//System.out.println(names.size());
	names.add(0, "bond");
 //System.out.println(names);
   int age =45;
   Integer age2 = age;  //  autoboxing into primitive type
 
   Integer num = new Integer(45);
   int num2 = num; //unboxing process(((  converted to primitive  )))
   ArrayList<Integer> numbers  =   new ArrayList<Integer>();
   numbers.add(45);
   numbers.add(55);
   System.out.println(numbers);
}	
}
