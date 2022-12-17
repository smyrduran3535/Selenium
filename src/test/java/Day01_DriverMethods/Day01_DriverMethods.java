package Day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_DriverMethods {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        System.out.println("sayfa baslıgı : "+driver.getTitle());
        System.out.println("sayfa url si : "+driver.getCurrentUrl());
       // System.out.println("sayfanın page kaynak kodları "+driver.getPageSource());
        System.out.println(driver.getWindowHandle());//icinde olunan sayfa/tabların handle degerlerini verir.bize o window a ait hash degereini verir.
        // biz bu hash degerlerini bir stringe atayıp pencereler arası gecis yapabiliriz..set in cozumu uzun arraylist kolay




    }
}
//System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");