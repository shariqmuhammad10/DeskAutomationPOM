

import org.testng.Assert;
import org.testng.annotations.*;
import pages.HomePage;

public class LoginTest extends BaseTest {

    @Test
    public void appLoginTest(){
        loginPage.doLogin(prop.getProperty("userName").trim(),
                prop.getProperty("passWord").trim());

    }


    @Test
    public void loginPageTitleTest(){
      String actualTitle   = loginPage.getLoginPageTitle();
      Assert.assertEquals(actualTitle,"dm.desk");

    }

    @Test
    public void loginPageURLTest(){
        String actualURL   = loginPage.getHomePageURL();
        Assert.assertEquals(actualURL,prop.getProperty("url"));

    }
}
