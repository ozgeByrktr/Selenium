package day02_driverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_driverManageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        /*
            Selenium 4.7 versiyonu ile kendi driver'ini sisteme ekledi
           Kodlar calismaya basladiginda biz driver icin yol gostermezsek
           Selenium kendi driver'ini devreye sokuyor
           Ama baslangicta driver ayari aradigi icin biraz yavas calisiyor
            driver.manage().window().istenen ayar ile window'umuzu istedigimiz boyuta getirebilir
            veya window'un konum ve buyukluk bilgilerine ulasabiliriz

            Biz genelde bir teste baslamadan once
            window'u maximize yapmayi tercih ederiz
         */

       WebDriver driver=new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
      //Websayfası acılıncaya ya da aradıgımız elementler bulununcaya kadar driverın bekleyecegi max sureyi belirler
       driver.get("https://www.amazon.com");
        System.out.println("Baslangıcta Konum: "+driver.manage().window().getPosition());//Baslangıcta Konum: (9, 9)

        System.out.println("Baslangıcta Boyut :"+driver.manage().window().getSize());//Baslangıcta Boyut :(1051, 798)

      Thread.sleep(1000);
        //ekranı buyultmesini istiyoruz
         driver.manage().window().maximize();
        System.out.println("Maxi Konum: "+driver.manage().window().getPosition());//Sonraki Konum: (-8, -8)

        System.out.println("Maxi Boyut :"+driver.manage().window().getSize());// Sonraki Boyut :(1552, 832)
        Thread.sleep(1000);
        driver.manage().window().minimize();
        System.out.println("Minimize Konum: "+driver.manage().window().getPosition());

        System.out.println("Minimize Boyut :"+driver.manage().window().getSize());
        Thread.sleep(1000);

        driver.manage().window().setPosition(new Point(50,50));
        driver.manage().window().setSize(new Dimension(500,500));
        System.out.println("istediğimiz Konum: "+driver.manage().window().getPosition());

        System.out.println("istediğimizBoyut :"+driver.manage().window().getSize());


       Thread.sleep(3000);
       driver.close();
    }
}
