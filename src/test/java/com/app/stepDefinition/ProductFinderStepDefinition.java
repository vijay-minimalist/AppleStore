package com.app.stepDefinition;

import com.app.manager.PageManager;
import com.app.utils.BaseUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductFinderStepDefinition extends BaseUtils {
    static PageManager page;

    @Given("User click on the {string}")
    public void userClickOnThe(String Product) throws InterruptedException {
        page = new PageManager();
        initializer();
        driver.get("https://www.apple.com/in/");
        driver.manage().window().maximize();
        String url = "https://www.apple.com/in/"+Product+"/";
        driver.navigate().to(url);

    }

    @When("User enters valid {string}")
    public void userEntersValid(String Model) {
        driver.findElement(By.xpath("//body/nav/div/ul/li/a/span[contains(text(),'"+Model+"')]")).click();
    }

    @Then("User click on Buy button to add the product to cart")
    public void userClickOnBuyButtonToAddTheProductToCart() {
        page = new PageManager();
        driver.findElement(By.xpath("//*[@id=\"ac-localnav\"]/div/div[2]/div[2]/div[2]/div[2]/a")).click();
        if(driver.getCurrentUrl().equals("https://www.apple.com/in/shop/buy-mac/macbook-air")){

            driver.findElement(By.xpath("//*[@id=\"configuration-form\"]/div/span/button")).click();
            page.getMacPage().getAddToBag().get(0).click();
        }
        else if(driver.getCurrentUrl().equals("https://www.apple.com/in/shop/buy-ipad/ipad-pro")){
            driver.findElement(By.xpath("//body/div[@id='page']/div[5]/div[4]/div[2]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]")).click();
            driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div[2]/div[2]/div[2]/div[2]/div/div/fieldset/div/div[1]/label")).click();
            driver.findElement(By.xpath("//*[@id=\"1668ac70-d35d-11eb-a94f-29d9709535ea_label\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"1668fa90-d35d-11eb-a94f-29d9709535ea_label\"]]")).click();
            driver.findElement(By.xpath("//*[@id=\"1661f5b0-d35d-11eb-a94f-29d9709535ea\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div[2]/div[8]/div[1]/div/div[4]/div[2]/form/div/span/button")).click();
        }

    }
}
