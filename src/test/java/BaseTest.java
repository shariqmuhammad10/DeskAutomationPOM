import com.beust.ah.A;
import com.microsoft.playwright.Page;
import factory.PlaywrightFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.ArticlePage;
import pages.HomePage;
import pages.LoginPage;

import java.io.FileNotFoundException;
import java.util.Properties;

public class BaseTest {

    PlaywrightFactory pf;
    Page page;
    Properties prop;
    protected LoginPage loginPage;
    protected HomePage homePage;
    protected ArticlePage articlePage;



    @BeforeTest
    public void setup() throws FileNotFoundException {
        pf = new PlaywrightFactory();
        prop = pf.init_prop();
        page = pf.initBrowser(prop);
        //loginTest.appLoginTest();
        //page = pf.appLogin(Properties prop);
        //page = pf.appLogin("sysadmin","sysadmin");
        loginPage = new LoginPage(page);


        }



        //loginPage.doLogin(prop.getProperty("userName").trim(),
                //prop.getProperty("passWord").trim());




    @AfterTest
    public void tearDown(){
        page.context().browser().close();

    }
}
