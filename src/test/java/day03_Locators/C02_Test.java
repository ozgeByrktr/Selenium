package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_Test {
    public static void main(String[] args) throws InterruptedException {
       /* Automation Exercise Category Testi
        1- Bir test class’i olusturun ilgili ayarlari yapin
        2- https://www.automationexercise.com/ adresine gidin
        3- Category bolumundeki elementleri locate edin
        4- Category bolumunde 3 element oldugunu test edin
        5- Category isimlerini yazdirin
        6- Sayfayi kapatin */

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.automationexercise.com/");
        List <WebElement> CatagoryElementsList= driver.findElements(By.className("panel-title"));
        int expectedSize=3;
        int actualSize=CatagoryElementsList.size();
        if(expectedSize==actualSize){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }
        for (WebElement eachCatagory:CatagoryElementsList
             ) {
            System.out.println(eachCatagory.getText() +" ");
        }

        Thread.sleep(5000);
        driver.close();
    }
}
