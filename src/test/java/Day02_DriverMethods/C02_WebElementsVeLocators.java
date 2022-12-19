package Day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_WebElementsVeLocators {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazonsayf git
        driver.get("https://www.amazon.com");
        //sarce bolumunu locate edelim
       WebElement searceBox= driver.findElement(By.id("twotabsearchtextbox"));
       searceBox.click();
        //serce bolumunde ıphone aratalım
        searceBox.sendKeys("iphone", Keys.ENTER);
        //yukarıdakiyle aynı
       // WebElement passwordTextBox =driver.findElement(By.name("iphone")); :name ile de ulasabiliriz
      //  searceBox.submit();


        /*
Eger bir webelementi (Web sayfasindaki her bir buton ya da text/yazi) locate (konumunu belirleme)
etmek istersek once manual olarak web sayfasini acip sayfa uzerinde sag click yapip incele/inspect butonuna tiklariz.
Karsimiza cikan HTML code'larindan locator'lardan (konum belirleyiciler) unique (essiz) olani seceriz.
Genellikle id Attribute'u kullanilir. Sectigimiz attribute degerini findElement() method'u icine
findElement(BY.id("attribute degeri")) seklinde yazariz.
 */

        //amazon sayfasındaki <input> ve <a> taglarının sayısını yazdırınız
        List<WebElement> inputTag=driver.findElements(By.tagName("input"));
        System.out.println("inputTag.size() = " + inputTag.size());
        List<WebElement> linklerList=driver.findElements(By.tagName("a"));
        System.out.println("link.size() = " + linklerList.size());


        //link isimleerini yazdırmak istersek; for each kullanabiliriz ******fineElements******** kull
for (WebElement w: linklerList){
    System.out.println(w.getText());
}

    }
}
