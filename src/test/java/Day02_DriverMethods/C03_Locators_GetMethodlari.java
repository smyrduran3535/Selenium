package Day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_Locators_GetMethodlari {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazon sayfasina gidelim
        driver.get("https://amazon.com");
        //Search bolumunu locate edip,iphone aratalim
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);//atama yapmıyoruz sendkeys kullanıyoruz

        //Arama sonuc yazısında iphone yazısını locate edip konsola yazdiralim
        WebElement aramaSonucYazisi = driver.findElement(By.className("sg-col-inner"));
        System.out.println("aramaSonucYazisi = " + aramaSonucYazisi.getText());

        //sayfayi kapatalim
        driver.close();
    }
}
