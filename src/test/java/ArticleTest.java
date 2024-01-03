import org.testng.annotations.Test;

public class ArticleTest extends BaseTest {

    @Test
    public void articlePageTitleTest() {

        articlePage = homePage.navigateToCreateArticlePage();
        articlePage.createArticle();
    }





}
