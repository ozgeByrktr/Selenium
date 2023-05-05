package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_WebElementMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.com");
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        System.out.println(aramaKutusu.isDisplayed()); //Görünüyor mu???
        System.out.println(aramaKutusu.isEnabled()); //Ulaşılabiliyor mu??
        System.out.println(aramaKutusu.getText()); //webElement üzerinde yazı varsa onu getirir.
        aramaKutusu.sendKeys("Nutella");
        Thread.sleep(2000);
        aramaKutusu.clear();

        System.out.println(aramaKutusu.getSize());//(789,38)
        System.out.println(aramaKutusu.getSize().height);//38

        System.out.println(aramaKutusu.getTagName()); //input

        System.out.println(aramaKutusu.getAttribute("class")); //nav-input nav-progressive-attribute
        System.out.println(aramaKutusu.getLocation());// Pixel olarak Konumu verir
        System.out.println(aramaKutusu.getRect().getDimension()); //Dikdortgen ozelliklerini getirir


        Thread.sleep(5000);
        driver.close();
    }
}
