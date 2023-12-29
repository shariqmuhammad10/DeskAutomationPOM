import org.testng.annotations.Test;

public class PageTest extends BaseTest {

    @Test
    public void createNewPage() {
        addPagePage = homePage.navigatetocreateNewPage();
    }
}