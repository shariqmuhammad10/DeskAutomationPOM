package pages;

import com.microsoft.playwright.Page;

public class HomePage {
   private Page page;

   //Locators
   public HomePage(Page page) {
      this.page = page;
   }


   // Actions
   public String getHomePageTitle() {
      String title = page.title();
      System.out.println("Page Title : " + title);
      return page.title();
   }

   public String getHomePageURL() {
      String url = page.url();
      System.out.println("Page URL : " + url);
      return page.url();
   }




}
