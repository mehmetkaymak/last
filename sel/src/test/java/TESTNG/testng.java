package TESTNG;
//  test next generation is a testing framework that provides multiple capabilities like assertions reporting parallel test execution
import org.testng.Assert;
import org.testng.annotations.Test;

public class testng {
@Test(priority = 0)
public void test() {
Assert.assertEquals(34, 34);
System.out.println("I am the first");
}
@Test(priority =2)
public void test2() {
	Assert.assertEquals("a", "a");
	System.out.println("I am the third");
}
@Test()
public void test3() {
	Assert.assertEquals(3, 3);
	System.out.println("I am the second");
}
//@Test
//public void test5() {
//	Assert.fail();
//}

}
