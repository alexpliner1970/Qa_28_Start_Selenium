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
    public void classWork(){
        WebElement al3= drv.findElement(By.xpath("//h1/ancestor::*"));
    }

    @Test
    public void cssLocatorsFromPBookLogin(){
        WebElement  body =drv.findElement(By.tagName("body"));
        WebElement  body1 =drv.findElement(By.cssSelector("body"));

        WebElement div = drv.findElement(By.cssSelector("div"));
        WebElement div1 = drv.findElement(By.tagName("div"));

        WebElement h1=drv.findElement(By.cssSelector("h1"));

        List<WebElement> a = drv.findElements(By.cssSelector("a"));
        List<WebElement> a1 = drv.findElements(By.tagName("a"));

        List<WebElement> input =drv.findElements(By.tagName("input"));
        List<WebElement> input1 =drv.findElements(By.cssSelector("input"));

        List<WebElement> button =drv.findElements(By.tagName("button"));
        List<WebElement> button1 =drv.findElements(By.cssSelector("button"));


         //===HomeWork_01_02_2025

        //by class

        WebElement div2 =drv.findElement(By.className("container"));
        WebElement div3 =drv.findElement(By.cssSelector(".container"));

        WebElement div4 =drv.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement div5= drv.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));

        WebElement div6=drv.findElement(By.className("login_login__3EHKB"));
        WebElement div7= drv.findElement(By.cssSelector(".login_login__3EHKB"));

        WebElement a2 = drv.findElement(By.className("active"));
        WebElement a3 = drv.findElement(By.cssSelector(".active"));

        //by id

        WebElement div8 =drv.findElement(By.id("root"));
        WebElement div9 =drv.findElement(By.cssSelector("#root"));

        //by attribute

        WebElement input2 = drv.findElement(By.cssSelector("input[placeholder='Email']"));
        WebElement input3 = drv.findElement(By.cssSelector("[placeholder^='Pas']")); //Password

        WebElement button2 =drv.findElement(By.cssSelector("[name$='gin']")); //login
        WebElement button3 =drv.findElement(By.cssSelector("[name*='istr']")); //registration

        //xpath

        WebElement a4 =drv.findElement(By.xpath("//a[@href='/home']")); // "/home"
        WebElement a5 =drv.findElement(By.xpath("//*[starts-with(@href,'/ab')]")); // "/about"
        WebElement a6 =drv.findElement(By.xpath("//*[contains(@href,'og')]")); // "/login"

        WebElement h1_2 =drv.findElement(By.xpath("//*[text()='PHONEBOOK']"));

        WebElement body3=drv.findElement(By.xpath("//body"));

        WebElement div10=drv.findElement(By.xpath("//div[@class='container']"));

        WebElement div11=drv.findElement(By.xpath("//div[@id='root']"));





    }
}
