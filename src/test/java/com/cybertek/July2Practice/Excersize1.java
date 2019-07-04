package com.cybertek.July2Practice;

import com.cybertek.Utilities.BrowserFactory;
import com.cybertek.Utilities.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Excersize1 {


        static WebDriver driver = BrowserFactory.getDriver("chrome");

        public static void main(String[] args) {
           // openRadioButtonPage();
            test1();
            test2();
            test3();
            driver.close();
        }


        public static void openRadioButtonPage(){
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get("http://practice.cybertekschool.com/radio_buttons");
        }

        //let's check if blue radio button is selected
        public static void test1(){
            WebElement blueBtn = driver.findElement(By.id("blue"));
            if(blueBtn.isSelected()){
                System.out.println("PASSED");
            }else{
                System.out.println("FAILED");
            }
            SeleniumUtils.waitPlease(2);
        }

        //let's check that green button is disabled, that means not clickable
        // and black button is clickable
        public static void test2(){
            WebElement blackBtn  = driver.findElement(By.id("black"));
            WebElement greenBTN = driver.findElement(By.id("green"));
            if(blackBtn.isEnabled() && (!greenBTN.isEnabled())){
                System.out.println("PASSED");
            }else{
                System.out.println("FAILED");
            }
            SeleniumUtils.waitPlease(2);
        }
        //TASK!
        //write a test(method) that will do following:
        //verify that blue button is selected
        //then click on black button
        //verify that black button is selected
        //verify that blue button is not selected

        public static void test3(){
            WebElement blueBtn =  driver.findElement(By.id("blue"));
            if(blueBtn.isSelected()){
                System.out.println("PASSED");
                System.out.println("Blue selected");
            }else{
                System.out.println("FAILED");
                System.out.println("Blue is not selected!");
            }
            WebElement blackBtn = driver.findElement(By.id("black"));
            SeleniumUtils.waitPlease(2);
            blackBtn.click();
            SeleniumUtils.waitPlease(2);
            //we are checking if black button is selected
            if(blackBtn.isSelected()){
                System.out.println("PASSED");
                System.out.println("Black is selected");
            }else{
                System.out.println("FAILED");
                System.out.println("Black is not selected");
            }
            // ! means opposite. To check if blue button
            //is not selected any more
            //based on requirements, we canot have more
            //then one favorite color
            if(!blueBtn.isSelected()){
                System.out.println("PASSED");
                System.out.println("Blue is not selected");
            }else{
                System.out.println("FAILED");
                System.out.println("Blue is selected!");
            }
        }

        public static void test4(){
            List<WebElement>listOfRadioButtons = driver.findElements(By.xpath(""));
        }
    }