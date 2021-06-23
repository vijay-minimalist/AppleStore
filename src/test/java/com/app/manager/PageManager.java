package com.app.manager;

import com.app.pages.Homepage;
import com.app.pages.LoginPage;
import com.app.pages.ProductDetails;

public class PageManager {
    private Homepage homepage;
    private LoginPage loginPage;
    private ProductDetails productDetails;

    public Homepage getHomepage() {
        return (homepage == null) ? new Homepage() : homepage;
    }
    public LoginPage getLoginPage(){
        return (loginPage == null) ? new LoginPage() : loginPage;
    }
    public ProductDetails getMacPage() { return (productDetails == null) ? new ProductDetails() : productDetails; }
}


