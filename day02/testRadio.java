package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testRadio {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("D:\\sel\\day02\\radio.html");
        driver.findElement(By.cssSelector("input[value=CSS]")).click();
    }
}
