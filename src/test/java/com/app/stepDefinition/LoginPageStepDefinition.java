package com.app.stepDefinition;

import com.app.manager.PageManager;
import com.app.utils.BaseUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

public class LoginPageStepDefinition extends BaseUtils {
    static PageManager page;

    @Given("User launches valid URL")
    public void userLaunchesValidURL() throws InterruptedException {
        page = new PageManager();
        initializer();
        driver.get("https://www.apple.com/in/");
        driver.manage().window().maximize();
        page.getHomepage().getBag().get(0).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        page.getHomepage().getSignIn().get(0).click();
    }

    @When("User enters valid {string} and {string}")
    public void whenUserEnterValidURL(String username, String password){
        page = new PageManager();
        page.getLoginPage().getUsername().get(0).sendKeys(username);
        page.getLoginPage().getPassword().get(0).sendKeys(password);
        page.getLoginPage().getSignInButton().get(0).click();
    }

    @Then("user should be able to navigate to the homepage")
    public void userLaunchesHomepage() throws InterruptedException {
        Thread.sleep(2000);
        //driver.quit();
    }


}
