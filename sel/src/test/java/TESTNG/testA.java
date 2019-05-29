package TESTNG;

import org.testng.annotations.Test;

public class testA {
@Test(priority = 9)
public void testA() {
	System.out.println(" from Test A");
}
@Test(priority = 8)
public void testB() {
	System.out.println(" from Test B");
}
int count  = 1;
@Test(priority = 7,invocationCount=5)
public void testC() {
	System.out.println(" from Test C" + count++);
}


@Test(priority = 6)
public void testD() {
	System.out.println(" from Test D");
}
@Test(priority = 5)
public void testE() {
	System.out.println(" from Test E");
}
@Test(priority = 4)
public void testF() {
	System.out.println(" from Test F");
}@Test(priority = 3)
public void testG() {
	System.out.println(" from Test G");
}
@Test(priority = 2)
public void testH() {
	System.out.println(" from Test H");
}
@Test(priority = 1)
public void testI() {
	System.out.println(" from Test I");
}
@Test(priority = 0)
public void testJ() {
	System.out.println(" from Test J");
}


}
