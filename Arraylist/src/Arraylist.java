import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist {
public static void main(String[] args) {
	
	String str ="Nurses runsas";
	boolean b = isPolindrome(str);
	System.out.println(b);
	
	
}

public static boolean isPolindrome(String s ) {
	s=s.trim().toLowerCase();
	s=s.replaceAll(" ", "");
	String reversed ="";
	for(int  i = s.length()-1  ; i >= 0 ; i-- ) {
		reversed += s.charAt(i);
	}
if(s.equals(reversed)) {
	return true;
}
return false;
}



}
