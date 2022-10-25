package ok.practice;

import com.codeborne.selenide.Selenide;
import ok.practice.pages.LoginPage;
import ok.practice.pages.UserPage;
import org.testng.annotations.Test;

public class GiftTest
{
  final private String LogInUrl = "https://ok.ru/";
  final private String ValidUsername = "technoPol5";
  final private String ValidPassword = "technoPolis2022";

  @Test
  public void giveGiftTest()
  {
    Selenide.open(LogInUrl);
    new LoginPage().logIn(ValidUsername, ValidPassword);

    UserPage userPage = new UserPage();
    userPage.pressGiftBtn();

    //personalPage.logOut();
  }
}
