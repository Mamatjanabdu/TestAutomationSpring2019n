package com.cybertek.Day7;

import com.cybertek.Utilities.BrowserFactory;
import com.cybertek.Utilities.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDownPractice {


    static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) {
        openDropDownPage();
        SeleniumUtils.waitPlease(2);
        test2();
        SeleniumUtils.waitPlease(2);
        driver.close();
    }

    public static void openDropDownPage() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement element = driver.findElement(By.xpath("//h3[text()='Dropdown List']"));
        SeleniumUtils.verifyIsDisplayed(element);
    }


    public static void test1() {
        WebElement dropdown1 = driver.findElement(By.id("dropdown"));
        //to work with select elements
        //we need to use Select class
        //don't forget to pass web element of that dropdown that you found into constructor
        Select dropdownSelect = new Select(dropdown1);
        //since dropdown consists of options
        //we can check which one is selected
        //getFirstSelectedOption() return webelement, use getText() method if
        //you want to get a text of this option, Usally, text is a visible part of
        //dropdown. Value or other attributes of drop down, not visible.
        String actual = dropdownSelect.getFirstSelectedOption().getText();
        String expected = "Please select an option";
        SeleniumUtils.verifyEquals(expected, actual);
        //we can get list of options that are present in the dropdown
        List<WebElement> options = dropdownSelect.getOptions();
        for (WebElement option : options) {
            System.out.println(option.getText());
        }
    }

    public static void test2() {

        WebElement dropdownState = driver.findElement(By.id("state"));
        Select dropDownSelect = new Select(dropdownState);
        List<WebElement> states = dropDownSelect.getOptions();
        for (WebElement element : states) {
            System.out.println(element.getText());
        }
        //let's select virginia
        //we have to use object of Select class
        dropDownSelect.selectByVisibleText("Virginia");
        SeleniumUtils.waitPlease(2);
        dropDownSelect.selectByVisibleText("Texas");
        SeleniumUtils.waitPlease(2);
        dropDownSelect.selectByVisibleText("California");
        SeleniumUtils.waitPlease(2);
        dropDownSelect.selectByVisibleText("Kansas");
        SeleniumUtils.waitPlease(2);
        dropDownSelect.selectByVisibleText("New Jersey");
        SeleniumUtils.waitPlease(2);
        dropDownSelect.selectByVisibleText("Florida");
        SeleniumUtils.waitPlease(2);
        dropDownSelect.selectByVisibleText("Tennessee");
        SeleniumUtils.waitPlease(2);
        dropDownSelect.selectByVisibleText("Ohio");
        SeleniumUtils.waitPlease(2);
        dropDownSelect.selectByVisibleText("Colorado");
        SeleniumUtils.waitPlease(2);
        dropDownSelect.selectByVisibleText("Nebraska");
        SeleniumUtils.waitPlease(2);
        dropDownSelect.selectByVisibleText("Arkansas");
        SeleniumUtils.waitPlease(2);
        dropDownSelect.selectByVisibleText("District Of Columbia");
        SeleniumUtils.waitPlease(2);
        dropDownSelect.selectByVisibleText("Pennsylvania");

    }


    public static void test3() {
        WebElement dropdownState = driver.findElement(By.id("state"));
        Select dropDownSelect = new Select(dropdownState);
        //we found all options that are available to select
        List<WebElement> states = dropDownSelect.getOptions();
        //we loop through all options
        for(WebElement option: states){
            SeleniumUtils.waitPlease(1);
            //and select every option by text
            dropDownSelect.selectByVisibleText(option.getText());
        }
    }
    //select by value
    public static void test4(){
        WebElement dropdownState = driver.findElement(By.id("state"));
        Select dropDownSelect = new Select(dropdownState);
    }
    //select by index
    public static void test5(){
        WebElement dropdownState = driver.findElement(By.id("state"));
        Select dropDownSelect = new Select(dropdownState);
        dropDownSelect.selectByIndex(5);
    }
    //multiple select
    public static void test6(){
        WebElement multipleSelectionWebElement = driver.findElement(By.xpath("//select[@name='Languages']"));
        Select multipleSelectionSelect = new Select(multipleSelectionWebElement);

        SeleniumUtils.waitPlease(2);
        multipleSelectionSelect.selectByVisibleText("Java");
        SeleniumUtils.waitPlease(2);
        multipleSelectionSelect.selectByVisibleText("JavaScript");
        SeleniumUtils.waitPlease(2);

    }
}








