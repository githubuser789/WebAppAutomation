package Configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.util.Properties;


public class RetrieveProperties
{
    static Properties properties=new Properties();
    public static WebDriver driver;
    static String ChromeLocation;
    static String AppPath;

    public static void retrieveProperties()
    {
        try {
            FileInputStream inputs=new FileInputStream("src\\\\test\\\\java\\\\resources\\\\Properties\\configprops.properties");
            properties.load(inputs);
            ChromeLocation= properties.getProperty("ChromePath");
            AppPath=properties.getProperty("AppURL");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static WebDriver upAndRunApplication()
    {
        System.setProperty("webdriver.chrome.driver", ChromeLocation);

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get(AppPath);
        return  driver;

    }

    public void quitApp()
    {
        driver.close();
    }

}
