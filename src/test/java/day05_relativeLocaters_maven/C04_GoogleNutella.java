package day05_relativeLocaters_maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_GoogleNutella {
    public static void main(String[] args) {
        /*
        1- C01_TekrarTesti isimli bir class olusturun
2- https://www.google.com/ adresine gidin
3- cookies uyarisini kabul ederek kapatin
4- Sayfa basliginin “Google” ifadesi icerdigini test edin
5- Arama cubuguna “Nutella” yazip aratin
6- Bulunan sonuc sayisini yazdirin
7- sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
8- Sayfayi kapatin
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://google.com");

        String expectedtitle="Google";
        String actualtitle= driver.getTitle();
        if (actualtitle.contains(expectedtitle)) System.out.println("Title testi PASSED");
        else System.out.println("Title testi FAILED");

        WebElement aramaKUtusu=driver.findElement(By.id("APjFqb"));
        aramaKUtusu.sendKeys("Nutella"+ Keys.ENTER);

        WebElement sonucYaziElementi=driver.findElement(By.id("result-stats"));
        System.out.println("Aratılan sonuc sayısı: "+sonucYaziElementi.getText());

        String sonucyazisiStr=sonucYaziElementi.getText();
        String [] sonucYaziKelimeleriArr=sonucyazisiStr.split(" ");

        String sonucSayiAdediStr=sonucYaziKelimeleriArr[1];

        sonucSayiAdediStr = sonucSayiAdediStr.replaceAll("\\D",""); // "130000000"

        int sonucSayiAdediInt=Integer.parseInt(sonucSayiAdediStr);

        if(sonucSayiAdediInt>10000000) System.out.println("SonucYazi Testi PASSED");
        else System.out.println("SonucYazi Testi FAILED");
        driver.close();
    }
}
