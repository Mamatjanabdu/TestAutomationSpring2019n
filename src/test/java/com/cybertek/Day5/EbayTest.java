package com.cybertek.Day5;

import com.cybertek.Utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.security.Key;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class EbayTest {
    public static class LocatersPracticeTagName {


        static WebDriver driver = BrowserFactory.getDriver("chrome");

        public static void main(String[] args) throws Exception {

                WebDriver driver=BrowserFactory.getDriver("chrome");
                driver.get("http://practice.cybertekschool.com/");
                driver.manage().window().maximize();

                List<WebElement> list=driver.findElements(By.id("login"));
                driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
                System.out.println(list.size());
                for (WebElement ele:list) {
                    System.out.println(ele.getText());
                }
                driver.close();
            }
        }}