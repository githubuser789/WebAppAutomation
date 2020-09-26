package General;

import Configuration.RetrieveProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass extends RetrieveProperties
{


   @BeforeTest
   public void setupApplication() {
       retrieveProperties();
       upAndRunApplication();

   }
   @AfterTest
   public void closeDriver() {
       quitApp();
   }
    }

