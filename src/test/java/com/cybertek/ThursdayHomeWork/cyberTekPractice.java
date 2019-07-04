package com.cybertek.ThursdayHomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cyberTekPractice {
    public static void main(String[] args) throws Exception{

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://practice.cybertekschool.com/login");
        Thread.sleep(3000);

        WebElement userName= driver.findElement(By.name("username"));
        userName.sendKeys("tom"+Keys.ENTER);
        Thread.sleep(2000);
        WebElement passWord = driver.findElement(By.name("password"));
        passWord.sendKeys("12345"+Keys.ENTER);
        Thread.sleep(2000);
      //  WebElement login = driver.findElement(By.id("wooden_spoon"));
      //login.click();
      //  WebElement login = driver.findElement(By.xpath("//*[@id=\"wooden_spoon\"]"))

        WebElement confirmationMessage = driver.findElement(By.xpath("//*[@id=\"flash\"]"));
        String expectedMessage="Your username is invalid!\n" +
                "×";
        String  actualMessage= confirmationMessage.getText();

        System.out.println("Actual message: "+actualMessage);

        if(actualMessage.equals(expectedMessage)){
            System.out.println("test passed");
        }else{
            System.out.println("Test failed");
      System.out.println("Expcted message: "+expectedMessage);
           System.out.println("Actual message: "+actualMessage);
        }

       // driver.close();

    }
}
