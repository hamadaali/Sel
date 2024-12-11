package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selinium002 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev");
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();

/*
* 1- Login using valid credentials expcted land on sucess page (you shold find logout btn).

2- Login using invalid data:
	2-1 invalid user.  expcted proper error message.
	2-2 invalid passwod.  expcted proper error message.*/
    }
}
