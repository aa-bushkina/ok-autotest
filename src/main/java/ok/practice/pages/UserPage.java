package ok.practice.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byXpath;

public class UserPage {

    private static SelenideElement dropMenu = $(byXpath("//span[@class = 'u-menu_a toggle-dropdown']"));
    private static SelenideElement givePresentBtn =
            $(byXpath("//a[@class = \"u-menu_a \" and contains(text(), \"подарок\")]"));

    public void pressGiftBtn () {
        dropMenu.click();
        givePresentBtn.click();
    }
}