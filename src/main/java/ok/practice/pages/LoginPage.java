package ok.practice.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage
{
  private final String usernameBoxLoc = "//*[@name='st.email']";
  private final String passwordBoxLoc = "//*[@name='st.password']";
  private final String signInButtonLoc = "//*[@class='button-pro __wide']";
  private final String errorMessageLoc = "//*[@class='input-e login_error']";


  public void logIn(String username, String password)
  {
    $(byXpath(usernameBoxLoc)).val(username);
    $(byXpath(passwordBoxLoc)).val(password);
    $(byXpath(signInButtonLoc)).click();
  }

  public SelenideElement getLogInErrorMessage()
  {
    return $(byXpath(errorMessageLoc));
  }

  public SelenideElement getEnterButton()
  {
    return $(byXpath(signInButtonLoc));
  }
}
