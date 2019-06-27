package com.cybertek.Day4;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;


public class test1 {
    public static void main(String[] args) throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement emailInpputBox =driver.findElement(By.name("email"));
        WebElement submitButton =driver.findElement(By.id("form_submit"));

        Faker faker= new Faker();
        emailInpputBox.sendKeys(faker.funnyName()+("@gmail.com"), Keys.ENTER);

        //emailInpputBox.sendKeys("mouhanmadi@gmail.com"+ Keys.ENTER);
        Thread.sleep(2000);
       // submitButton.click();
        Thread.sleep(3000);

        WebElement confirmationMessage = driver.findElement(By.name("confirmation_message"));
        String expectedMessage="Your e-mail's been sent!";
        String actualMessage = confirmationMessage.getText();

        if(actualMessage.equals(expectedMessage)){
            System.out.println("test passed");
        }else{
            System.out.println("Test failed");
            System.out.println("Expcted message: "+expectedMessage);
            System.out.println("Actual message: "+actualMessage);
        }

        driver.close();

    }
}
