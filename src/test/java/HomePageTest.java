import io.qameta.allure.testng.TestInstanceParameter;
import org.testng.Assert;
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


    @Test (priority = 1)
    public void generalSearch(){
        homePage = loginPage.sharePage();
        String actualSearchData = homePage.genericSearch("Article");
        Assert.assertEquals(actualSearchData,"automation article");
    }



    @Test (priority = 2)
    public void createArticle(){
        homePage =loginPage.sharePage();
     articlePage = homePage.createNewArticle();

    }
    @Test (priority = 3)

       public void fullScreenOption()
    {
        homePage = loginPage.sharePage();
        homePage.clickFullScreenOption();

    }

 @Test (priority = 4)
    public void checkFacetsVisibility (){
        homePage = loginPage.sharePage();
        homePage.facetsAvailable();
        //Assert.assertTrue(true);
       // return true;
 }

@Test (priority = 5)
public void checkFoldersMenuVisibility (){
        homePage = loginPage.sharePage();
        homePage.foldersMenuAvilable();
}


    @Test (priority = 6)
    public void checkPseriesMenuVisibility (){
        homePage = loginPage.sharePage();
        homePage.pseriesMenuAvilable();
    }


    @Test (priority = 7)
    public void checkQuriesMenuVisibility (){
        homePage = loginPage.sharePage();
        homePage.quriesMenuAvilable();
    }

    @Test (priority = 8)
    public void checkSchedulingMenuVisibility (){
        homePage = loginPage.sharePage();
        homePage.schedulingMenuAvailable();
    }

    @Test (priority = 9)
    public void clickRefreshBtn (){
        homePage = loginPage.sharePage();
        homePage.searchRefresh();
    }
    @Test (priority = 10)
    public void appLogout(){
        homePage=loginPage.sharePage();
        homePage.logoutFromSite();
    }





}
