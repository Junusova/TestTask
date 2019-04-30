package testMethods;

import io.qameta.allure.Step;

import static pageObjects.LoginPageObjects.emailInput;
import static pageObjects.LoginPageObjects.loginButton;
import static pageObjects.LoginPageObjects.passwordInput;
import static testMethods.AssertMethods.clickOnElement;
import static testMethods.AssertMethods.sendKeysToElement;

public class AuthorizationMethods {

  public static String testAccount = "ckiber10@gmail.com";
  public static String testPassword = "911ckiber";

  @Step
  public static void loginSuccessful() {
    sendKeysToElement(emailInput, testAccount);
    sendKeysToElement(passwordInput, testPassword);
    clickOnElement(loginButton);
  }
}
