package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtilities {

    public void scrollToTop(WebDriver driver) {
        ((JavascriptExecutor) driver).executeScript("scroll(250, 0);");
    }

    public void scrollDown(WebDriver driver) {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 4000)");
    }

    public void scrollToElement(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void clickJs(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    public void setValue(WebDriver driver, WebElement element, String value) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', '" + value +"')", element);
    }

    public void scroll(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollTop = arguments[0].scrollHeight/8", element);

    }
}