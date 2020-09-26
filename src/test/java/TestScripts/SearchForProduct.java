package TestScripts;

import Configuration.RetrieveProperties;
import General.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public  class SearchForProduct extends BaseClass {

  //  public WebDriver driver=driver= RetrieveProperties.driver;

    @FindBy(xpath = "//input[@type=\"search\"]")
  public WebElement searchText;

  public SearchForProduct() {
      WebDriver driver=RetrieveProperties.driver;
        PageFactory.initElements(driver, this);
    }

    @Test
    public  void searchForDesiredProduct() {
        searchText.click();
        searchText.sendKeys("Mobiles");
    }
}
