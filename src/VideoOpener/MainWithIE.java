package VideoOpener;

import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.WebDriver;

import java.util.Random;
import java.util.concurrent.TimeUnit;

class Main {


    public static void main(String[] args) {

        System.setProperty("webdriver.ie.driver", "C:\\Users\\37126\\Desktop\\RandomVideoOpener.WithSeleneum\\Selenium JARs+drivers\\Drivers\\IEDriverServer.exe");

        WebDriver driver = new InternetExplorerDriver();
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
        /// Play not working, will try later
        //driver.findElement(By.className("play-icon")).click();
        //driver.findElement(By.className("fullscreen-icon")).click();

    }
}
