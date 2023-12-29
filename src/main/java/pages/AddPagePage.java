package pages;

import com.microsoft.playwright.Page;

public class AddPagePage {

    private Page page;

    private String customeField = "a[placeholder='Pub. Date'] span[class='select2-chosen']";

    private String calender = "span[class='fa fa-calendar']";

    private String profileInput = "a[placeholder='Profile'] span[class='select2-chosen']";

    private String editionsInput = "";

    private String zoneInput = " ";

    private String sectionInput = "";

    private String numberOfPagesInput = "";

    private String mergePagesCheck = "";

    private String selectNumberOfColumn = "";


    private String pageNumberInput = "";

    private String doneButton = "a[placeholder='Profile'] span[class='select2-chosen']";


    public AddPagePage(Page page)
    {
        this.page = page;
    }






}
