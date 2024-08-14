import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class assi {
    public static void main(String[] args) {
        
     
        WebDriver driver = new ChromeDriver();

        try {
        
            driver.get("file:///D:/6645/index.html");

         
            WebElement button = driver.findElement(By.tagName("button"));
            button.click();

            
            driver.switchTo().alert().accept();

            System.out.println("Test passed!");

        } catch (Exception e) {
           
            System.out.println("Test failed!");
        } 
    }
}
