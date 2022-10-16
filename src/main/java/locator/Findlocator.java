package locator;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findlocator {
	WebDriver driver;

	@Before

	public void init() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\myada\\Selenium\\Final\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.objectspy.space/?firstname=&lastname=&Password=&photo=&continents=Asia&enter-name=#");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	@Test

	public void locators() {

		driver.findElement(By.name("firstname")).sendKeys("selenium"); // text box
		driver.findElement(By.id("sex-1")).click(); // radio button
		driver.findElement(By.id("exp-0")).click();
		driver.findElement(By.id("datepicker")).click(); // date picker
		driver.findElement(By.id("photo")).sendKeys("C:\\Users\\myada\\OneDrive\\Desktop"); // upload file
		 driver.findElement(By.linkText("OS-API Product FrontEnd")).click(); //link// text...hyperlink
		driver.navigate().back();

	     //driver.findElement(By.partialLinkText(" Backend")).click(); //partial link text
		//driver.findElement(By.cssSelector("input[id='tool-2'][value='Selenium Webdriver']")).click(); //css selector
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("we are having fun");
		//driver.findElement(By.xpath("//a[text()='OS-API Product FrontEnd']")).click();
		//driver.findElement(By.xpath("//strong[text()='Link Test : New Page']")).click();
		
	}
	public void tearDown(){
		driver.close();
		
	
	}

