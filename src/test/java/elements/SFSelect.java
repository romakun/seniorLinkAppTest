package elements;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SFSelect {
    String selectLocator = "//div[@class='windowViewMode-maximized active lafPageHost']//span/span[text()='%s']/../../div";
    String selectOptionsLocator = "//div[contains(@class,'visible')]/div/ul/li/a[text()='%s']";

    public void select(WebDriver driver, String label, String option){
        By selectByLocator = By.xpath(String.format(selectLocator, label));
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(selectByLocator));
        driver.findElement(selectByLocator).click();
        By selectOptionsByLocator = By.xpath((String.format(selectOptionsLocator, option)));
        driver.findElement(selectOptionsByLocator).click();
    }
}
