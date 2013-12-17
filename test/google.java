import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class google {
    public static void main(String[] args) throws InterruptedException{
    WebDriver driver=new FirefoxDriver();
    WebElement element;
    driver.get("http://www.google.com");
    driver.manage().window().maximize();
    element=driver.findElement(By.xpath("//input[@id='gbqfq']"));
    element.sendKeys("Hello");
    element.submit();
    Thread.sleep(1000);
        driver.quit();
}
}
