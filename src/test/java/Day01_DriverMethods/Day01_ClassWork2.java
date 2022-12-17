package Day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day01_ClassWork2 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//bu method sayfadaki her bir webelement icin
        //max. bekleme suresini belirler

        //ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://www.facebook.com");
        String  sayfaBasligi=driver.getTitle();
        if (sayfaBasligi.contains("facebook")){
            System.out.println("Title testi PASSED");
        }else{
            System.out.println("Title testi FAILED"+ "dogru baslık"+sayfaBasligi);
        }


        //Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        //yazdirin.
        String actualUrl=driver.getCurrentUrl();
        if (actualUrl.contains("facebook")){
            System.out.println("Url testi PASSED");
        } else{
            System.out.println("Url testi PASSED");
        }
        //https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com/ ");
        //Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String actualWalmartTitle=driver.getTitle();
        String ecpectedWalmartTitle="Walmart.com";
        if (actualWalmartTitle.contains(ecpectedWalmartTitle)){
            System.out.println("Title testi PASSED");
        }else{
            System.out.println("Title testi FAILED");
        }
        //Tekrar “facebook” sayfasina donun
        driver.navigate().back();
        //Sayfayi yenileyin
        driver.navigate().refresh();
        //Sayfayi.Browser’i kapatin
        driver.close();
    }
}
