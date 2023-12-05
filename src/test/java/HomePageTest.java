import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import io.qameta.allure.testng.TestInstanceParameter;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.ArticlePage;
import pages.HomePage;

import java.util.PriorityQueue;

public class HomePageTest extends BaseTest {


    @Test
    public void verifyDmDeskIconIsVisible() {
//loginPage.doLogin()
        homePage = loginPage.sharePage();
        homePage.checkDmDeskIconIsVisible();
    }

    @DataProvider
    public Object[][] getSearchData() {
        return new Object[][]{
                {"automation article"}
                //{"Demo session"},
                //{"9.8.23 Stewart article 3"}

        };

    }

//    @BeforeTest
//    public void before() {
//
//    }

    @Test(dataProvider = "getSearchData")
    public void generalSearch(String articleName) {
        String actualSearchData = homePage.genericSearch(articleName);
        Assert.assertEquals(actualSearchData, articleName);
    }


    @Test(priority = 2)
    public void createArticle() {
        homePage = loginPage.sharePage();
        articlePage = homePage.createNewArticle();

    }

    @Test(priority = 3)
    public void fullScreenOption() {
        //homePage = loginPage.sharePage();
        homePage.clickFullScreenOption();

    }

    @Test(priority = 4)
    public void checkFacetsVisibility() {
        //homePage = loginPage.sharePage();
        homePage.facetsAvailable();
        //Assert.assertTrue(true);
        // return true;
    }

    @Test(priority = 5)
    public void checkFoldersMenuVisibility() {
        //homePage = loginPage.sharePage();
        homePage.foldersMenuAvilable();
    }


    @Test(priority = 6)
    public void checkPseriesMenuVisibility() {
        //homePage = loginPage.sharePage();
        homePage.pseriesMenuAvilable();
    }


    @Test(priority = 7)
    public void checkQuriesMenuVisibility() {
        homePage = loginPage.sharePage();
        homePage.quriesMenuAvilable();
    }

    @Test(priority = 8)
    public void checkSchedulingMenuVisibility() {
        homePage = loginPage.sharePage();
        homePage.schedulingMenuAvailable();
    }

    @Test(priority = 9)
    public void clickRefreshBtn() {
        //homePage = loginPage.sharePage();
        homePage.searchRefresh();
    }

    @Test(priority = 10)
    public void appLogout() {
        //homePage = loginPage.sharePage();
        homePage.logoutFromSite();
    }

    @Test
    public void searchArticleWithAdvanceSearch(){
        homePage.searchArticleUsingAdvanceSearch();

    }


}
