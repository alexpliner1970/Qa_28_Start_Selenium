import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWork {
    WebDriver drv = new ChromeDriver();

    @BeforeClass
    public void setUp(){
        drv.get("https://telranedu.web.app/login");
    }

    @Test
    public void cssLocatorsFromPBookLogin(){
        List<WebElement> a = drv.findElements(By.cssSelector("a"));
        List<WebElement> a1 = drv.findElements(By.tagName("a"));

        List<WebElement> input =drv.findElements(By.tagName("input"));
        List<WebElement> input1 =drv.findElements(By.tagName("input"));

        List<WebElement> button =drv.findElements(By.tagName("button"));
        List<WebElement> button1 =drv.findElements(By.tagName("button"));
    }
}
