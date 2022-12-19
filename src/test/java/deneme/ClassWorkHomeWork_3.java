package deneme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ClassWorkHomeWork_3 {
    public static void main(String[] args) {
        //1.Yeni bir class olusturalim (Homework)
        //2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.get("https://www.facebook.com");

     String sayfaBasligi= driver.getTitle();
     if (sayfaBasligi.contains("facebook")){
         System.out.println("Title Testi PASSED");
     }else{
         System.out.println("Title Testi FAILED "+sayfaBasligi);
     }
        //3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        //yazdirin.
        System.out.println(driver.getCurrentUrl());
     String actualUrl=driver.getCurrentUrl();
     if (actualUrl.contains("facebook")){
         System.out.println("Url Testi PASSED");
     }else{
         System.out.println("Url Testi FAILED" +actualUrl);
     }
        //4.https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com/");
        //5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String sayfaTitle=driver.getTitle();
        String exceptWalmartTitle="Walmart.com";
        if (sayfaTitle.contains(exceptWalmartTitle)){
            System.out.println("Title Testi PASSED");
        }else{
            System.out.println("Title Testi FAILED");
        }
        //6. Tekrar “facebook” sayfasina donun
        driver.navigate().back();
        //7. Sayfayi yenileyin
        driver.navigate().refresh();
        //8.Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();
        //9.Browser’i kapatin
        driver.close();
    }
}
