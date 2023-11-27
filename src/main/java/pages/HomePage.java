package pages;

import com.microsoft.playwright.Page;

import java.net.SocketTimeoutException;


public class HomePage  {
   private Page page;

   //Locators
   private String dmDeskIcon = ".dam-home-icon.hidden-sm.hidden-xs";

   private String genSearch = "#searchvalueinput";

   private String searchBtn = "#simple-search";

   private String serachedArticle = "a[title='automation article'] span[class='ng-binding ng-scope']";

   private String fullScreen= ".fullscreen-toggle";

   private String refreshBtn = "i[ng-show='!querying']";

   private String sysadminDD = ".dropdown-toggle.ng-binding";

   private String logoutOption = "a[x-ng-click='logout()']";
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

   public void clickFullScreenOption (){

      page.click(fullScreen);
      System.out.println("Full screen is visible...");
   }

   public void facetsAvailable(){
      page.isVisible(facetMenu);
   }

   public void foldersMenuAvilable(){
      page.isVisible(foldersMenu);

   }

   public void pseriesMenuAvilable(){
      page.isVisible(pSeriesMenu);

   }

   public void quriesMenuAvilable(){
      page.isVisible(quriesMenu);

   }

   public void schedulingMenuAvailable(){
      page.isVisible(schedulingMenu);

   }

   public void searchRefresh(){
      page.isVisible(schedulingMenu);

   }


   public String genericSearch(String articleName){
      page.fill(genSearch,articleName);
      page.click(searchBtn);
      //String searchData = page.textContent(serachedArticle);
      //page.locator(serachedArticle).waitFor();
      String searchData = page.textContent(serachedArticle);

      System.out.println("Searched content is :" + searchData);
      return searchData;

   }

   public void logoutFromSite (){
      page.click(sysadminDD);
      page.click(logoutOption);
   }

   public ArticlePage createNewArticle(){
      page.click(createNewDD);
      page.click(createArticle);
      return new ArticlePage(page) ;

   }





}
