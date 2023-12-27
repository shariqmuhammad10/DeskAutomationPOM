package pages;

import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Page;

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

    private String header;


    public ArticlePage shareArticlePage(){

        return new ArticlePage(page);
    }

public void createArticle(){
        //page.shareArticlePage();
        //page.click(placeHolderArticleName);
        //page.getByPlaceholder("Name of Article goes here...","Automation Article");
            page.getByPlaceholder(nameOfArticleusingPH).fill("Automation Article 27-12-2023");


    //String editorSelector = "your-selector-for-the-rich-text-editor";
    String editor = page.frameLocator(headLineIframe).locator("p").textContent();
    page.fill("p","Test values");
    System.out.println(header);
    //page.fill(headLineIframe,"This is test data for the editor");




    //page.fill(headLineIframe,"data need to insert");
            //page.fill(headerDetials,"This is a testing article and Only filled for the testing purpose.");
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


}
