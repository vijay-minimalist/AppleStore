package com.app.manager;

import com.app.pages.Homepage;
import com.app.pages.LoginPage;
import com.app.pages.Mac;

public class PageManager {
    private Homepage homepage;
    private LoginPage loginPage;
    private Mac mac;

    public Homepage getHomepage() {
        return (homepage == null) ? new Homepage() : homepage;
    }
    public LoginPage getLoginPage(){
        return (loginPage == null) ? new LoginPage() : loginPage;
    }
    public Mac getMacPage() { return (mac == null) ? new Mac() : mac; }
}


