package deneme;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class TEKRAR {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
//WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
//aramaKutusu.click();
//
        WebElement aramaKutusu1=driver.findElement(By.name("field-keywords"));
        aramaKutusu1.sendKeys("iphone", Keys.ENTER);
        List<WebElement> inputTags=driver.findElements(By.tagName("input"));
        System.out.println(inputTags.size());
        List<WebElement> aTags=driver.findElements(By.tagName("a"));
        System.out.println(aTags.size());

    }
}
