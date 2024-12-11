package TestInFram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IntroTestEn {

    ////////////////////////////////////////////////////////////////
    //  DRY
    //  pre-conditions (Before method)
    //  {test steps
    //  assertion}
    //  post-conditions (After method)
    ////////////////////////////////////////////////////////////////
    private WebDriver driver;

    @BeforeMethod
    public void testStart(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");
    }

    @AfterMethod
    public void testEnd(){
        driver.quit();
    }

    @Test
    public void testCase01(){
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://the-internet.herokuapp.com/login");

//        testStart();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.tagName("button")).click();
        String msg = driver.findElement(By.id("flash-messages")).getText();
        Assert.assertTrue(msg.contains("You logged into a secure area! some more text"),  "testCase01: Failed");

//        if(msg.contains("You logged into a secure area!"))//True or False
//            System.out.println("Passed");
//        else
//            System.out.println("Failed");

//        testEnd();
//        driver.quit();
    }

    @Test
    public void testCase02(){
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://the-internet.herokuapp.com/login");

//        testStart();
//        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.tagName("button")).click();
        String msg = driver.findElement(By.id("flash-messages")).getText();
        Assert.assertTrue(msg.contains("Your username is invalid!"),  "testCase02: Failed");

//        if(msg.contains("Your username is invalid!"))
//            System.out.println("Passed");
//        else
//            System.out.println("Failed");

//        testEnd();
//        driver.quit();
    }

    @Test
    public void testCase03(){
        // ..
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://the-internet.herokuapp.com/login");
//        testStart();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
//        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.tagName("button")).click();
        String msg = driver.findElement(By.id("flash-messages")).getText();
        Assert.assertTrue(msg.contains("Your password is invalid!"),  "testCase03: Failed");

//        if(msg.contains("Your password is invalid!"))
//            System.out.println("Passed");
//        else
//            System.out.println("Failed");

//        testEnd();
//        driver.quit();
    }
    }

