package UdemySection12;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {
WebDriver driver;


@Before
public void setup() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
}
@Test
public void test() {
	
	driver.get("http://qaclickacademy.com/practice.php");
    int columnNum = driver.findElements(By.xpath("//table[@id='product']/tbody/tr")).size();
    int rowNum = driver.findElements(By.xpath("//table[@id='product']/tbody/tr/th")).size();
    String name = driver.findElement(By.xpath("(//td[.='Rahul Shetty'])[1]")).getText();
    String course = driver.findElement(By.xpath("//td[text()='Learn SQL in Practical + Database Testing from Scratch']")).getText();
    String price = driver.findElement(By.xpath("//td[text()='Learn SQL in Practical + Database Testing from Scratch']/following-sibling::td")).getText();
    System.out.println(name + " " + course + " " + price);

	
}
@After
public void tearDown() throws InterruptedException {
	Thread.sleep(2000);
}

}
