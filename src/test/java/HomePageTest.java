import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ArticlePage;
import pages.HomePage;

public class HomePageTest extends BaseTest {

    @Test
    public void verifyDmDeskIconIsVisible() {
//loginPage.doLogin()
        homePage = loginPage.sharePage();
        homePage.checkDmDeskIconIsVisible();

    }

    @Test
    public void createArticle(){
     articlePage = homePage.createNewArticle();



    }





}
