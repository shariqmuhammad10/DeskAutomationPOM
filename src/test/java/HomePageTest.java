import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

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
                {"automation article"},
                {"Shariq"},
                {"Slots"}

        };

    }



    @Test(dataProvider = "getSearchData")
    public void generalSearch(String articleName)  {
        String actualSearchData = homePage.genericSearch(articleName);
        Assert.assertEquals(actualSearchData, articleName);
    }


    @Test(priority = 2)
    public void createArticle() {
        homePage = loginPage.sharePage();
        //articlePage = homePage.createNewArticle();
        homePage.createNewArticle();
    }

    @Test(priority = 3)
    public void fullScreenOption() {
        //homePage = loginPage.sharePage();
        homePage.clickFullScreenOption();

    }

    @Test(priority = 4)
    public void checkFacetsVisibility() {
        //homePage = loginPage.sharePage();
        String actualFacetMenu = homePage.facetsAvailable();
        Assert.assertEquals(actualFacetMenu,"Facets");
        // return true;
    }

    @Test(priority = 5)
    public void checkFoldersMenuVisibility() {
        //homePage = loginPage.sharePage();
        String actualFolderMenuText = homePage.foldersMenuAvailable();
        Assert.assertEquals(actualFolderMenuText,"Folders");
    }


    @Test(priority = 6)
    public void checkPseriesMenuVisibility() {
        //homePage = loginPage.sharePage();
        String actualPSeriesMenuText = homePage.pseriesMenuAvailable();
        Assert.assertEquals(actualPSeriesMenuText,"P-Series");
    }


    @Test(priority = 7)
    public void checkQuriesMenuVisibility() {
        //homePage = loginPage.sharePage();
        String actualQuriesMenuText = homePage.quriesMenuAvailable();
        Assert.assertEquals(actualQuriesMenuText,"Queries");
    }

    @Test(priority = 8)
    public void checkSchedulingMenuVisibility() {
        //homePage = loginPage.sharePage();
        String actualSchedulingMenuText = homePage.schedulingMenuAvailable();
        Assert.assertEquals(actualSchedulingMenuText,"Scheduling");
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
     String actualMoreResultsButtonText  =  homePage.searchArticleUsingAdvanceSearch();
        Assert.assertEquals(actualMoreResultsButtonText, "More Results ");

    }

    @Test
    public void createNewSimpleFolder(){
       String createdFolderName =  homePage.createNewFolder();
        Assert.assertEquals(createdFolderName,"AutoSF ");


    }


    @Test

    public void deleteSimpleFolder(){
        homePage.deleteNewlyCreatedFolder();

    }
}
