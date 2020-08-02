package General;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass
{
    public static WebDriver driver;

    
    public static void initializeBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\JamalpuC\\Downloads\\chromedriver.exe");

        driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://paytm.com/");

        driver.close();

    }
}
