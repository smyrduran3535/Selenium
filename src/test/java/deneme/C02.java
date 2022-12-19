package deneme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //amazon sayfasına git
        driver.get("https://www.amazon.com/");
        //hepsiburada sayfasına git
        driver.get("https://www.techproeducation.com/");
        //tekrar amazon sayfasına git
        Thread.sleep(3000);
        driver.navigate().back();
        //tekrar hepsiburada sayfasına git
        Thread.sleep(3000);
        driver.navigate().forward();
        //son sistemde sayfayı yenileyin
        Thread.sleep(3000);
        driver.navigate().refresh();
        //sayfayı kapat
        driver.close();

    }
}
