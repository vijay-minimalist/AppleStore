package com.app.manager;

import com.app.pages.Homepage;
import com.app.pages.LoginPage;

public class PageManager {
    private Homepage homepage;
    private LoginPage loginPage;

    public Homepage getHomepage() {
        return (homepage == null) ? new Homepage() : homepage;
    }
    public LoginPage getLoginPage(){
        return (loginPage == null) ? new LoginPage() : loginPage;
    }

}


