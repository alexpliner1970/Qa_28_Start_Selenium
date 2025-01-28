import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Index {

    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("file:///C:/Users/alexp/Downloads/21.index.html");
    }

    @Test
    public void cssLocators() {
        WebElement button = wd.findElement(By.tagName("button"));

        WebElement button2 =wd.findElement(By.cssSelector("button"));
        WebElement a= wd.findElement(By.tagName("a"));
        List<WebElement> listA = wd.findElements(By.tagName("a"));

        WebElement form =wd.findElement(By.tagName("form"));
    }

}
