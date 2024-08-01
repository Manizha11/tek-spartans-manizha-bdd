package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.pages.HomePage;
import tek.bdd.pages.SignInPage;
import tek.bdd.utility.SeleniumUtility;

public class SecurityTestSteps extends SeleniumUtility {

    @When("user click on sign in link")
    public void user_click_on_sign_in_link() {
        clickOnElement(HomePage.SIGN_IN_LINK);
    }
    @Then("validate user is in sign in page")
    public void validate_user_is_in_sign_in_page() {
      String pageSubTitle = getElementText(SignInPage.PAGE_SUBTITLE);
        Assert.assertEquals("Sign in", pageSubTitle);
    }
    @When("user enter username and password and click on login")
    public void user_enter_username_and_password_and_click_on_login() {
        CharSequence value;
        sendText(SignInPage.EMAIL_INPUT, "mia@gmail.com");

        sendText(SignInPage.PASSWORD_INPUT, "Manizha123$");
        clickOnElement(SignInPage.LOGIN_BUTTON);


    }

    

    @Then("user should be able to see account link")
    public void user_should_be_able_to_see_account_link() {
        boolean isAccountDisplayed = isELementDisplayed(By.id("accountLink"));
        Assert.assertTrue(isAccountDisplayed);

    }
    @When("user enter username and password and click on login")
    public void userEnterUsernameAndPasswordAndClickOnLogin() {
        sendKeys(By.id("email"), "mia@gmail.com");
        sendKeys(By.id("password"), "Manizha123$");
        clickOnElement(By.id("loginBtn"));
    }
}
