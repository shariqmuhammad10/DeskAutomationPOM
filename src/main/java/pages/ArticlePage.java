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
            .type("This is new headline for testing ");

    page.frameLocator(subHeadingIframe).locator("html")
            .locator("body")
            .type("This is subheading ");

    page.frameLocator(bodyIframe).locator("html")
            .locator("body")
            .type("This is the text provided for the testing purpose , we need to fill up the data" +
                    " and we are going to type the new details of the article. ");


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
