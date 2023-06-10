package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
       // for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
        //    System.out.println("i = " + i);
     //   }
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
        Thread.sleep(100);

        WebElement Category = driver.findElement(By.xpath("//*[@id=\'cat\']"));
        WebElement Phones = driver.findElement(By.xpath("//*[@id=\'itemc\']"));
        WebElement laptops = driver.findElement(By.xpath("//*[@id=\'itemc\']"));
        WebElement Monitors = driver.findElement(By.xpath("//*[@id=\'itemc\']"));
        WebElement Home = driver.findElement(By.xpath("//*[@id=\'navbarExample\']/ul/li[1]/a"));
        WebElement Contact = driver.findElement(By.xpath("//*[@id=\'navbarExample\']/ul/li[2]/a"));
        WebElement Aboutus = driver.findElement(By.xpath("//*[@id='navbarExample']/ul/li[3]/a"));
        WebElement Cart = driver.findElement(By.xpath("//*[@id=\'cartur\']"));
        WebElement Login = driver.findElement(By.xpath("//*[@id=\'login2\']"));
        WebElement Signup = driver.findElement(By.xpath("//*[@id=\'signin2\']"));
        WebElement Left = driver.findElement(By.xpath("//*[@id=\'carouselExampleIndicators\']/a[1]/span[1]"));
        WebElement Right = driver.findElement(By.xpath("//*[@id=\'carouselExampleIndicators\']/a[2]/span[1]"));
        //WebElement Nokialumia = driver.findElement(By.xpath("//*[@id=\'tbodyid\']/div[2]/div/a/img"));
        //WebElement Samsunggalaxy = driver.findElement(By.xpath("//*[@id='tbodyid']/div[4]/div/div/h4/a"));
        System.out.println(Phones.getText());
        System.out.println(laptops.getText());
        System.out.println(Monitors.getText());
        System.out.println(Home.getText());
        System.out.println(Contact.getText());
        System.out.println(Aboutus.getText());
        System.out.println(Cart.getText());
        System.out.println(Login.getText());
        System.out.println(Signup.getText());
        System.out.println(Left.getText());
        System.out.println(Right.getText());
        //System.out.println(Nokialumia.getText());
        //System.out.println(Samsunggalaxy.getText());

        Home.click();




    }
}