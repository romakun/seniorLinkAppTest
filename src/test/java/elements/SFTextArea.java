package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SFTextArea {

    String textAreaLocator = "//div[@class='windowViewMode-maximized active lafPageHost']//span[text()='%s']/../..//textarea";

    public void write(WebDriver driver, String label, String text){
        By textAreaByLocator = By.xpath(String.format(textAreaLocator, label));
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(textAreaByLocator));
        driver.findElement(textAreaByLocator).sendKeys(text);
    }
}
