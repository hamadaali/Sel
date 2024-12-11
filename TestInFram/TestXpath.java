package TestInFram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestXpath {
    private WebDriver driver;
    @BeforeMethod
    public void testStart(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/?ref=hackernoon.com");
    }
    @AfterMethod
    public void testEnd(){
        driver.quit();
    }
    @Test
    public void testCase01() throws InterruptedException {
        WebElement FBEmail = driver.findElement(By.id("user-name"));
        FBEmail.sendKeys("standard_user");
        WebElement FBPass = driver.findElement(By.id("password"));
        FBPass.sendKeys("secret_sauce");
        driver.findElement(By.name("login-button")).click();
        WebElement item = driver.findElement(By.cssSelector("div.inventory_item "));
        System.out.println(item.getText());
    }

}
