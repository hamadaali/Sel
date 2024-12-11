package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCheckBox {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        WebElement check1 =driver.findElement(new By.ByXPath("//*[@id=\"checkboxes\"]/input[1]"));
        WebElement check2 =driver.findElement(new By.ByXPath("//*[@id=\"checkboxes\"]/input[2]"));
        if(!check1.isSelected())
        {
            check1.click();
        }
        if(check2.isSelected())
        {
            check2.click();
        }
    }
}
