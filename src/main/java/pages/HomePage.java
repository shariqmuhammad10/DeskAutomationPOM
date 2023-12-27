package pages;

import com.microsoft.playwright.Page;



public class HomePage  {
   private Page page;

   //Locators
   private String dmDeskIcon = ".dam-home-icon.hidden-sm.hidden-xs";

   private String genSearchInput = "#searchvalueinput";

   private String genricSearchBtn = "#simple-search";

   private String searchRefreshPage = "#dam-refresh-button";

   private String searchBtnInAdvanceSearchDD = "span[ng-if='!editName']";

   private String advanceSearchDD = "#advanced-search";

   private String moreResultsBtn = "#laodMoreResultBtn";

   private String nameInAdvanceSearchDD = "input[placeholder='Name']";

   private String searchInHeadLineinAdvDD = "input[placeholder='Search in the headline']";

  // private String last7DayOptionInDD = "div[class='search-field ng-scope search-field-type-bool-radio search-field-attr-allarchive'] div[class='ng-scope'] div:nth-child(1) label:nth-child(1)";
   private String allDaysRadioInAdvSrchDD= "div[class='search-field ng-scope search-field-type-bool-radio search-field-attr-allarchive'] div:nth-child(2) label:nth-child(1)";

   private String serachedArticle = ".ng-binding.ng-scope[ng-if='text']";

   //private String serachedArticle = "a[title='automation article'] span[class='ng-binding ng-scope']";

   //.ng-binding.ng-scope[ng-if='text']

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


   private String foldermenuOptions = "#dropdownFoldersMenu";

   private String createNewFolderfromOptionList = "button[ng-click='addFolder(false)']";

   private String newFolderName = "The Folder Name";
   private String doneBtnForFolder = ".btn.btn-default.btn-primary.ng-binding";

   private String deskFolder = ".ng-binding.selected";


   public HomePage(Page page) {
      this.page = page;
   }


    public ArticlePage shareArticlePage(){
        return new ArticlePage(page);
    }

   // Actions
   public void checkDmDeskIconIsVisible() {
      page.isVisible(dmDeskIcon);

   }

   public void clickFullScreenOption (){

      page.click(fullScreen);
      System.out.println("Full screen is visible...");
   }

   public String facetsAvailable(){

      page.isVisible(facetMenu);
       String facetMenuText = page.textContent(facetMenu);
       System.out.println("Searched content is :" + facetMenuText);
       return facetMenuText;
   }

   public String searchArticleUsingAdvanceSearch (){
      page.click(advanceSearchDD);
      page.click(allDaysRadioInAdvSrchDD);
      page.click(nameInAdvanceSearchDD);
      page.fill(nameInAdvanceSearchDD,"Test");
      page.click(searchBtnInAdvanceSearchDD);
      String moreResults = page.textContent(moreResultsBtn);

      System.out.println("Searched content is :" + moreResults);
      return moreResults;

   }



   public String foldersMenuAvilable(){
      page.isVisible(foldersMenu);
       String folderMenuText = page.textContent(foldersMenu);
       System.out.println("Searched content is :" + folderMenuText);
       return folderMenuText;

   }

   public String pseriesMenuAvilable(){
      page.isVisible(pSeriesMenu);
       String pSeriesText = page.textContent(pSeriesMenu);
       System.out.println("Searched content is :" + pSeriesText);
       return pSeriesText;


   }

   public String quriesMenuAvilable(){
      page.isVisible(quriesMenu);
       String quriesMenuText = page.textContent(quriesMenu);
       System.out.println("Searched content is :" + quriesMenuText);
       return quriesMenuText;

   }

   public String schedulingMenuAvailable(){
      page.isVisible(schedulingMenu);
       String schedulingMenuText = page.textContent(schedulingMenu);
       System.out.println("Searched content is :" + schedulingMenuText);
       return schedulingMenuText;

   }

   public void searchRefresh(){
      page.isVisible(schedulingMenu);

   }


   public String genericSearch(String articleName){
      page.fill(genSearchInput,articleName);
      page.click(genricSearchBtn);
      page.click(searchRefreshPage);
      page.waitForTimeout(10000);
       //page.locator(articleName).waitFor();
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

   public ArticlePage navigateToCreateArticlePage(){
       page.click(createNewDD);
       page.click(createArticle);
       page = page.context().waitForPage(() -> {});
       return new ArticlePage(page) ;
   }

   public void createNewFolder(){
       page.click(foldersMenu);
       page.click(deskFolder);


       page.click(createNewFolderfromOptionList);
       page.getByPlaceholder(newFolderName);
       page.fill(newFolderName,"Auto Folder create");

       page.click(doneBtnForFolder);

   }




    public AddPagePage navigatetocreateNewPage() {
        page.click(createNewDD);
        page.click(createPage);
        page = page.context().waitForPage(() -> {});
        return new AddPagePage(page) ;

    }
}
