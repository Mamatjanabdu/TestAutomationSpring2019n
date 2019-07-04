package com.cybertek.July2Practice;

import com.cybertek.Utilities.BrowserFactory;
import com.cybertek.Utilities.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class RadioButtonPractice {



        static WebDriver driver = BrowserFactory.getDriver("chrome");

        public static void main(String[] args) {
            openRadioButtonPage();
            test2();
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

    }

//verify that clue button is selected
//then click on black button
//verify that black button is selected
//verify that blue button is not selected