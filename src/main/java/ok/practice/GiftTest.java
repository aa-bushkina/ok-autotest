package ok.practice;

import com.codeborne.selenide.Selenide;

import ok.practice.pages.*;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class GiftTest extends BaseTest {

  final private String logInUrl = "https://ok.ru/";
  final private String validUsername = "technoPol5";
  final private String validPassword = "technoPolis2022";

  private LoginPage loginPage;
  private NewsPage newsPage;
  private UserPage userPage;
  private PresentPage presentPage;

  @Test
  public void giveGiftTest() {
    createPages();
    Selenide.open(logInUrl);
    loginPage = new LoginPage();
    loginPage.logIn(validUsername, validPassword);
    newsPage.findUser("technoPol17");
    userPage.pressGiftBtn();
    assertEquals(presentPage.present(), "Подарок отправлен");
  }

  private void createPages() {
    loginPage = new LoginPage();
    newsPage = new NewsPage();
    userPage = new UserPage();
    presentPage = new PresentPage();
  }
}
