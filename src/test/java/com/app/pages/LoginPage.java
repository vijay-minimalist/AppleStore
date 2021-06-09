package com.app.pages;

import com.app.utils.BaseUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage extends BaseUtils {
    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='signIn.customerLogin.appleId']")
    private List<WebElement> username;

    @FindBy(xpath = "//input[@id='signIn.customerLogin.password']")
    private List<WebElement> password;

    @FindBy(xpath = "//button[@id='signin-submit-button']")
    private List<WebElement> signInButton;

    public List<WebElement> getUsername() {
        return username;
    }

    public List<WebElement> getPassword() {
        return password;
    }

    public List<WebElement> getSignInButton() {
        return signInButton;
    }
}
