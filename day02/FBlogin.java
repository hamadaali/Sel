package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBlogin {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        WebElement FBEmail = driver.findElement(By.id("email"));
        FBEmail.sendKeys("email");
        WebElement FBPass = driver.findElement(By.id("pass"));
        FBPass.sendKeys("pass");
        //driver.findElement(By.name("login")).click();
        driver.findElement(By.linkText("Forgotten password?")).click();

    }
}
