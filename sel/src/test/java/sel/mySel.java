package sel;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mySel {
WebDriver driver;

@Before
public void setup() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
}
@Test
public void testcase() {
	driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
}


}
