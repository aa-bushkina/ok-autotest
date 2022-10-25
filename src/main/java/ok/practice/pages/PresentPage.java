package ok.practice.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import dev.failsafe.internal.util.Assert;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class PresentPage
{
  private static final By PRESENT_BUTTON = byXpath("//*[@data-l='ti,923978881408,t,present']");
  private static final By BY_BUTTON = byXpath("//*[contains(text(),'Подарить за 0 ОК')]");
  private static final By MESSAGE = byXpath("//*[contains(@class,'tico')]");

  public String getGiftMsg()
  {
    $(PRESENT_BUTTON).click();
    $(BY_BUTTON).click();
    return $(MESSAGE).getText();
  }
}
