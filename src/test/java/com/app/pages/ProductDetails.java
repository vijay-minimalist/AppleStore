package com.app.pages;

import com.app.utils.BaseUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductDetails extends BaseUtils {
    public ProductDetails(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"ac-localnav\"]/div/div[2]/div[2]/div[2]/div[2]/a")
    private List<WebElement> buyProduct;

    @FindBy(xpath = "//body/div[@id='page']/div[9]/div[1]/form[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/button[1]")
    private List<WebElement> AddToBag;

    public List<WebElement> BuyProduct() {
        return buyProduct;
    }

    public List<WebElement> getAddToBag() {
        return AddToBag;
    }
}
