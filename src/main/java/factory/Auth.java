package factory;

import com.microsoft.playwright.*;

import java.nio.file.Paths;

public class Auth {
    public static void main(String [] args){

        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext browserContext= browser.newContext();

        Page page = browserContext.newPage();
        page.navigate("http://10.70.172.129/desk/#/");
        page.fill("#usernameInput", "sysadmin");
        page.fill("#passwordInput", "sysadmin");
        page.click(".btn.btn-primary");

        page.click(".dropdown-toggle.ng-binding");
        page.click("a[x-ng-click='logout()']");



        browserContext.storageState(new BrowserContext.StorageStateOptions().setPath(Paths.get("appLogin.json")));

        playwright.close();
    }
}
