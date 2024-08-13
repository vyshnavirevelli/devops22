package vaishnavi;
import org.openqa.selenium.chrome.ChromeDriver;
public class selenium {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
               driver.get("C:\\Users\\srini\\eclipse-workspace\\vaishnavi\\src\\hello.html");       
            System.out.println("Test Passed!");
        }
    }