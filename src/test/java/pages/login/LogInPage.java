package pages.login;

import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;


public class LogInPage extends BasePage {
    @FindBy(name = "username")
    WebElement emailInput;
    @FindBy(id = "password")
    WebElement passwordInput;
    @FindBy(id = "login_form")
    WebElement LogInForm;



    public LogInPage(WebDriver driver) {
        super(driver);
    }

    public LogInPage openPage() {
        driver.get("https://seniorlink--staging.lightning.force.com/lightning/r/0064F000006lAKhQAM/related/Home_Assessments__r/view?ws=%2Flightning%2Fr%2FOpportunity%2F0064F000006lAKhQAM%2Fview");
        isPageLoaded(By.id("login_form"));
        PageFactory.initElements(driver, LogInPage.this);
        return this;
    }

    public LogInPage logIn(User user) {
        emailInput.sendKeys(user.getEmail());
        passwordInput.sendKeys(user.getPassword());
        LogInForm.submit();
        return this;
    }

}
