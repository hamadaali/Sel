package TestInFram;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;
public class CalculatorTest {

	WebDriver driver=null;
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://juliemr.github.io/protractor-demo/");
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	@Test
	public void addTest() throws InterruptedException, IOException{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60), Duration.ofMillis(250));

		driver.findElement(By.cssSelector("[ng-model=first]")).sendKeys("1");
		driver.findElement(By.cssSelector("[ng-model=second]")).sendKeys("1");
		driver.findElement(By.cssSelector("#gobutton")).click();

		wait.until(ExpectedConditions.attributeToBe(By.cssSelector("h2.ng-binding"),"innerText" , "2"));
		String actual=driver.findElement(By.cssSelector("h2.ng-binding")).getText();
		Assert.assertEquals(actual, "2","It is wrong");
	}
	@Test
	public void multiplyTest() throws InterruptedException, IOException{

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60), Duration.ofMillis(250));

		driver.findElement(By.cssSelector("[ng-model=first]")).sendKeys("1");
		driver.findElement(By.cssSelector("[ng-model=second]")).sendKeys("1");
		WebElement selectElement = driver.findElement(By.cssSelector("[ng-model=operator]"));
		Select select = new Select(selectElement);
		select.selectByValue("MULTIPLICATION");

		driver.findElement(By.cssSelector("#gobutton")).click();

		wait.until(ExpectedConditions.attributeToBe(By.cssSelector("h2.ng-binding"),"innerText" , "1"));
		String actual=driver.findElement(By.cssSelector("h2.ng-binding")).getText();
		Assert.assertEquals(actual, "1","It is wrong");
	}
	@Test
	public void subTest() throws InterruptedException, IOException{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60), Duration.ofMillis(250));

		driver.findElement(By.cssSelector("[ng-model=first]")).sendKeys("1");
		driver.findElement(By.cssSelector("[ng-model=second]")).sendKeys("1");
		WebElement selectElement = driver.findElement(By.cssSelector("[ng-model=operator]"));
		Select select = new Select(selectElement);
		select.selectByValue("SUBTRACTION");

		driver.findElement(By.cssSelector("#gobutton")).click();
		wait.until(ExpectedConditions.attributeToBe(By.cssSelector("h2.ng-binding"),"innerText" , "0"));
		String actual=driver.findElement(By.cssSelector("h2.ng-binding")).getText();
		Assert.assertEquals(actual, "0","It is wrong");
	}
	@Test
	public void divTest() throws InterruptedException, IOException{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60), Duration.ofMillis(250));

		driver.findElement(By.cssSelector("[ng-model=first]")).sendKeys("1");
		driver.findElement(By.cssSelector("[ng-model=second]")).sendKeys("1");
		WebElement selectElement = driver.findElement(By.cssSelector("[ng-model=operator]"));
		Select select = new Select(selectElement);
		select.selectByValue("DIVISION");

		driver.findElement(By.cssSelector("#gobutton")).click();
		wait.until(ExpectedConditions.attributeToBe(By.cssSelector("h2.ng-binding"),"innerText" , "1"));
		String actual=driver.findElement(By.cssSelector("h2.ng-binding")).getText();
		Assert.assertEquals(actual, "1","It is wrong");
	}
	@Test
	public void modTest() throws InterruptedException, IOException{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60), Duration.ofMillis(250));

		driver.findElement(By.cssSelector("[ng-model=first]")).sendKeys("3");
		driver.findElement(By.cssSelector("[ng-model=second]")).sendKeys("2");
		WebElement selectElement = driver.findElement(By.cssSelector("[ng-model=operator]"));
		Select select = new Select(selectElement);
		select.selectByValue("MODULO");

		driver.findElement(By.cssSelector("#gobutton")).click();
		wait.until(ExpectedConditions.attributeToBe(By.cssSelector("h2.ng-binding"),"innerText" , "1"));
		String actual=driver.findElement(By.cssSelector("h2.ng-binding")).getText();
		Assert.assertEquals(actual, "1","It is wrong");
	}


}
