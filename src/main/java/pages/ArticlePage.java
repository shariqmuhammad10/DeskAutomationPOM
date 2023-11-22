package pages;

import com.microsoft.playwright.Page;

public class ArticlePage {

    private Page page;





/*
      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(" Create New...")).click();
      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Article")).first().click();
      page.getByPlaceholder("Name of article goes here...").click();
      page.getByPlaceholder("Name of article goes here...").fill("automation article ");
      page.frameLocator("iframe[title=\"Rich Text Editor\\, editor2\"]").getByRole(AriaRole.PARAGRAPH).click();
      page.frameLocator("iframe[title=\"Rich Text Editor\\, editor2\"]").locator("body").fill("This is Headline");
      page.frameLocator("iframe[title=\"Rich Text Editor\\, editor3\"]").getByRole(AriaRole.PARAGRAPH).click();
      page.frameLocator("iframe[title=\"Rich Text Editor\\, editor3\"]").locator("body").fill("This is subheading");
      page.frameLocator("iframe[title=\"Rich Text Editor\\, editor4\"]").getByRole(AriaRole.PARAGRAPH).click();
      page.frameLocator("iframe[title=\"Rich Text Editor\\, editor4\"]").locator("body").fill("This is body text and need to test only once related to automation article");
      page.getByText("Save Ctrl+S").first().click();*/


    //private String articleName = "#form-control-widget-?????"
    public ArticlePage(Page page)
    {
        this.page = page;
    }



}
