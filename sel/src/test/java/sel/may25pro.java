package sel;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class may25pro {
WebDriver driver;
	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
	}
	@Test
	public void testCase() throws InterruptedException {
		driver.get("http://calculator.s3.amazonaws.com/index.html");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"aws-calculator\"]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr[2]/td/div/div/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr[2]/td[1]/div/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"aws-calculator\"]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr[2]/td/div/div/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr[2]/td[5]/table/tbody/tr/td[2]/div/img")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@name='SelectorDialogType'])[197]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div/table/tbody/tr[2]/td[2]/div/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[3]/button")).click();
      driver.findElement(By.xpath("//*[@id=\"aws-calculator\"]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr[2]/td/div/div/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/input")).sendKeys("T1 Linux Micro (Free)");
	WebElement secondTime = driver.findElement(By.xpath("//*[@id=\"aws-calculator\"]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr[2]/td/div/div/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr[3]/td[1]/div/img"));
	secondTime.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"aws-calculator\"]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr[2]/td/div/div/table/tbody/tr[2]/td/div/div[1]/table/tbody/tr[3]/td[5]/table/tbody/tr/td[2]/div/img")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='SelectorDialogType'])[130]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/div[5]/div/table/tbody/tr[2]/td[2]/div/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[3]/button")).click();
	Thread.sleep(2000);
	WebElement secondBox= driver.findElement(By.xpath("//tr[@class='EC2InstanceRow itemsTableDataRow table'][2]//input[@class='gwt-TextBox input']"));
	secondBox.sendKeys("T1 Linux Micro 2");
	Thread.sleep(2000);
	WebElement thirdPlus=driver.findElement(By.xpath("//div[@class='cell Instances rowsSection']//tr[@class='footer']//img"));
	thirdPlus.click();
	Thread.sleep(2000);
	WebElement thirdSettings = driver.findElement(By.xpath("//tr[@class='EC2InstanceRow itemsTableDataRow table'][3]//td[@class='cell'][4]//img"));
	thirdSettings.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='SelectorDialogType'])[132]")).click();
	Thread.sleep(2000);
	WebElement saveAndClose = driver.findElement(By.xpath("//div[@class='dialogMiddleCenterInner dialogContent']//button[@style='visibility: visible;'] "));
	saveAndClose.click();
	Thread.sleep(2000);
	WebElement thirdBox= driver.findElement(By.xpath("//tr[@class='EC2InstanceRow itemsTableDataRow table'][3]//input[@class='gwt-TextBox input']"));
	thirdBox.sendKeys("T2 Linux Medium");
	Thread.sleep(2000);
	thirdPlus.click();
	WebElement fourthSettings = driver.findElement(By.xpath("//tr[@class='EC2InstanceRow itemsTableDataRow table'][4]//td[@class='cell'][4]//img"));
	fourthSettings.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='SelectorDialogType'])[133]")).click();
	Thread.sleep(4000);
	//driver.findElement(By.xpath("//tr[@class='EC2InstanceRow itemsTableDataRow table'][3]//td[@class='cell'][4]//img")).click();
	//Thread.sleep(2000);
	WebElement fourthSaveAndClose = driver.findElement(By.xpath("//div[@class='dialogMiddleCenterInner dialogContent']/table//table[@class='Buttons']//button[@style='visibility: visible;']"));
	fourthSaveAndClose.click();
	Thread.sleep(2000);
	WebElement fourthBox = driver.findElement(By.xpath("//tr[@class='EC2InstanceRow itemsTableDataRow table'][4]//input[@class='gwt-TextBox input']"));
	fourthBox.sendKeys("T2 Linux Large");
	thirdPlus.click();
	WebElement fifthSettings = driver.findElement(By.xpath("//tr[@class='EC2InstanceRow itemsTableDataRow table'][5]//td[@class='cell'][4]//img"));
	fifthSettings.click();
	driver.findElement(By.xpath("(//input[@name='SelectorDialogType'])[134]")).click();
	WebElement fifthSaveAndClose = driver.findElement(By.xpath("//table[@class='ContentContainer InstanceSelectorContent']//button[@style='visibility: visible;']"));
	fifthSaveAndClose.click();
	WebElement fifthBox = driver.findElement(By.xpath("//tr[@class='EC2InstanceRow itemsTableDataRow table'][5]//input[@class='gwt-TextBox input']"));
	fifthBox.sendKeys("T2 Linux XtraLarge");
	WebElement EstimatedBill = driver.findElement(By.xpath("//div[@style='white-space: nowrap; opacity: 1;']"));
	EstimatedBill.click();
	String EstimatedPrice = EstimatedBill.getText();
	EstimatedPrice = EstimatedPrice.substring(EstimatedPrice.length()-7, EstimatedPrice.length()-1).trim();//246.05 but String
	double intEstimated = Double.parseDouble(EstimatedPrice) ;
	System.out.println(intEstimated);
	WebElement totalPayment = driver.findElement(By.xpath("//div[.='Total Monthly Payment:']/parent::td/following-sibling::td//td[2]"));
	System.out.println(totalPayment.getText());
System.out.println("-----------");
System.out.println(driver.findElement(By.xpath("//div[.='Total Monthly Payment:']")).getText());
WebElement servicesTab = driver.findElement(By.xpath("//div[.='Services']"));
servicesTab.click();
WebElement hoursWeekButton= driver.findElement(By.xpath("//tr[@class='EC2InstanceRow itemsTableDataRow table'][1]//select"));


WebElement priceBeforeSelectingWeek =  driver.findElement(By.xpath("//div[.='$ 14.64']"));
String priceBefore = priceBeforeSelectingWeek.getText();
System.out.println(priceBefore);
Select s = new Select(hoursWeekButton);
s.selectByIndex(2);

WebElement afterToursWeek = driver.findElement(By.xpath("//div[.='$ 8.60']"));
String priceAfter = afterToursWeek.getText();
System.out.println(priceAfter);
if(priceBefore.equals(priceAfter)  ) {
	System.out.println("the price is same");
}else{
	System.out.println("the price is different");
}
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@class='gwt-TabBarItem']")).click();
Thread.sleep(5000);
WebElement saveAndShare = driver.findElement(By.xpath("//button[.='Save and Share']"));
saveAndShare.click();
Thread.sleep(2000);
WebElement name = driver.findElement(By.xpath("//input[@class='gwt-TextBox SC_SOLUTION_Input']"));
name.sendKeys("EC2 Test Configuration");
WebElement includes = driver.findElement(By.xpath("//textarea[@class='gwt-TextArea SC_INCLUDES_Input']"));
includes.sendKeys("ncludes 5 EC2 Instances");
WebElement OK = driver.findElement(By.xpath("//button[.='OK']"));
OK.click();
Thread.sleep(2000);
driver.findElement(By.id("saveURL")).click();
WebElement lastPrice = driver.findElement(By.xpath("//div[contains(@class,'gwt-HTML SC_Price')]"));
System.out.println(lastPrice.getText());

	}
	



	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		//driver.quit();
	}

	}
