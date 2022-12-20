package Day03_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_Css_Selector {
    public static void main(String[] args) {
        // Aslında ilk tercih id eğer yoksa xPath....
// xPath de driver aramaya DOM(İnspect yaptığımız zaman açılan alan)'un
// en başından başlıyor buna parent-child diyoruz yani önceki ve sonraki locatelere bakarak
// bizim yazdığımız adresi buluyor yavaş ama kesin çözüm.cssSelector ü de hızlı olduğu için tercih ediyoruz.
// Eğer hız beklentimiz yoksa nokta atışı yaparak elementi bulabilmek için xPath i tercih ediyoruz
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Tekrar Testi


        //https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");

        //Sayfayi “refresh” yapin
        driver.navigate().refresh();

        //Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String actualTitle = driver.getTitle();
        String arananKelime = "Spend less";
        if (actualTitle.contains(arananKelime)){
            System.out.println("Title Testi PASSED");
        }else System.out.println("Title Testi FAILED");

        //Gift Cards sekmesine basin
        driver.findElement(By.cssSelector("a[href='/gift-cards/b/?ie=UTF8&node=2238192011&ref_=nav_cs_gc']")).click();

        //Birthday butonuna basin
        /*
        <img src="https://images-na.ssl-images-amazon.com/images/G/01/gift-certificates/consumer/2021/GCLP/Support/2x/Occ_Birthday_346x130.png"
        alt="Birthday">
         */
        driver.findElement(By.cssSelector("img[alt='Birthday']")).click();
        //Best Seller bolumunden ilk urunu tiklayin
        List<WebElement> bestSellerB = driver.findElements(By.cssSelector("img[alt='Amazon.com eGift Card']"));
        bestSellerB.get(0).click();
        /*
        <img alt="Amazon.com eGift Card" src="https://images-na.ssl-images-amazon.com/images/I/51f+fN6y6QL._AC_SX184_.jpg"
        data-a-hires="https://images-na.ssl-images-amazon.com/images/I/51f+fN6y6QL._AC_SX368_.jpg">
         */

        //Gift card details’den 25 $’i secin
        driver.findElement(By.cssSelector("span[id='a-autoid-28']")).click();

        //Urun ucretinin 25$ oldugunu test edin
        WebElement urunUcreti = driver.findElement(By.cssSelector("span[id='gc-live-preview-amount']"));
        if (urunUcreti.getText().equals("$25.00")){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED");

        //Sayfayi kapatin
        //driver.close();

        /*
        driver.get("https://www.amazon.com/");
driver.navigate().refresh();
if (driver.getTitle().contains("Spend less")){
    System.out.println("Title Test PASSED");
}System.out.println("Title Test FAILED");
driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]"));
driver.findElement(By.xpath("//*[@id=\"contentGrid_850952\"]/div/div[2]/div[2]/div/div/a"));
driver.findElement(By.xpath("//*[@id=\"acs-product-block-0\"]/div[1]/a/img"));
driver.findElement(By.xpath("//*[@id=\"gc-mini-picker-amount-1\"]"));
String ucret = driver.findElement(By.xpath("//*[@id=\"gc-buy-box-text\"]/span")).getText();
if(ucret.equals("25$")){
    System.out.println("Ucret Testi PASSED");
}else System.out.println("Ucret Testi FAILED");
driver.close();
         */
    }
}
