package com.app.pages;

import com.app.utils.BaseUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Homepage extends BaseUtils {
    public  Homepage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//body/nav[@id='ac-globalnav']/div[1]/ul[2]/li[10]/div[1]/a[1]")
    private List<WebElement> bag;

    @FindBy(linkText = "Sign in")
    private List<WebElement> signIn;

    public List<WebElement> getBag() {
        return bag;
    }

    public List<WebElement> getSignIn() {
        return signIn;
    }
}
