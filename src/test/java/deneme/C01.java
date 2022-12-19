package deneme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01 {
    public static void main(String[] args) {
        //    Yeni bir package olusturalim : day01
        //Yeni bir class olusturalim : C03_GetMethods
        WebDriver driver =new ChromeDriver();
        //Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get(" https://www.amazon.com/");
        //Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());
        String sayfaBasligi= driver.getTitle();
        //Sayfa basliginin “Amazon” icerdigini test edin
        if (sayfaBasligi.contains("Amazon")){
            System.out.println("Title Testi PASSED");
        }else{
            System.out.println(("Title Testi FAILED"));
        }
        //Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());
        //Sayfa url’inin “amazon” icerdigini test edin.
        String url= driver.getCurrentUrl();
        if (url.contains("amazon")){
            System.out.println("Url Testi PASSED");
        }else{
            System.out.println("Url Testi FAILED");
        }
        //Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());
        //Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        String sourceHtml=driver.getPageSource();
        if (sourceHtml.contains("Gateway")){
            System.out.println("Html Testi PASSED");
        }else{
            System.out.println("Html Testi FAIlED");
        }
        //Sayfayi kapatin
        driver.close();





    }
}
