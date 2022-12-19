package Day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04_example {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //1. Bir class oluşturun : AmazonSearchTest

        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.

        //a.web sayfasına gidin. https://www.amazon.com/
        driver.get("https://amazon.com");
        //b. Search(ara) “city bike”
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike", Keys.ENTER);
        //c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        WebElement aramaSonucYazisi = driver.findElement(By.className("sg-col-inner"));
        System.out.println("aramaSonucYazisi = " + aramaSonucYazisi.getText());
        //d. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
    }
}
