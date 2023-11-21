package factory;

import com.microsoft.playwright.*;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.Properties;

public class PlaywrightFactory {
    Playwright playwright;
    Browser browser;
    BrowserContext browserContext;
    Page page;
    Properties prop;

    private String userName = "#usernameInput";
    private String passWord = "#passwordInput";
    private String loginButton = ".btn.btn-primary";

    private String dmDeskIcon = ".dam-home-icon.hidden-sm.hidden-xs";


    public Page initBrowser(Properties prop) {
        String browserName = prop.getProperty("browser").trim();
        System.out.println("Browser name is :  " + browserName);

        playwright = Playwright.create();

        switch (browserName.toLowerCase()) {
            case "chromium":
                browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
                browser.newContext(new Browser.NewContextOptions().setStorageStatePath(Paths.get("applogin.json")));
                break;

            case "firefox":
                browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
                browser.newContext(new Browser.NewContextOptions().setStorageStatePath(Paths.get("applogin.json")));
                break;

            case "safari":
                browser = playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
                browser.newContext(new Browser.NewContextOptions().setStorageStatePath(Paths.get("applogin.json")));
                break;

            case "chrome":
                browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
                browser.newContext(new Browser.NewContextOptions().setStorageStatePath(Paths.get("applogin.json")));
                break;

            default:
                System.out.println("Please pass the correct browser name ....");
                break;
        }

        browserContext = browser.newContext();
        page = browserContext.newPage();
        page.navigate(prop.getProperty("url").trim());
        return page;

    }
        public Properties init_prop() {
            try {
               // FileInputStream ip = new FileInputStream("./src/config/config.properties");
                InputStream inputStream = getClass().getClassLoader().getResourceAsStream("config/config.properties");
                prop = new Properties();
                prop.load(inputStream);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
                return prop;
        }

    public Page appLogin(String appUserName, String appPassWord) {
        page.fill(userName, appUserName);
        page.fill(passWord, appPassWord);
        page.click(loginButton);
       // if (page.isVisible(dmDeskIcon)) {        //return new HomePage(page);
            System.out.println("User is successfully login .....");
            return page;
        }

    }


