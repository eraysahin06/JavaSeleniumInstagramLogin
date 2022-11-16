package sampleapp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Eray Şahin\\Desktop\\JAVA SELENIUM\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.instagram.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        driver.findElement(By.name("username")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.name("username")).sendKeys("eeerrraaayyysssaaahhhiiinnn");
        driver.findElement(By.name("password")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.name("password")).sendKeys("test1234");
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button/div")).click();

    }
}
