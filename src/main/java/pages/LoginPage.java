package pages;

import com.microsoft.playwright.Page;

import java.util.Properties;

public class LoginPage {

    Properties prop;
    private Page page;
    private String userName = "#usernameInput";
    private String passWord = "#passwordInput";
    private String loginButton =".btn.btn-primary";

    public LoginPage(Page page) {
        this.page = page;
    }

    public String getLoginPageTitle() {
        String title = page.title();
        System.out.println("Page Title : " + title);
        return page.title();
    }

    public String getHomePageURL() {
        String url = page.url();
        System.out.println("Page URL : " + url);
        return page.url();


    }

    public HomePage doLogin(String appUserName, String appPassWord) {
        //String userNameValue = prop.getProperty("username");
        //String passWordValue = prop.getProperty("password");

        page.fill(userName, appUserName );
        page.fill(passWord,appPassWord);
        page.click(loginButton);
        return new HomePage(page);


    }
}