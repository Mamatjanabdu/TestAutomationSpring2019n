package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OfficeHourseExcersize {

    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("http://www.google.com");
        driver.navigate().to("http://amazon.com");
        driver.navigate().back();
        driver.navigate().forward();



            //   System.setProperty("Webdrivername","path");

            WebDriverManager.chromedriver().setup();   // sets System properties




            driver.get("http://www.google.com");  // protocol must be provided
            // http : hypertext transfer protocol
            // https:  hypertext transfer protocol secure

            String  PageTitle = driver.getTitle();


            // expected condition: titile should contain "Google"


// verify title
            if(PageTitle.contains("Amazon")){

                System.out.println("Page titile is verified");

            } else{

                System.err.println("Page title is not verified");
                System.exit(0);
            }

            // Assert.assertrue(condition);


            // new Actions(driver).pause(3000).perform();
//        try {
//            Thread.sleep(3000);    // Checked exceptions needs to be handled immidietly. because they occure during compile time
//        } catch (Exception e){
//
//        }

//            library.sleep(1);
//
//// manage window:
//
//            // maximize window:
//            driver.manage().window().maximize();
//
//            library.sleep(1 );
//
//            // fullscreen:
//            driver.manage().window().fullscreen();
//
//
//            library.sleep(1 );
//
//
//            //   driver.manage().window().setSize( new Dimension(6,7));
//
//
//            // Navigate: refresh, go back, go forward, open URL.
//
//            // refresh():
//            driver.navigate().refresh();
//            library.sleep(0.5 );
//
//            // goback:
//            driver.navigate().back();
//            library.sleep(1 );
//
//            // forward:
//            driver.navigate().forward();
//            library.sleep(1 );
//
//            driver.navigate().to("https://www.amazon.com");
//            library.sleep(1 );
//
//            String PageURL =  driver.getCurrentUrl();
//
//            // excepted: URL should contain "www.amazon.com"
//
//            if(!PageURL.contains("www.amazon.com")){
//                System.out.println("URL is verified");
//            } else{
//                System.err.println("URL is not verified");
//                System.exit(0);
//            }




        /*
            differences between navigate().to()  and get():
                        get() wait for webpage fully uploaded.
                        nevigate.to() does not have to wait (faster)

         */

            driver.navigate().back();


            System.out.println("Test completed");

            //   driver.close();
            driver.quit();


          /*
                differences between quite() and close();
                            close(): closes the one single tab.
                            quite(): closes the entire tabs and browser

           */




            //      method1();  // throws

            method2();   // try& catch


        }


        public static void method1() throws  Exception{


            Thread.sleep(1000);

        }

        public static void method2() {


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }

        }






    }














/*
 we can use either get() or navigate().to() method to go URL
                differences between navigate().to()  and get():
                                get() wait for webpage fully uploaded.
                                nevigate.to() does not have to wait (faster)

               Navigation: with navigations we can:
                    refresh : navigate().refresh();
                    go back: Navigate().back;
                    forward: Navigate().forward();

           manage window:

                    full screren:  driver.manage().window().fullscreen();
                    maximize: driver.manage().window().maximize();
                    setSize:    driver.manage().window().setSize(  new Dimension(10,20) );


            to verify webPage title: getTitle();
            to verify the URL: getCurrentURL();



         */



