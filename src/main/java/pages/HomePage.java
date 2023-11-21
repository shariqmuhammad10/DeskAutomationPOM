package pages;

import com.microsoft.playwright.Page;


public class HomePage  {
   private Page page;

   //Locators
   private String dmDeskIcon = ".dam-home-icon.hidden-sm.hidden-xs";
   private String noResultFoundText= "div[class='panel-body'] strong[class='ng-binding']";
   private String createNewDD = ".hidden-sm.hidden-md.ng-binding";

   private String createArticle= "//a[normalize-space()='Article']";
   private String createImage = "//a[normalize-space()='Image']";
   private String createPage= "//a[normalize-space()='Page']";
   private String facetMenu = "//span[normalize-space()='Facets']";

   private String foldersMenu = "//span[normalize-space()='Folders']";

   private String pSeriesMenu = "//span[normalize-space()='P-Series']";

   private String quriesMenu = "//span[normalize-space()='Queries']";

   private String schedulingMenu = "//span[normalize-space()='Scheduling']";


   public HomePage(Page page) {
      this.page = page;
   }


   // Actions
   public void checkDmDeskIconIsVisible() {
      page.isVisible(dmDeskIcon);

   }

   public ArticlePage createNewArticle(){
      page.click(createNewDD);
      page.click(createArticle);
      return new ArticlePage(page) ;

   }





}
