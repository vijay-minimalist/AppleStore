package com.app.stepDefinition;

import com.app.manager.PageManager;
import com.app.utils.BaseUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ProductFinderStepDefinition extends BaseUtils {
    static PageManager page;

    @Given("User click on the {string}")
    public void userClickOnThe(String Product) throws InterruptedException {
        page = new PageManager();
        String url = "https://www.apple.com/in/"+Product+"/";
        driver.navigate().to(url);

    }

    @When("User enters valid {string}")
    public void userEntersValid(String Model) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//body/nav/div/ul/li/a/span[contains(text(),'"+Model+"')]")).click();
    }

    @Then("User click on Buy button to add the product to cart")
    public void userClickOnBuyButtonToAddTheProductToCart() throws InterruptedException {
        page = new PageManager();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"ac-localnav\"]/div/div[2]/div[2]/div[2]/div[2]/a")).click();

        if(driver.getCurrentUrl().equals("https://www.apple.com/in/shop/buy-mac/macbook-air")){

            driver.findElement(By.xpath("//*[@id=\"configuration-form\"]/div/span/button")).click();
            page.getMacPage().getAddToBag().get(0).click();
        }
        else if(driver.getCurrentUrl().equals("https://www.apple.com/in/shop/buy-ipad/ipad-pro")){
            driver.findElement(By.xpath("//body/div[@id='page']/div[5]/div[4]/div[2]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/fieldset[1]/div[2]/div[1]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div[2]/div[2]/div[2]/div[2]/div/div/fieldset[1]/div/div[1]/label")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//body[1]/div[2]/div[5]/div[4]/div[2]/div[3]/div[2]/div[2]/div[3]/div[2]/div[1]/div[1]/fieldset[1]/div[2]/div[1]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//body[1]/div[2]/div[5]/div[4]/div[2]/div[3]/div[2]/div[2]/div[4]/div[2]/div[1]/div[1]/fieldset[1]/div[2]/div[1]/label")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div[2]/div[3]/div/div/div/div[1]/div/fieldset/div/div[2]/label[1]/span/span")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div[2]/div[8]/div[1]/div/div[4]/div[2]/form/div/span/button")).click();
        }

    }
}
