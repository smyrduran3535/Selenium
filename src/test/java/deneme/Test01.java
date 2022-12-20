package deneme;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test01 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//1-Test01 isimli bir class olusturun
        //2- https://www.amazon.com/ adresine gidin
        //3- Browseri tam sayfa yapin
        //4-Sayfayi “refresh” yapin
        //5-”Salesforce Apex Questions Bank” icin arama yapiniz
        //6- Kac sonuc bulundugunu yaziniz
        //7-Sayfayi kapatin

        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.navigate().refresh();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Salesforce Apex Questions Bank"+ Keys.ENTER);
        //Thread.sleep(3000);
        WebElement result=driver.findElement(By.className("sg-col-inner"));
        List<String> myList = new ArrayList<String>(Arrays.asList(result.getText().split(" ")));
        //System.out.println("result.getText() = " + result.getText());
        System.out.println("Amount of Result : "+myList.get(0));

        driver.quit();


    }
}
