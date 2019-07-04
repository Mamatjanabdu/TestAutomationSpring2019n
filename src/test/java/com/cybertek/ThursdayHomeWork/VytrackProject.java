package com.cybertek.ThursdayHomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VytrackProject {

    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa2.vytrack.com/user/login");
        Thread.sleep(3000);

        WebElement name = driver.findElement(By.name("_username"));
        name.sendKeys("User188"+Keys.ENTER);
        WebElement passWord = driver.findElement(By.name("_password"));
        passWord.sendKeys("UserUser123"+Keys.ENTER);
        Thread.sleep(2000);
        if (  driver.getTitle().equals("Dashboard"))
        {
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");

        }
        Thread.sleep(3000);
        

        driver.findElement(By.xpath("//*[@id=\"user-menu\"]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"user-menu\"]/ul/li[4]/a")).click();
        Thread.sleep(3000);
        if (  (driver.getCurrentUrl().equals("http://qa2.vytrack.com/user/login")))
        {
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");

        }
        Thread.sleep(3000);


        driver.close();
    }
}
