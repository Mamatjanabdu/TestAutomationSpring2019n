package com.cybertek.Day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class July2 {
    public static void main(String[] args) throws Exception {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
//
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.get("https://www.amazon.com");
//        Thread.sleep(2000);
//
//        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Book");
//        driver.findElement(By.className("nav-input")).click();
//        String title = driver.getTitle();
//
//        if (title.contains("Book")) {
//            System.out.println("Passed");
//        } else {
//            System.out.println("Failed");
//        }
//        driver.close();
//
        //    TEST 2
//    go to wikipedia.org
//    enter search term ‘selenium webdriver’
//    click on search button
//    click on search result ‘Selenium (software)’
//    verify url ends with ‘x’
//        public static void test2() throws Exception {
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get("https://www.wikipedia.org/");
            driver.findElement(By.id("searchInput")).sendKeys("selenium webdriver", Keys.ENTER);
            Thread.sleep(2000);
            driver.findElement(By.linkText("Selenium (software)")).click();
            Thread.sleep(2000);
            String url = driver.getCurrentUrl();
            if (url.endsWith("x")) {
                System.out.println("passed");
            } else {
                System.out.println("failed");
            }
            driver.close();

        }
    }

//     WebDriverManager.chromedriver().setup();
//    WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.navigate().to("http://amazon.com");
//        Thread.sleep(3000);
//
//    WebElement userName= driver.findElement(By.id("twotabsearchtextbox"));
//        userName.sendKeys("java book"+Keys.ENTER);
//        Thread.sleep(2000);
//
//        WebElement confirmationMessage = driver.findElement(By.xpath("//*[@id=\"flash\"]"));
//        String expectedMessage="Your username is invalid!\n" +
//                "×";
//        String  actualMessage= confirmationMessage.getText();
//
//        System.out.println("Actual message: "+actualMessage);
//
//        if(actualMessage.equals(expectedMessage)){
//            System.out.println("test passed");
//        }else{
//            System.out.println("Test failed");
//            System.out.println("Expcted message: "+expectedMessage);
//            System.out.println("Actual message: "+actualMessage);
//        }

        // driver.close();



