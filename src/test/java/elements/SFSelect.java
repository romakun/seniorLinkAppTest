package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.JavaScriptUtilities;

public class SFSelect {
    String selectLocator = "//div[@class='windowViewMode-maximized active lafPageHost']//span/span[text()='%s']/../..//a";
    String selectOptionsLocator = "//div[contains(@class,'visible')]//a[text()='%s']";

    public void select(WebDriver driver, String label, String option){
        By selectByLocator = By.xpath(String.format(selectLocator, label));
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(selectByLocator));
        new JavaScriptUtilities().clickJs(driver, driver.findElement(selectByLocator));
        //driver.findElement(selectByLocator).click();
        By selectOptionsByLocator = By.xpath((String.format(selectOptionsLocator, option)));
        new JavaScriptUtilities().clickJs(driver, driver.findElement(selectOptionsByLocator));
        //driver.findElement(selectOptionsByLocator).click();
    }
}
