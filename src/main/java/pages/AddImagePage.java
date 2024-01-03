package pages;

import com.microsoft.playwright.Page;

import java.nio.file.Paths;

public class AddImagePage {

private Page page;


    private String addImage = "(//input[@type='file'])[1]";







    public AddImagePage(Page page) {

        this.page = page;
    }


    public void addImagetoArticle(){
        page.setInputFiles(addImage, Paths.get("D:\\ATEX\\AUTOMATION\\Desk_Playwright\\DeskAutomationPOM\\uploadImage"));
    }


}
