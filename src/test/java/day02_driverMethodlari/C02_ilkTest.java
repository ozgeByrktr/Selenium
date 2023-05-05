package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_ilkTest {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.com");
       // 4. Sayfa basligini(title) yazdirin
        System.out.println("Sayfa basligi :"+driver.getTitle());

        String expectedtitle="Amazon";
        String actualtitle=driver.getTitle();

        if(actualtitle.contains(expectedtitle)){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }

        //6. Sayfa adresini(url) yazdirin
        System.out.println("sayfa Url: "+driver.getCurrentUrl());

        String expectedUrl="amazon";
        String actualUrl=driver.getCurrentUrl();

        if(actualUrl.contains(expectedUrl)){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }
       //8. Sayfa handle degerini yazdirin
        System.out.println("Sayfanın Handle degeri: "+driver.getWindowHandle());

        //9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin

        String actualKelime=driver.getPageSource();
        String istenenKelime="alisveris";
        if(actualKelime.contains(istenenKelime)){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }
        //10. Sayfayi kapatin.
        Thread.sleep(3000);
        driver.close();
    }
}
