package deneme;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassWorkHomeWork_2 {
    public static void main(String[] args) {
        //1. Yeni bir Class olusturalim.C07_ManageWindowSet
        WebDriver driver=new ChromeDriver();

        //2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println(driver.manage().window().getSize());
        System.out.println(driver.manage().window().getPosition());

        //4. Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage( ).window( ).setSize(new Dimension( 800 , 600 ));
        driver.manage().window().setPosition(new Point(50,50));
        System.out.println(driver.manage().window().getSize());
        System.out.println(driver.manage().window().getPosition());

        //5. Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        Point actualYeniSize= driver.manage( ).window( ).getPosition() ;
        if (actualYeniSize.getX()==50&&actualYeniSize.getY()==50){
            System.out.println("Size Testi PASSED");
        }else{
            System.out.println("Pozition Testi FAILED");
        }
        Dimension actualYeniPozition=driver.manage( ).window( ).getSize();
if (actualYeniPozition.getWidth()==800&&actualYeniPozition.getWidth()==800){
    System.out.println("Pozition Testi PASSED");
}else System.out.println("Pozition Testi FAILED");

        //8. Sayfayi kapatin
        driver.close();

    }
}
