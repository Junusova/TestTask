package pageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class LoginPageObjects {

  public static SelenideElement
  loginButton = $(byId("login")),
  emailInput = $(byId("user")),
  passwordInput = $(byId("password"));
}
