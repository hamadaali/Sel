package TestInFram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAddWaits {

    private WebDriver driver;
    @BeforeMethod
    public void testStart(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://juliemr.github.io/protractor-demo/");
    }
    @AfterMethod
    public void testEnd(){
        //driver.quit();
    }
    @Test
    public void testCase01() throws InterruptedException {
        /*
    * Get first inpt xpath: //input[@ng-model='first']

    Css:  input[ng-model=first]

    btn id: gobutton

    //h2[@class='ng-binding']
    * */
        driver.findElement(By.cssSelector("input[ng-model=first]")).sendKeys("2");
        driver.findElement(By.cssSelector("input[ng-model=second]")).sendKeys("2");
        driver.findElement(By.id("gobutton")).click();
        Thread.sleep(3000);
        WebElement result = driver.findElement(By.tagName("h2"));
        String x=result.getText();
        Assert.assertEquals(x, "4", "test faild");
        
    }

}
