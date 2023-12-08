package pages;

import com.microsoft.playwright.Page;

import java.util.Properties;

public class ArticlePage  {

    Properties prop;
    private Page page;

    public ArticlePage(Page page)
    {
        this.page = page;
    }


    private String nameOfTheArticle =  "Name of article goes here...";



    public ArticlePage shareArticlePage(){
        return new ArticlePage(page);
    }

public void createArticle(){
        shareArticlePage();
        page.getByPlaceholder(nameOfTheArticle).click();
        page.getByPlaceholder(nameOfTheArticle).fill("Automation Article ");


}


}
