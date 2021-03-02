package VideoOpener;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {


    public static void main(String[] args) {
	// write your code here

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\37126\\Desktop\\RandomVideoOpener.WithSeleneum\\Selenium JARs+drivers\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        Random rand = new Random();
        int number = rand.nextInt(50);

        if (number <= 10) {
            driver.navigate().to("https://vimeo.com/198772739");
        } else if (number <=20) {
            driver.navigate().to("https://vimeo.com/404924224");
        } else if (number <=30){
            driver.navigate().to("https://vimeo.com/406168555");
        } else if (number <=40){
            driver.navigate().to("https://vimeo.com/195245845");
        } else {
            driver.navigate().to("https://vimeo.com/195890763");
        }

        driver.manage().window().maximize();
        driver.findElement(By.className("play-icon")).click();
        driver.findElement(By.className("fullscreen")).click();

    }
}
