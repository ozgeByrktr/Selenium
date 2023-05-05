package day05_relativeLocaters_maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_MavenTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        /*
        1. http://zero.webappsecurity.com sayfasina gidin
2. Signin buttonuna tiklayin
3. Login alanine  “username” yazdirin
4. Password alanina “password” yazdirin
5. Sign in buttonuna tiklayin
6. Back tusu ile sayfaya donun
7. Online Banking menusunden Pay Bills sayfasina gidin
8. amount kismina yatirmak istediginiz herhangi bir miktari yazin
9. tarih kismina “2020-09-10” yazdirin
10. Pay buttonuna tiklayin
11. “The payment was successfully submitted.” mesajinin ciktigini test edin
         */
        driver.get("http://zero.webappsecurity.com");
        driver.findElement(By.id("signin_button")).click();
        WebElement LoginKutusu=driver.findElement(By.id("user_login"));
        LoginKutusu.sendKeys("username");
        WebElement passWord= driver.findElement(By.id("user_password"));
        passWord.sendKeys("password");
        driver.findElement(By.name("submit")).click();
        driver.navigate().back();
        driver.findElement(By.id("onlineBankingMenu")).click();
        driver.findElement(By.id("pay_bills_link")).click();
        WebElement amount=driver.findElement(By.id("sp_amount"));
        amount.sendKeys("200");
        WebElement date=driver.findElement(By.id("sp_date"));
        date.sendKeys("2020-09-04");
        driver.findElement(By.id("pay_saved_payees")).click();
        WebElement submitYaziElemanti=driver.findElement(By.id("alert_content"));
        if(submitYaziElemanti.isDisplayed()) System.out.println("Submit görünürlük testi  Passed");
        else System.out.println("Submit görünürlük testi  Failed");
        driver.close();
    }
}
