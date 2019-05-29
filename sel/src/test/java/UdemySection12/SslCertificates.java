package UdemySection12;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SslCertificates {

	WebDriver driver;


	@Before
	public void setup() {
	  DesiredCapabilities ch = DesiredCapabilities.chrome();// general chrome profile
	  ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
	  ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		WebDriverManager.chromedriver().setup();
	     // belongs to local browser
		ChromeOptions c= new ChromeOptions();
		c.merge(ch);
		driver = new ChromeDriver(c);
	
	}
	@Test
	public void test() {
		
		

		
	}
	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
	}

	}

