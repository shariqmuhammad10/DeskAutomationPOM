import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import factory.PlaywrightFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.ArticlePage;
import pages.HomePage;
import pages.LoginPage;
import pages.AddPagePage;

import java.io.FileNotFoundException;
import java.util.Properties;

public class BaseTest {

    PlaywrightFactory pf;
    Page page;
    Properties prop;
    protected LoginPage loginPage;
    protected HomePage homePage;
    protected ArticlePage articlePage;
    protected AddPagePage addPagePage;
    BrowserContext context;


    @BeforeClass
    public void setup() throws FileNotFoundException {
        pf = new PlaywrightFactory();
        context = pf.getBrowserContext();
        prop = pf.init_prop();
        page = pf.initBrowser(prop);
       // loginTest.appLoginTest();
        //page = pf.appLogin(Properties prop);
        //page = pf.appLogin("sysadmin","sysadmin");
        page = pf.appLogin(prop.getProperty("userName"),prop.getProperty("passWord"));
        loginPage = new LoginPage(page);
        homePage = loginPage.sharePage();
        //articlePage = homePage.navigateToCreateArticlePage();
    }

        //loginPage.doLogin(prop.getProperty("userName").trim(),
                //prop.getProperty("passWord").trim());

    @AfterClass
    public void tearDown(){
        page.context().browser().close();

    }
}
