package UdemySection12;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingAutoDropdowns {
WebDriver driver;


@Before
public void setup() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
}
//@Test
//public void test() throws InterruptedException {
//	driver.get("https://ksrtc.in/oprs-web/guest/home.do");
//	driver.findElement(By.id("fromPlaceName")).sendKeys("beng");
//	Thread.sleep(2000);
//	driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
//	Thread.sleep(2000);
//	driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
//	
//	System.out.println(driver.findElement(By.id("fromPlaceName")).getAttribute("value"));
//}
//@Test
//public void test() throws InterruptedException {
//	driver.get("http://qaclickacademy.com/practice.php");
//
//	driver.findElement(By.id("autocomplete")).sendKeys("ind");
//	driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN);
//	Thread.sleep(2000);
//	driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN);
//	Thread.sleep(2000);
//	driver.findElement(By.id("autocomplete")).sendKeys(Keys.ENTER);
//	System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
//
//}

//@Test
//public void test() throws InterruptedException {
//	driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
//     int count = driver.findElements(By.xpath("(//div[@id='innings_1']/child::div)[1]//div[@class='cb-col cb-col-100 cb-scrd-itms']")).size();
//     
//	System.out.println(count);
//
//    //cb-col cb-col-8 text-right text-bold 
//	int sum = 0 ;
//	for(int i = 0 ; i < count-2; i++) {
////		if(i == 9) {
////			continue;
////		}
//		//WebElement points = driver.findElements(By.xpath("(//div[@id='innings_1']/child::div)[1]//div[@class='cb-col cb-col-100 cb-scrd-itms']//div[@class='cb-col cb-col-8 text-right text-bold']"));
//	System.out.println(driver.findElements(By.xpath("(//div[@id='innings_1']/child::div)[1]//div[@class='cb-col cb-col-100 cb-scrd-itms']//div[@class='cb-col cb-col-8 text-right text-bold']")).get(i).getText());
//	String value = driver.findElements(By.xpath("(//div[@id='innings_1']/child::div)[1]//div[@class='cb-col cb-col-100 cb-scrd-itms']//div[@class='cb-col cb-col-8 text-right text-bold']")).get(i).getText();
//    int intValue = Integer.parseInt(value)	;
//    sum+= intValue;
//	}
//	
//    System.out.println(driver.findElement(By.xpath("(//div[.='Extras']/following-sibling::div)[1]")).getText()); 
//    System.out.println(driver.findElement(By.xpath("//div[.='Total']/following-sibling::div")).getText());
//System.out.println(sum);
//String extraValue = driver.findElement(By.xpath("//div[.='Total']/following-sibling::div")).getText();
//int intExtraVal = Integer.parseInt(extraValue);
//System.out.println(intExtraVal);
//}
@Test
public void test() throws InterruptedException, IOException {

driver.get("http://google.com");

//File src=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//FileUtils.copyFile(src,new File("C:\\Users\\Kaymak\\screenshot.png"));

File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src, new File("C:\\Users\\Kaymak\\screen2.png"));



}


	
@After
public void tearDown() throws InterruptedException {
	Thread.sleep(2000);
	driver.quit();
}
	
	
}
