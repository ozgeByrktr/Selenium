package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class C01_driverMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");

        //Sisteme web driverin ne olacagını ve hangi dosya yolu oldugunu söyler
       WebDriver driver=new ChromeDriver();

       //pc 'deki Chrome browser'ın kopyasını olusturur.(Bos bir browser)
       //Uzaktan surekli kontrol ediliyor
       //chrome dısında browser kullanmak istersek driverını indirip dosya yolu olarak
       // onun yolunu gösterip onu tanıtmalıyız "webdriver.safari.driver","safarinin dosya yolu"
        //Driver objesi bizim gozumuz,elimiz gibidir.

       driver.get("https://www.amazon.com"); //istenen url ye götürür
        // (www yazmazsak da bizi götürür ancak
        // https yazmak zorundayız))
        // IT Bootcamp, Distance education method - Wise Quarter Course
        // https://wisequarter.com/
        //Amazon.com. Spend less. Smile more.
        //https://www.amazon.com/
        System.out.println(driver.getTitle());//bize title dondurur
        // Amazon.com. Spend less. Smile more.
        System.out.println(driver.getCurrentUrl());
        //https://www.amazon.com/
        System.out.println(driver.getPageSource());
        System.out.println(driver.getWindowHandle()); //5D87806A7BD8BC34CA2F34E2CA2C00D7 hashcode dondurur
        System.out.println(driver.getWindowHandles());//birden fazla pencerenin hashcodelarını set olarak dondurur

        Thread.sleep(3000); //Kodu bekletir.
        driver.close(); //acılan browser'ı kapatır.



    }
}
