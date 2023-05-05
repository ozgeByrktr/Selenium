package day04_xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_xpath {
    public static void main(String[] args) throws InterruptedException {
        /*
        1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
2- Add Element butonuna basin
3- Delete butonu’nun gorunur oldugunu test edin
4- Delete tusuna basin
5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
         */
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        WebElement deleteButonu= driver.findElement(By.xpath("//button[@class='added-manually']"));
        if(deleteButonu.isDisplayed()){
            System.out.println("Delete butonu Görünürlüğü testi PASSED");
        }else{
            System.out.println("Delete butonu Görünürlüğü testi FAİLED");
        }
        Thread.sleep(1000);
        deleteButonu.click();

        WebElement add_removeText= driver.findElement(By.xpath("//h3"));
        if(add_removeText.isDisplayed()){
            System.out.println("add_removeText testi PASSED");
        }else{
            System.out.println("add_removeText testi FAİLED");
        }
        Thread.sleep(5000);
        driver.close();

    }
}
