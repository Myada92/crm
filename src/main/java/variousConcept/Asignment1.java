 
package variousConcept;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asignment1 {

	WebDriver driver;

	@Before

	public void init() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\myada\\Selenium\\crm\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.techfios.com/billing/?ng=admin/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	@Test

	public void loginTest() {

		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).submit();

		driver.findElement(By.linkText("Bank & Cash")).click(); // to click on bank & cash panel// hyper link
		driver.findElement(By.linkText("New Account")).click(); // click on new account to open the form
		driver.findElement(By.name("account")).sendKeys("MA Saving for testing perposes");
		driver.findElement(By.id("description")).sendKeys("Saving for testing perposes");
		driver.findElement(By.id("balance")).sendKeys("$19,700"); // initial balance but in inspect is balance
		driver.findElement(By.id("account_number")).sendKeys("581259995555");
		driver.findElement(By.id("contact_person")).sendKeys("Myada A");
		driver.findElement(By.id("contact_phone")).sendKeys("267-299-9994444");// Phone
		driver.findElement(By.id("contact_phone")).submit(); // take the last element we have in the list to let the submit
		
																
	}

	@After
	public void teardown() {
		driver.close();
		driver.quit();
	}
}
