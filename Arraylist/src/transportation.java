import java.util.ArrayList;

public class transportation {
public static void main(String[] args) {
	ArrayList<String> names = new ArrayList<>();
	names.add("adam");
	names.add("james");
	names.add(0, "jennifer");
	//System.out.println(names);
	//System.out.println(names.size());
   System.out.println(names);
	System.out.println(names.get(1));
   System.out.println(   names.get(names.size() -1) ); 
   System.out.println(names.contains("adam"));
   System.out.println( names.indexOf("james") );
 System.out.println(names.remove(0));

 System.out.println(names.remove(0));
 System.out.println(names);
names.clear();
System.out.println(names.isEmpty());
int i  = 45;
Integer i2 = i;
System.out.println(i2);
double d= 23.5;
Double d2 = d;
Character c = new  Character('t');
char c2= c;
ArrayList<Integer> numbers= new ArrayList<>();
numbers.add(23);
numbers.add(45);
String s = "34";
Integer.valueOf(s); // Integer 34
Integer.parseInt(s);// int 34
int a = Integer.valueOf(s);
}

}
