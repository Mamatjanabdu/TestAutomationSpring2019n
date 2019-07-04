package com.cybertek.Day5;

import com.cybertek.Utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatersPracticeTagName {
    static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) throws Exception {
        //here we will execute our tests
        //we will create separate method for every test
        test1();

    }
    public static void test1() throws Exception {
        driver.manage().window().maximize();
        //selenium will wait up to 30 seconds to find element
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        //HOW TO FIND ALL BUTTONS?
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        System.out.println("size: "+buttons.size());
        for (WebElement button : buttons) {
            System.out.println(button.getText());
            button.click();
            Thread.sleep(1000);
        }
        driver.close();
    }

}