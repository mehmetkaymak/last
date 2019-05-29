
public class mall {
public static void main(String[] args) {
	store myStore = new store( "vnfqvf", "downtown");
	
	Item item1 = new Item( "book" , 234);
	myStore.addItem(item1);
	Item item2 = new Item ("pen" , 35);
	myStore.addItem(item2);
//	myStore.sell("book");
	myStore.totalSales = 190.0;
	
	Item item3 = new Item( "bag", 50 );
	
	Item item4 = new Item( "wallet", 100 );
	myStore.addItem(item4);
	//myStore.refund(item2);
	//System.out.println(myStore.checkItem("pen"));
	myStore.exchange(item4, item3);
	
	myStore.seeInventory();
     
	
	System.out.println(myStore.totalSales );
 
   myStore.addItem(2);
	
}
}
