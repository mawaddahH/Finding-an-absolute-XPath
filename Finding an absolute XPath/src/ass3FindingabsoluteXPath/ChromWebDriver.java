package ass3FindingabsoluteXPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromWebDriver {
	public WebDriver driver;

	/**
	 * Set up browser settings and open the application
	 */

	@BeforeTest
	public void setUp() {
		// the path for open WebSite
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lo0ol\\" + "Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		// Navigate to a WebSite
		driver.navigate().to("https://medium.com/");

		// Maximize current window
		driver.manage().window().maximize();
	}

	/**
	 * Test using absolute XPath
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void LearnEnglishWebSite() throws InterruptedException {

		// ex1 ------- click on "start reading" button
		WebElement textMethod1 = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[1]/div[1]/div[3]/span[1]/button[1]"));
		textMethod1.click();
		System.out.println("ex1 DONE Successfully");

		// Delay execution for 3 seconds to see the result carefully.
		Thread.sleep(3000);

		// ex2 ------- click on "Sign up with email" button
		WebElement textMethod2 = driver.findElement(
				By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]/div[1]"));
		textMethod2.click();
		System.out.println("ex2 DONE Successfully");

		// Delay execution for 3 seconds to see the result carefully.
		Thread.sleep(3000);

		// ex3 ------- Enter email on Email field
		WebElement textMethod3 = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/p[1]/input[1]"));
		textMethod3.sendKeys("Mawaddah@assignment.com");
		System.out.println("ex3 DONE Successfully");

		// Delay execution for 3 seconds to see the result carefully.
		Thread.sleep(3000);

		// ex4 ------- close sign up dialog modal (alert)
		WebElement textMethod4 = driver.findElement(
				By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]/*[name()='svg'][1]"));
		textMethod4.click(); // it will open it in a new tab window

		System.out.println("ex4 DONE Successfully");

		// Delay execution for 3 seconds to see the result carefully.
		Thread.sleep(3000);
	}

	/**
	 * Tear down the setup after test completes
	 */
	@AfterTest
	public void terminateBrowser() {
		// Close the browser
		driver.quit();
	}
}
