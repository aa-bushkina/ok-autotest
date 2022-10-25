package ok.practice.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import dev.failsafe.internal.util.Assert;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class PresentPage {
    private static final By PRESENT_BUTTON = byXpath("//div[@data-l='ti,923978881408,t,present']");
    private static final By BUY_BUTTON = byXpath("//*[@class='js-submit-to-friend button-pro __ic']");
    private static final By APPROVED_MSG = byXpath("//div[@class='send-present_sent-to-friend']//div");
    private static final By PAYMENT_FRAME = byXpath("//iframe[@class = 'modal-new_payment-frame']");

    public String present () {
        $(PRESENT_BUTTON).click();
        Selenide.switchTo().frame($(PAYMENT_FRAME));
        $(BUY_BUTTON).click();
        return $(APPROVED_MSG).getOwnText();
    }
}
