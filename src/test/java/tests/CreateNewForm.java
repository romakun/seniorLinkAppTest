package tests;

import models.User;
import org.testng.annotations.Test;
import pages.HomeIntegratedAssessmentPage;
import pages.NewHomeIntegratedAssessmentPage;
import pages.login.LogInPage;
import tests.BaseTest;

public class CreateNewForm extends BaseTest {

    @Test
    public void LogIn(){

        User validUser = new User("aqa1@mailinator.com", System.getProperty("password"));

        new LogInPage(driver)
                .openPage()
                .logIn(validUser);
        new HomeIntegratedAssessmentPage(driver)
                .openPage()
                .clickNewButton()
                .clickRadio()
                .clickNext()
                .duplicateClickYes();
        new NewHomeIntegratedAssessmentPage(driver)
                .openPage()
                .completeForm()
                .save();
    }
}
