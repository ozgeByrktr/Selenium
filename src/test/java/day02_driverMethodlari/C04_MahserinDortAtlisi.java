package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_MahserinDortAtlisi {
    public static void main(String[] args) {
        //1- Driver icin gerekli ayarlama yap
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        //2-driver olustur
        WebDriver driver=new ChromeDriver();
        //3-Maxi yap Tam ekran
        driver.manage().window().maximize();
        //4-Gecikmeler icin bekleme suresi tanimla
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        //Bu 4 adım her testin basinda yapacagimiz islemlerdir.
        driver.close();
    }
}
