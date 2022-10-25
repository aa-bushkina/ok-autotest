package ok.practice;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import ok.practice.pages.OKLoginPage;
import ok.practice.pages.TestsData;
import org.asynchttpclient.util.Assertions;
import org.testng.annotations.Test;

public class GiftTest
{
  private final TestsData data = new TestsData();
  @Test
  public void giveGiftTest()
  {

    Selenide.open(data.LogInUrl);
    new OKLoginPage().logIn(data.ValidUsername, data.ValidPassword);

    /*OKPersonalPage personalPage = new OKPersonalPage();
    Assertions.assertEquals(data.LogInUrl, personalPage.getUrl());
    personalPage.getUserNickname().shouldHave(Condition.text(data.FIO));

    personalPage.logOut();*/
  }
}
