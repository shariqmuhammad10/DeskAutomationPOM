package pages;


import com.microsoft.playwright.Page;

import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class ArticlePage  {

    Properties prop;
    private Page page;

    public Page getPage() {
        return page;
    }

    public ArticlePage(Page page)
    {
        this.page = page;
    }


    //private String nameOfTheArticlePlaceholderText =  "input[id*=form-control-widget]";
    private String nameOfArticleusingPH = "Name of article goes here...";
    private String placeHolderArticleName = "Name of article goes here...";

    private String saveButton = ".btn.btn-default.btn-sm.pull-left.ng-binding[x-ng-disabled='article.dirty || !activeBack.isEnabled() || !article.local.valid || showSpinner']";
    private String nameOfArticlebyID = "#form-control-widget-18D58";
    private String headerDetials = "//iframe[@title='Rich Text Editor, editor2']";

    private String maximizePreview = "button[title='Maximise Preview']";

    private String integratedSearch = ".crossSearchPopover.form-control.ng-pristine.ng-valid.ng-touched";
    private  String headLineIframe = "//iframe[@title='Rich Text Editor, editor2']";

    private String subHeadingIframe = "//iframe[@title='Rich Text Editor, editor3']";

    private String bodyIframe = "//iframe[@title='Rich Text Editor, editor4']";

    private String goToMediaTab ="li[class='tab-pill ng-scope active'] a[class='ng-binding']";

    private String addImage = "(//input[@type='file'])[1]";

    private String headlineDiv = "#cke_5_contents";

    private String header;
    //private String integratedSearch = "input[placeholder='Search']";


    public ArticlePage shareArticlePage(){

        return new ArticlePage(page);
    }

public void createArticle(){
        //page.shareArticlePage();
        //page.click(placeHolderArticleName);he...","Automation Article");
    //page.getByPlaceholder(nameOfArticleusingPH).fill("Automation Article 27-12-2023");
    currentDateGenerator();
    page.waitForSelector(headLineIframe);
    page.frameLocator(headLineIframe).locator("html")
            .locator("body")
            .type("Latest Technologies in Computer Science- ");

    page.frameLocator(subHeadingIframe).locator("html")
            .locator("body")
            .type("Edge Computing- ");

    page.frameLocator(bodyIframe).locator("html")
            .locator("body")
            .type("In contrast to cloud computing, which processes and stores data in massive data centres far away from the end user, edge computing keeps computer data close to the user. " +
                    "Experts predict that the cloud will not totally disappear, but rather will coexist with edge computing as it puts processing closer to consumers, " +
                    "speeding everything from factory output to self-driving car reaction."+
                    "Edge computing is used in technologies such as autonomous vehicles, video conferencing, and augmented reality. " +
                    "Edge computing, for example, reduces the delay of waiting for a server in the cloud to respond when an autonomous car makes a split-second choice to brake and avoid a collision."+
           " Software engineers, " +"especially edge computing software developers, are expected to expand by 22% between 2019 and 2029, according to the BLS, with a median annual pay of $110,140 in 2020."+
    "Workers with edge computing skills are employed in industries such as telecommunications, security, and oil and gas. " +
                    "A bachelor’s degree is frequently required for entry-level employment such as software developer or computer network architect. " +
                    "A master’s degree is commonly required for managerial, administrative, and research employment.");






            //page.click(goToMediaTab);
            //page.setInputFiles(addImage, Paths.get("C:/Atex_Backups/gettyimages"));  //UNABEL TO UPLOAD FILE
            page.click(saveButton);
            //page.fill(placeHolderArticleName,"Automation article name");


        //page.click(maximizePreview);
        //page.click(headerDetials);
        //page.frameLocator(headerDetials);
        //page.fill(nameOfTheArticle,"Auto test");


        //page.click(integratedSearch);
        //page.fill(integratedSearch,"image");
        //page.fill(headerDetials,"This is header details created using the automation script");
        //page.getByPlaceholder(nameOfTheArticlePlaceholderText).fill("Automation Article ");


}

    public void addImagetoArticle(){
        page.setInputFiles(addImage, Paths.get("D:\\ATEX\\AUTOMATION\\Desk_Playwright\\DeskAutomationPOM\\uploadImage"));
    }

    public void currentDateGenerator(){

        SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDateTime = dateTimeFormat.format(new Date());
        String articleNameWithCurrentDate = "Automation Article " + currentDateTime;
        page.getByPlaceholder(nameOfArticleusingPH).fill(articleNameWithCurrentDate);
    }
}
