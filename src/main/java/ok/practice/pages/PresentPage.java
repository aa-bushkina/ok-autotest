package ok.practice.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class PresentPage {
    private static final By PRESENT_BUTTON = byXpath("//a[@data-l='ti,923978881408,t,present']");
    private static final By BY_BUTTON = byXpath("//a[@class='js-submit-to-friend button-pro __ic']");

    public void present () {
        $(PRESENT_BUTTON).click();
        $(BY_BUTTON).click();
    }
}
