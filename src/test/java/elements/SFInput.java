package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SFInput {

    String inputLocator = "//div[@class='windowViewMode-maximized active lafPageHost']//span[text()='%s']/../..//input";

    public void write(WebDriver driver, String label, String text){
        By inputByLocator = By.xpath(String.format(inputLocator, label));
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inputByLocator));
        driver.findElement(inputByLocator).sendKeys(text);
    }
}
