import java.util.ArrayList;
import java.util.Scanner;

public class store {
Scanner input = new Scanner(System.in);
	String name;	
 String address;
 ArrayList<Item> myStore= new ArrayList<>();
 int numItems;

 double totalSales;


 public void sell(String itemName) {
	 for(  int i = 0 ; i < myStore.size();i++ ) {
		 
		 if( myStore.get(i).name.equals(itemName)   ) {
			 System.out.println(itemName + " is sold for " + myStore.get(i).price);
		 }
		 numItems--;
		 myStore.remove(i);
		 totalSales += myStore.get(i).price;
	     break;
	 }
 
 }public double exchange(  Item item1 , Item item2 ) {
	 myStore.remove(item1);
	 myStore.add(item2);
	 double difference = item2.price -item1.price;
	 if( item2.price >= item1.price  ) {
		
		return totalSales += difference;
	} 
 return  totalSales += difference; 
 }
 
 
 
 public boolean checkItem(String itemName) {
	 for( int i = 0 ; i < myStore.size();i++  ) {
		 if( myStore.get(i).name.equals(itemName) ) {
			 
			 return true;
		 }
			
		 
	 }
 return false;
 } 
 
 
 
 
 public void refund( Item item ) {
	 myStore.add(item);
	 //addItem(item);
	 totalSales -= item.price;
 }
 
 
 public store ( String name, String address) {
	 this.name= name;
	 this.address= address;
}
 
public void addItem( Item item ) {
	myStore.add(item);
	numItems++;
}public void addItem( int numToAdd ) {
	numItems += numToAdd;
	System.out.println("how many items do you want to add");
  int size = input.nextInt();
  input.nextLine();
  ArrayList<Item>  myStore = new ArrayList<>();
  
  for(  int i = 0 ; i < size;i++ ) {
	  System.out.println("please enter the name of the item " + (i+1) );
      String itemName = input.nextLine();
      System.out.println("please enter the price of the item " + (i+1 ) );
    double itemPrice = input.nextDouble() ;
    input.nextLine();
   Item item = new Item(itemName, itemPrice);
   myStore.add(item);
  
  }
  
  for(  Item i : myStore ) {
	  i.info();
  }System.out.println(numItems);
}


	
public void seeInventory() {
	for( int i = 0 ; i < myStore.size();i++ ) {
		myStore.get(i).info();
	}
}
}
