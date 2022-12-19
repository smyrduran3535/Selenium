package deneme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ClassWorkHomework_4 {
    public static void main(String[] args) {
        //1. Yeni bir class olusturun (TekrarTesti)
        //2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını
        //doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.YouTube.com/");
        String actualTitle=driver.getTitle();
        String expectTitle="youtube";
        if (actualTitle.contains(expectTitle)){
            System.out.println("Title Testi PASSED");
        }else{
            System.out.println("Title Testi FAILED "+actualTitle);
        }

        //3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa
        //doğru URL'yi yazdırın.
        String actualUrl=driver.getCurrentUrl();
        if (actualUrl.contains("youtube")){
            System.out.println("Url Testi PASSED");
        }else{
            System.out.println("Url Testi FAILED "+ actualUrl);
        }
        //4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        //5. Youtube sayfasina geri donun
        driver.navigate().back();
        //6. Sayfayi yenileyin
        driver.navigate().refresh();
        //7. Amazon sayfasina donun
        driver.navigate().forward();
        //8. Sayfayi tamsayfa yapin
        driver.manage().window().maximize();
        //9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,
        //Yoksa doğru başlığı(Actual Title) yazdırın.
        String actualTitleAmazon=driver.getTitle();
        if (actualTitleAmazon.contains("Amazon")){
            System.out.println("Title Testi PASSED");
        }else{
            System.out.println("Title Testi FAILED "+actualTitleAmazon);
        }

        //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        String actualUrl1=driver.getCurrentUrl();
        String exceptUrl="https://www.amazon.com/";
        if (actualUrl1.contains(exceptUrl)){
            System.out.println("Url Testi PASSED");
        }else{
            System.out.println("Url Testi FAILED "+ actualUrl1);
        }

        //URL'yi yazdırın
        System.out.println(driver.getCurrentUrl());
        //11.Sayfayi kapatin
        driver.close();


    }
}
