import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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
    public void tableTest(){
        //Canada
        WebElement canada = wd.findElement(By.cssSelector("tr:nth-child(3) td:last-child"));
        Assert.assertEquals(canada.getText(),"Canada");

    }

    @Test
    public void cssLocators() {
        WebElement button = wd.findElement(By.tagName("button"));

        WebElement button2 = wd.findElement(By.cssSelector("button"));
        WebElement a = wd.findElement(By.tagName("a"));
        List<WebElement> listA = wd.findElements(By.tagName("a"));

        WebElement form = wd.findElement(By.tagName("form"));

        //by class

        WebElement div = wd.findElement(By.className("container"));
        WebElement div1 = wd.findElement(By.cssSelector(".container"));

        List<WebElement> a_List = wd.findElements(By.className("nav-item"));
        List<WebElement> a_List1 = wd.findElements(By.cssSelector(".nav-item"));

        //by id

        WebElement nav = wd.findElement(By.id("nav"));
        WebElement nav1 = wd.findElement(By.cssSelector("#nav"));

        WebElement form2 = wd.findElement(By.id("form1"));
        WebElement form3 = wd.findElement(By.cssSelector("#form1"));

        //by attribute

        WebElement inputEmail = wd.findElement(By.cssSelector("[placeholder='Type your name']"));
        //start
        WebElement inputEmail2=wd.findElement(By.cssSelector("[placeholder^='Type']"));
        //end
        WebElement inputEmail3=wd.findElement(By.cssSelector("[placeholder$='name']"));


        WebElement a2= wd.findElement(By.cssSelector("[href='#item3']"));

        //by name

        WebElement inputS=wd.findElement(By.cssSelector("[name='surename']"));
        WebElement inputS1=wd.findElement(By.name("surename"));


    }
}
