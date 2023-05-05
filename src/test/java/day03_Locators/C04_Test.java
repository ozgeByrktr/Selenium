package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04_Test {
    public static void main(String[] args) {
        /*
        1- Bir test class’i olusturun ilgili ayarlari yapin
2- https://www.automationexercise.com/ adresine gidin
3- Sayfada 147 adet link bulundugunu test edin.
4- Products linkine tiklayin
5- special offer yazisinin gorundugunu test edin
6- Sayfayi kapatin
         */
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(" https://www.automationexercise.com/");
        List<WebElement> linkElementleri =driver.findElements(By.tagName("a"));

        int expectedLinksayi=147;
        int actualLinksayisi=linkElementleri.size();
        if(actualLinksayisi==expectedLinksayi){
            System.out.println("Link sayisi Test Passed");
        }else{
            System.out.println("Link sayisi Test Failed");
        }
        WebElement ProductLink= driver.findElement(By.partialLinkText(" Products"));
        ProductLink.click();
        WebElement SpecialOffer= driver.findElement(By.id("sale_image"));
        if(SpecialOffer.isDisplayed()){
            System.out.println("Special Offer Test Passed");
        }else{
            System.out.println("Special Offer Test Failed");
        }
       driver.close();
    }
}
