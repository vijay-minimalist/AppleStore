package com.app.pages;

import com.app.utils.BaseUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Mac extends BaseUtils {
    public Mac(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//body/div[@id='page']/div[9]/div[2]/bundle-selection[1]/store-provider[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/bundle-selector[1]/div[3]/div[1]/div[1]/div[4]/form[1]/div[1]/span[1]/button[1]")
    private List<WebElement> appleM1256;

    @FindBy(xpath = "//body/div[@id='page']/div[9]/div[1]/form[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/button[1]")
    private List<WebElement> AddToBag;

    public List<WebElement> getAppleM1256() {
        return appleM1256;
    }

    public List<WebElement> getAddToBag() {
        return AddToBag;
    }
}
