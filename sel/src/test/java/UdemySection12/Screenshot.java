package UdemySection12;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	WebDriver driver;


	@Before
	public void setup() {
	
		WebDriverManager.chromedriver().setup();
	     
		
		driver = new ChromeDriver();
		
		
		
	
	}
	@Test
	public void test() throws IOException {
		driver.get("http://google.com");
		
		File src=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\Kaymak\\screenshot123.png"));
		
		
		File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File("C:\\Users\\Kaymak\\screee.png"));
		
		File src2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyDirectory(src2, new File("C:\\Users\\Kaymak\\ssvuv.png"));

		
	}
	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
	}

	}
